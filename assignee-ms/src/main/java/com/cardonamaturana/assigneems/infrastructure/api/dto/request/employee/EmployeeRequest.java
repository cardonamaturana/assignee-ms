package com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.assignee.AssigneeRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class EmployeeRequest extends AssigneeRequest {

  private String fullName;
  private String documentType;
  private String documentNumber;
  private String personalEmail;
  private Company company;


}