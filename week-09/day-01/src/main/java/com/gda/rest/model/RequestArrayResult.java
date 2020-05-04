package com.gda.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;


public class RequestArrayResult {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("result")
  private Integer resultOne;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @JsonProperty("Result")
  private Object[] resultArray;

  public RequestArrayResult(RequestArray requestArray){
    if(requestArray.getWhat().equals("sum")){
      this.resultOne = Arrays.stream(requestArray.getNumbers()).mapToInt(Integer::intValue).sum();
      this.resultArray = null;
    }
    if(requestArray.getWhat().equals("multiply")){
      this.resultOne = Arrays.stream(requestArray.getNumbers())
          .mapToInt(Integer::intValue).reduce(1, (a, b) -> a * b);
      this.resultArray = null;
    }
    if(requestArray.getWhat().equals("double")){
      this.resultArray = Arrays.stream(requestArray.getNumbers()).map(number -> number*2).toArray();
      this.resultOne = null;
    }
  }

  public RequestArrayResult() {
  }

  public Integer getResultOne() {
    return resultOne;
  }

  public void setResultOne(Integer resultOne) {
    this.resultOne = resultOne;
  }

  public Object[] getResultArray() {
    return resultArray;
  }

  public void setResultArray(Object[] resultArray) {
    this.resultArray = resultArray;
  }
}
