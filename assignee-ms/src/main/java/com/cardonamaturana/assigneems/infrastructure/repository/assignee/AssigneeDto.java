package com.cardonamaturana.assigneems.infrastructure.repository.assignee;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("assignee")
public abstract class AssigneeDto {

  private String id;

  public AssigneeDto() {
  }

  public AssigneeDto(String id) {
    this.id = id;
  }
}