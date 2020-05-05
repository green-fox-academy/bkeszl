package com.gda.rest.controllers;

import com.gda.rest.model.Appenda;
import com.gda.rest.model.DoUntill;
import com.gda.rest.model.DoUntillRequest;
import com.gda.rest.model.Error;
import com.gda.rest.model.Greeting;
import com.gda.rest.model.Log;
import com.gda.rest.model.ValidResponse;
import com.gda.rest.repository.LogRepository;
import com.gda.rest.services.ResponseService;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  ResponseService responseService;
  LogRepository logRepository;
  Gson gson = new Gson();

  @Autowired
  public MainController(ResponseService responseService, LogRepository logRepository){
    this.responseService = responseService;
    this.logRepository =logRepository;
  }

  @GetMapping("/")
  public String renderIndex(){
    return "index";
  }

  @GetMapping("/doubling")
  public ResponseEntity<?> doubledInput(@RequestParam(required = false) Integer input){
    ResponseEntity<?> response;

    if (input == null) {
      Error error = new Error();
      response = new ResponseEntity<>(error, HttpStatus.OK);
      logRepository.save(new Log("/doubling", "Error" ));
      return response;
    }
    ValidResponse validResponse = new ValidResponse(input);
    response =  new ResponseEntity<>(validResponse, HttpStatus.OK);
    logRepository.save(new Log("/doubling", "input=" + input));
    return response;
  }

  @GetMapping("/greeter")
  public ResponseEntity<?> greeter(@RequestParam(required = false) String name,
                                   @RequestParam(required = false) String title,
                                   HttpServletRequest httpServletRequest)  {

    if (name == null || title ==null){
      logRepository.save(new Log("/greeter", gson.toJson(httpServletRequest.getParameterMap())));
      return new ResponseEntity<>(responseService.greeterError(new Greeting(name, title)), HttpStatus.BAD_REQUEST);
    }
    logRepository.save(new Log("/greeter", gson.toJson(httpServletRequest.getParameterMap())));
    return  new ResponseEntity<>(new Greeting(name, title), HttpStatus.OK);
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> appendA(@PathVariable String appendable) {
    logRepository.save(new Log("/appenda/{appendable}", appendable ));
    return new ResponseEntity<>(new Appenda(appendable), HttpStatus.OK);
  }

  @GetMapping("/appenda/")
  public ResponseEntity<?> appendError() {
    logRepository.save(new Log("/appenda","No appendable" ));
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntil(@PathVariable String action,
                                   @RequestBody DoUntillRequest doUntillRequest,
                                    HttpServletRequest httpServletRequest) {
    if (doUntillRequest.getUntil() == null) {
      logRepository.save(new Log("/dountil/{action}", gson.toJson(httpServletRequest.getParameterMap())));
      return new ResponseEntity<>(new Error("Please provide a number!"), HttpStatus.BAD_REQUEST);
    }
    HashMap<String, String> inputData = new HashMap<String, String>();
    inputData.put("action", action);
    inputData.put("request_body", gson.toJson(doUntillRequest));

    logRepository.save(new Log("/dountil/{action}", gson.toJson(inputData)));
    return new ResponseEntity<>(new DoUntill(doUntillRequest.getUntil(), action), HttpStatus.OK);
  }
}
