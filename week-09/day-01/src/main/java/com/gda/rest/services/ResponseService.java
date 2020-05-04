package com.gda.rest.services;

import com.gda.rest.model.Error;
import com.gda.rest.model.Greeting;
import com.gda.rest.model.ValidResponse;
import org.springframework.stereotype.Service;

@Service
public interface ResponseService {
  ValidResponse doubleInput(Integer input);
  Error cantDoubleNothing();
  Error greeterError(Greeting greeting);
}
