package com.gda.rest.model;

import com.google.gson.JsonElement;
import java.util.List;

public class LogResponse {
  private List<Log> entries;
  private int entryCount;

  public LogResponse() {
  }

  public LogResponse(List<Log> entries) {
    this.entries = entries;
    this.entryCount = this.entries.size();
  }

  public List<Log> getEntries() {
    return entries;
  }

  public void setEntries(List<Log> entries) {
    this.entries = entries;
  }

  public int getEntryCount() {
    return entryCount;
  }

  public void setEntryCount(int entryCount) {
    this.entryCount = entryCount;
  }
}
