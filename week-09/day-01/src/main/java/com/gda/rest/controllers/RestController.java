package com.gda.rest.controllers;

import com.gda.rest.model.Error;
import com.gda.rest.model.RequestArray;
import com.gda.rest.model.RequestArrayResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  @PostMapping("/arrays")
  public ResponseEntity<?> arrays(@RequestBody RequestArray requestArray){
    if (requestArray.getNumbers() == null || requestArray.getWhat() == null){
      return new ResponseEntity<>(new Error(requestArray.getWhat() == null ?
          "Please provide what to do with the numbers!" : "Please provide numbers!"),
          HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity<>(new RequestArrayResult(requestArray), HttpStatus.OK);
  }
}
