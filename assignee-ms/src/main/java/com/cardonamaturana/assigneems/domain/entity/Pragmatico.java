package com.cardonamaturana.assigneems.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Pragmatico extends Employee {

  private String contractType;
  private String jobTittle;
  private String workEmail;
  private Long salary;

}