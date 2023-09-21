package com.cardonamaturana.assigneems.domain.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class Pragmatico extends Employee {

  private String contractType;
  private String jobTittle;
  private String workEmail;
  private Long salary;
  //TODO: REFACTOR FORM PRAGMATICO TO PRAMATIC

  public Pragmatico() {

  }

  public Pragmatico(String contractType, String jobTittle, String workEmail, Long salary) {
    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }

  public Pragmatico(String fullName, String documentType, String documentNumber,
      String personalEmail,
      Company company, String contractType, String jobTittle, String workEmail, Long salary) {
    super(fullName, documentType, documentNumber, personalEmail, company);
    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }

}