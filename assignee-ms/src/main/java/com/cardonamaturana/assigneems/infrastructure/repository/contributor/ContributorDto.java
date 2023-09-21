package com.cardonamaturana.assigneems.infrastructure.repository.contributor;

import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyDto;
import com.cardonamaturana.assigneems.infrastructure.repository.employee.EmployeeDto;
import java.util.Date;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
public class ContributorDto extends EmployeeDto {

  private String serviceDescription;
  private Date serviceEndDate;
  private Long totalServicePayment;
  private String currency;

  public ContributorDto() {

  }

  public ContributorDto(String serviceDescription, Date serviceEndDate, Long totalServicePayment,
      String currency) {
    this.serviceDescription = serviceDescription;
    this.serviceEndDate = serviceEndDate;
    this.totalServicePayment = totalServicePayment;
    this.currency = currency;
  }

  public ContributorDto(String id, String fullName, String documentType, String documentNumber,
      String personalEmail, CompanyDto company,
      String serviceDescription, Date serviceEndDate, Long totalServicePayment, String currency) {
    super(id, fullName, documentType, documentNumber, personalEmail, company);
    this.serviceDescription = serviceDescription;
    this.serviceEndDate = serviceEndDate;
    this.totalServicePayment = totalServicePayment;
    this.currency = currency;
  }
}