package com.gda.rest.services;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import com.gda.rest.controllers.MainController;
import com.gda.rest.repository.LogRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
public class MainControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private LogRepository logRepository;

  @MockBean
  private ResponseService responseService;

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
}
