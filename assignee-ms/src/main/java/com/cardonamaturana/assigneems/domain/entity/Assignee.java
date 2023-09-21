package com.cardonamaturana.assigneems.domain.entity;


import lombok.Data;

@Data
public abstract class Assignee {

  protected String id;
  public Assignee() {

  }

  public Assignee(String id) {
    this.id = id;
  }
}