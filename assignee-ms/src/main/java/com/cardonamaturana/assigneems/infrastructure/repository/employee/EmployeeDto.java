package com.cardonamaturana.assigneems.infrastructure.repository.employee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.repository.AssigneeDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@SuperBuilder
@Document
public class EmployeeDto extends AssigneeDto {

  @Id
  private String id;
  private String fullName;
  private String documentType;
  private String documentNumber;
  private String personalEmail;
  private Company company;

}