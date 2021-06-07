package com.gda.rest.services;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



import com.gda.rest.controllers.MainController;
import com.gda.rest.model.DoUntillRequest;
import com.gda.rest.model.Error;
import com.gda.rest.model.Greeting;
import com.gda.rest.repository.LogRepository;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
@AutoConfigureMockMvc
public class MainControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  ResponseService mockResponseService;

  @MockBean
  LogRepository logRepository;

  @Test
  public void doublingSuccessfull() throws Exception {
    mockMvc.perform(get("/doubling/?input=5"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.received", is(5)))
        .andExpect(jsonPath("$.result", is(10)));
  }

  @Test
  public void doublingWithoutInputReturnsError() throws Exception {
    mockMvc.perform(get("/doubling"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }

  @Test
  public void greetingWithoutParametersReturnsError() throws Exception {
    when(mockResponseService.greeterError(any(Greeting.class))).thenReturn(new Error("Please provide a name and a title"));
    mockMvc.perform(get("/greeter"))
        .andExpect(status().is(400))
        .andExpect(jsonPath("$.error", is("Please provide a name and a title")));
  }

  @Test
  public void greetingWitOneOnlyNameReturnsError() throws Exception {
    when(mockResponseService.greeterError(any(Greeting.class))).thenReturn(new Error("Please provide a title!"));
    mockMvc.perform(get("/greeter?name=Barna"))
        .andExpect(jsonPath("$.error", is("Please provide a title!")))
        .andExpect(status().is(400));
  }

  @Test
  public void greetingWithBothReturnsCorrectGreeting() throws Exception {
    mockMvc.perform(get("/greeter?name=Barna&title=friend"))
        .andExpect(status().is(200))
        .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Barna, my dear friend!")));
  }

  @Test
  public void appendaReturnsWithCorrectAppendedString() throws Exception {
    mockMvc.perform(get("/appenda/tuny"))
        .andExpect(status().is(200))
        .andExpect(jsonPath("$.appended", is("tunya")));
  }

  @Test
  public void doUntillWithSumReturnsCorrectResult() throws Exception {
    DoUntillRequest toSend = new DoUntillRequest(5);
    Gson gson = new Gson();
    String json = gson.toJson(toSend);

    mockMvc.perform(post("/dountil/sum").contentType(MediaType.APPLICATION_JSON).content(json))
        .andExpect(status().is(200))
        .andExpect(jsonPath("$.result", is(15)));
  }

  @Test
  public void doUntillWithFactorReturnsCorrectResult() throws Exception {
    DoUntillRequest toSend = new DoUntillRequest(5);
    Gson gson = new Gson();
    String json = gson.toJson(toSend);

    mockMvc.perform(post("/dountil/factor").contentType(MediaType.APPLICATION_JSON).content(json))
        .andExpect(status().is(200))
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.result", is(120)));
  }
}
