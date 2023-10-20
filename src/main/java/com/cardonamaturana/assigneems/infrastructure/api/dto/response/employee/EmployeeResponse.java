package com.cardonamaturana.assigneems.infrastructure.api.dto.response.employee;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.assignee.AssigneeResponse;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
public class EmployeeResponse extends AssigneeResponse {

  private String fullName;
  private String documentType;
  private String documentNumber;
  private String personalEmail;
  private Company company;


  public EmployeeResponse() {
  }

  public EmployeeResponse(String fullName, String documentType, String documentNumber,
      String personalEmail, Company company) {
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.personalEmail = personalEmail;
    this.company = company;
  }

  public EmployeeResponse(String id, String fullName, String documentType, String documentNumber,
      String personalEmail, Company company) {
    super(id);
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.personalEmail = personalEmail;
    this.company = company;
  }

}