package com.cardonamaturana.assigneems.infrastructure.api.dto.request.assignee;

public abstract class AssigneeRequest {

  private String id;

  public AssigneeRequest() {
  }

  public AssigneeRequest(String id) {
    this.id = id;
  }
}