package com.cardonamaturana.assigneems.infrastructure.repository;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("assignee")
public abstract class AssigneeDto {

  public AssigneeDto() {
  }
}