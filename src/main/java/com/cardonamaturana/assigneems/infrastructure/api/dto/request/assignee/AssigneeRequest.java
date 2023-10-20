package com.cardonamaturana.assigneems.infrastructure.api.dto.request.assignee;

public abstract class AssigneeRequest {

  protected String id;

  public AssigneeRequest() {
  }

  public AssigneeRequest(String id) {
    this.id = id;
  }
}