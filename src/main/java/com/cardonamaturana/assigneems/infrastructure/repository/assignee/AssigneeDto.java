package com.cardonamaturana.assigneems.infrastructure.repository.assignee;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("assignees")
@Data
public abstract class AssigneeDto {

  @Id
  protected String id;

  public AssigneeDto() {
  }

  public AssigneeDto(String id) {
    this.id = id;
  }
}