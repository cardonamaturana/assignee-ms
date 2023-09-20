package com.cardonamaturana.assigneems.infrastructure.repository;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("assignee")
@TypeAlias("assignee")
public abstract class AssigneeDto {

  public AssigneeDto() {
  }
}