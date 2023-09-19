package com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.assignee.AssigneeRequest;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class EmployeeRequest extends AssigneeRequest {

  private String fullName;
  private String documentType;
  private String documentNumber;
  private String personalEmail;
  private Company company;


  public EmployeeRequest() {
  }

  public EmployeeRequest(String fullName, String documentType, String documentNumber,
      String personalEmail, Company company) {
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.personalEmail = personalEmail;
    this.company = company;
  }
}