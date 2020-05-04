package com.gda.rest.controllers;

import com.gda.rest.model.Error;
import com.gda.rest.model.ValidResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String renderIndex(){
    return "index";
  }

  @GetMapping("/doubling")
  public ResponseEntity<?> doubledInput(@RequestParam(required = false) Integer input){
    if (input == null) {
      return new ResponseEntity<>(new Error(), HttpStatus.OK);
    }
    return new ResponseEntity<>(new ValidResponse(input), HttpStatus.OK);
  }
}
