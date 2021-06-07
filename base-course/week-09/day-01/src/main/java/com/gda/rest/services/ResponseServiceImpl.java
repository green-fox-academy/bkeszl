package com.gda.rest.services;

import com.gda.rest.model.Error;
import com.gda.rest.model.Greeting;
import com.gda.rest.model.ValidResponse;
import org.springframework.stereotype.Service;

@Service
public class ResponseServiceImpl implements ResponseService {
  @Override
  public ValidResponse doubleInput(Integer input) {
    return new ValidResponse(input);
  }

  @Override
  public Error cantDoubleNothing() {
    return new Error();
  }

  @Override
  public Error greeterError(Greeting greeting) {
    if (greeting.getName() == null && greeting.getTitle() == null) {
      return new Error("Please provide a name and a title!");
    } else if (greeting.getTitle() == null){
      return new Error("Please provide a title!");
    } else if (greeting.getName() == null) {
      return new Error("Please provide a name!");
    }
    return new Error();
  }
}
