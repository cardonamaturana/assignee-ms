package com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeRequest;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.Getter;
import lombok.Setter;

@JsonTypeName("pragmaticoRequest")
@Getter
@Setter
public class PragmaticoRequest extends EmployeeRequest {

  private String contractType;
  private String jobTittle;
  private String workEmail;
  private Long salary;

  public PragmaticoRequest(){

  }

  public PragmaticoRequest( String contractType, String jobTittle, String workEmail,
      Long salary) {
    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }

  public PragmaticoRequest(String fullName, String documentType, String documentNumber,
      String personalEmail, Company company, String contractType, String jobTittle,
      String workEmail, Long salary) {
    super(fullName, documentType, documentNumber, personalEmail, company);

    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }
}
