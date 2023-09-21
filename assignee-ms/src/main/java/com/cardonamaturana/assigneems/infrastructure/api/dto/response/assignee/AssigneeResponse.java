package com.cardonamaturana.assigneems.infrastructure.api.dto.response.assignee;

import lombok.Data;

@Data
public class AssigneeResponse {

  private String id;

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