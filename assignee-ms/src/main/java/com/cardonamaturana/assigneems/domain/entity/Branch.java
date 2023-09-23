package com.cardonamaturana.assigneems.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString(callSuper = true)
public class Branch extends Assignee {

  private String name;
  private String city;
  private String address;

  public Branch() {

  }

  public Branch(String name, String city, String address) {
    this.name = name;
    this.city = city;
    this.address = address;
  }

  public Branch(String id, String name, String city, String address) {
    super(id);
    this.name = name;
    this.city = city;
    this.address = address;
  }
}