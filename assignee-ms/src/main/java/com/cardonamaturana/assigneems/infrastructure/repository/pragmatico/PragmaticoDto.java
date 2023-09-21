package com.cardonamaturana.assigneems.infrastructure.repository.pragmatico;


import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyDto;
import com.cardonamaturana.assigneems.infrastructure.repository.employee.EmployeeDto;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
public class PragmaticoDto extends EmployeeDto {

  private String contractType;
  private String jobTittle;
  private String workEmail;
  private Long salary;

  public PragmaticoDto() {

  }

  public PragmaticoDto(String contractType, String jobTittle, String workEmail, Long salary) {
    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }

  public PragmaticoDto(String id, String fullName, String documentType, String documentNumber,
      String personalEmail, CompanyDto company,
      String contractType, String jobTittle, String workEmail, Long salary) {
    super(id, fullName, documentType, documentNumber, personalEmail, company);
    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }
}