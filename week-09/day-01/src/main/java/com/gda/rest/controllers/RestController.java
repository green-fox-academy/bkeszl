package com.gda.rest.controllers;

import com.gda.rest.model.Error;
import com.gda.rest.model.Log;
import com.gda.rest.model.LogResponse;
import com.gda.rest.model.RequestArray;
import com.gda.rest.model.RequestArrayResult;
import com.gda.rest.repository.LogRepository;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {
  private LogRepository logRepository;

  @Autowired
  public RestController(LogRepository logRepository){
    this.logRepository = logRepository;
  }

  @PostMapping("/arrays")
  public ResponseEntity<?> arrays(@RequestBody RequestArray requestArray){
    if (requestArray.getNumbers() == null || requestArray.getWhat() == null){
      return new ResponseEntity<>(new Error(requestArray.getWhat() == null ?
          "Please provide what to do with the numbers!" : "Please provide numbers!"),
          HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<>(new RequestArrayResult(requestArray), HttpStatus.OK);
  }

  @GetMapping("/log")
  public ResponseEntity<?> log(){
    //Most of this should be in logservice
    List<Log> logEntries = new ArrayList<>();
    Spliterator<Log> spliterator = logRepository.findAll().spliterator();
    StreamSupport.stream(spliterator, false).sorted(Comparator.comparing(Log::getId)).forEach(logEntries::add);
    return new ResponseEntity<>(new LogResponse(logEntries), HttpStatus.OK);
  }
}
