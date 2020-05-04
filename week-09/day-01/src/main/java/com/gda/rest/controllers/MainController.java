package com.gda.rest.controllers;

import com.gda.rest.model.Appenda;
import com.gda.rest.model.DoUntill;
import com.gda.rest.model.DoUntillRequest;
import com.gda.rest.model.Error;
import com.gda.rest.model.Greeting;
import com.gda.rest.model.ValidResponse;
import com.gda.rest.services.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
  ResponseService responseService;

  @Autowired
  public MainController(ResponseService responseService){
    this.responseService = responseService;
  }

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

  @GetMapping("/greeter")
  public ResponseEntity<?> greeter(@RequestParam(required = false) String name,
                                   @RequestParam(required = false) String title)  {

    if (name == null || title ==null){
      return new ResponseEntity<>(responseService.greeterError(new Greeting(name, title)), HttpStatus.BAD_REQUEST);
    }
    return  new ResponseEntity<>(new Greeting(name, title), HttpStatus.OK);
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> appendA(@PathVariable String appendable) {
    return new ResponseEntity<>(new Appenda(appendable), HttpStatus.OK);
  }

  @GetMapping("/appenda/")
  public ResponseEntity<?> appendError() {
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntil(@PathVariable String action,
                                   @RequestBody DoUntillRequest doUntillRequest) {
    if (doUntillRequest.getUntil() == null) {
      return new ResponseEntity<>(new Error("Please provide a number!"), HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<>(new DoUntill(doUntillRequest.getUntil(), action), HttpStatus.OK);
  }
}
