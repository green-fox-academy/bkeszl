package com.gda.rest;

import com.gda.rest.model.Error;
import com.gda.rest.services.ResponseService;
import com.gda.rest.services.ResponseServiceImpl;
import org.junit.Assert;
import org.junit.Test;


public class ResponseServiceTest {

  @Test
  public void cantDoubleNothingShouldReturnErrorWithDefaultErrorString() {
    //Arrange
    ResponseServiceImpl reponseService = new ResponseServiceImpl();
    Error testError = new Error();

    //Act
    Error error = reponseService.cantDoubleNothing();

    //Assert
    Assert.assertSame(testError.getError(), error.getError());
  }
}
