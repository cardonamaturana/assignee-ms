package com.cardonamaturana.assigneems.infrastructure.repository.employee;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.repository.AssigneeDto;
import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document("assignee")
public class EmployeeDto extends AssigneeDto {

  @Id
  private String id;
  private String fullName;
  private String documentType;
  private String documentNumber;
  private String personalEmail;
  private CompanyDto company;

  public EmployeeDto() {
  }

  public EmployeeDto(String id, String fullName, String documentType, String documentNumber,
      String personalEmail, CompanyDto company) {
    this.id = id;
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.personalEmail = personalEmail;
    this.company = company;
  }
}