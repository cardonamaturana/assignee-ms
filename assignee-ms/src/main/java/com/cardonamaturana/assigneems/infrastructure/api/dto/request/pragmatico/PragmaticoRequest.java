package com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Employee;
import lombok.Data;

@Data
public class PragmaticoRequest {

  private Employee employee;
  private String contractType;
  private String jobTittle;
  private String workEmail;
  private Long salary;
}
