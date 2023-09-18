package com.cardonamaturana.assigneems.domain.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class Pragmatico extends Employee {

  private String contractType;
  private String jobTittle;
  private String workEmail;
  private Long salary;
  //TODO: REFACTOR FORM PRAGMATICO TO PRAMATIC

}