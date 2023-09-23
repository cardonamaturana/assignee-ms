package com.cardonamaturana.assigneems.domain.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString(callSuper = true)
public class Employee extends Assignee {

  private String fullName;
  private String documentType;
  private String documentNumber;
  private String personalEmail;
  private Company company;

  public Employee() {
  }

  public Employee(String fullName, String documentType, String documentNumber, String personalEmail,
      Company company) {
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.personalEmail = personalEmail;
    this.company = company;
  }

  public Employee(String id, String fullName, String documentType, String documentNumber,
      String personalEmail, Company company) {
    super(id);
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.personalEmail = personalEmail;
    this.company = company;
  }
}