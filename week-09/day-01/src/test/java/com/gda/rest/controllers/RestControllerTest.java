package com.gda.rest.controllers;

import static org.junit.jupiter.api.Assertions.*;


import com.gda.rest.model.Log;
import com.gda.rest.model.RequestArray;
import com.gda.rest.repository.LogRepository;
import com.gda.rest.services.ResponseService;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
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
@WebMvcTest(RestController.class)
@AutoConfigureMockMvc
class RestControllerTest {

  @MockBean
  LogRepository logRepository;

  @Autowired
  MockMvc mockMvc;

  @Test
  void arraysWithSumReturnSum() throws Exception {
    String sum = "sum";
    Integer[] intArray  = {1,2,3,7};
    RequestArray requestArray =new RequestArray(sum, intArray);
    Gson gson = new Gson();
    String json = gson.toJson(requestArray);

    mockMvc.perform(post("/arrays").contentType(MediaType.APPLICATION_JSON_UTF8).content(json))
        .andExpect(status().is(200))
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.result", is(13)));
  }

  @Test
  void arraysWithMultiplyReturnMultipliedAmount() throws Exception {
    String sum = "multiply";
    Integer[] intArray  = {1,2,3,7};
    RequestArray requestArray =new RequestArray(sum, intArray);
    Gson gson = new Gson();
    String json = gson.toJson(requestArray);

    mockMvc.perform(post("/arrays").contentType(MediaType.APPLICATION_JSON_UTF8).content(json))
        .andExpect(status().is(200))
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.result", is(42)));
  }

  @Test
  void arraysWithDoubleReturnArrayWithDoubledNumbers() throws Exception {
    String sum = "double";
    Integer[] intArray  = {1,2,3,7};
    RequestArray requestArray =new RequestArray(sum, intArray);
    Gson gson = new Gson();
    String json = gson.toJson(requestArray);

    mockMvc.perform(post("/arrays").contentType(MediaType.APPLICATION_JSON_UTF8).content(json))
        .andExpect(status().is(200))
        .andExpect(content().contentType(MediaType.APPLICATION_JSON))
        .andExpect(jsonPath("$.Result", Matchers.contains(2, 4, 6, 14)));
  }

  @Test
  void logReturnsLogEntries() throws Exception {
    List<Log> logEntries = new ArrayList<>();
    logEntries.add(new Log("/doubling", "Error"));
    Mockito.when(logRepository.findAll()).thenReturn(logEntries);
    //logEntries.add(new Log("/doubling", "input=5"));
    mockMvc.perform(get("/doubling"));
    mockMvc.perform(get("/log")).andExpect(status().is(200))
        .andExpect(jsonPath("$.entries[0].data", is("Error")));
  }

  @Test
  void sithSpeak() {
  }
}