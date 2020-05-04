package com.gda.rest.services;

import com.gda.rest.model.Error;
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
}
