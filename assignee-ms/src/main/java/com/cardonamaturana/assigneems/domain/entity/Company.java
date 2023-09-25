package com.cardonamaturana.assigneems.domain.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Company {

  private String id;
  private String name;
  private String nit;
  private String location;
}