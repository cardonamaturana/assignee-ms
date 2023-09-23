package com.cardonamaturana.assigneems.infrastructure.api.dto.response.assignee;

import lombok.Data;

@Data
public abstract class AssigneeResponse {

  protected String id;

  public AssigneeResponse() {
  }

  public AssigneeResponse(String id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "AssigneeResponse{}";
  }
}