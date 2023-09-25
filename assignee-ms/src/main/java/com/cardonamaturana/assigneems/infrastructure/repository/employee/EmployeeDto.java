package com.cardonamaturana.assigneems.infrastructure.repository.employee;

import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeDto;
import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyDto;
import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.index.Indexed;


@Data
@TypeAlias("EmployeeDto")
public class EmployeeDto extends AssigneeDto {

  private String fullName;
  private String documentType;
  private String documentNumber;
  @Indexed(unique = true)
  private String personalEmail;
  private CompanyDto company;

  public EmployeeDto() {
  }

  public EmployeeDto(String fullName, String documentType, String documentNumber,
      String personalEmail, CompanyDto company) {
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.personalEmail = personalEmail;
    this.company = company;
  }

  public EmployeeDto(String id, String fullName, String documentType, String documentNumber,
      String personalEmail, CompanyDto company) {
    super(id);
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.personalEmail = personalEmail;
    this.company = company;
  }
}