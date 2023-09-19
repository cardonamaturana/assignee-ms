package com.cardonamaturana.assigneems.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Company {


  private String name;
  private String nit;
  private String location;


  public Company() {
  }
  public Company(String name, String nit, String location) {
    this.name = name;
    this.nit = nit;
    this.location = location;
  }

}