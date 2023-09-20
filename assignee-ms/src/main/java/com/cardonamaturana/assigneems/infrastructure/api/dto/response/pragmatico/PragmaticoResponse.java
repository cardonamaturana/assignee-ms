package com.cardonamaturana.assigneems.infrastructure.api.dto.response.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.employee.EmployeeResponse;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

@JsonTypeName("pragmaticoRequest")
@Getter
@Setter
public class PragmaticoResponse extends EmployeeResponse {

  private String contractType;
  private String jobTittle;
  private String workEmail;
  private Long salary;

  public PragmaticoResponse(){

  }

  public PragmaticoResponse( String contractType, String jobTittle, String workEmail,
      Long salary) {
    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }

  public PragmaticoResponse(String fullName, String documentType, String documentNumber,
      String personalEmail, Company company, String contractType, String jobTittle,
      String workEmail, Long salary) {
    super(fullName, documentType, documentNumber, personalEmail, company);

    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "PragmaticoResponse{" +
        "contractType='" + contractType + '\'' +
        ", jobTittle='" + jobTittle + '\'' +
        ", workEmail='" + workEmail + '\'' +
        ", salary=" + salary +
        '}';
  }
}
