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
@ToString
public class Employee extends Assignee {

  private String fullName;
  private String documentType;
  private String documentNumber;
  private String personalEmail;
  private Company company;

}