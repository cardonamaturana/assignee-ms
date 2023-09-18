package com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeRequest;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@JsonTypeName("pragmaticoRequest")
@Getter
@Setter
public class PragmaticoRequest extends EmployeeRequest {

  private String type;
  private String contractType;
  private String jobTittle;
  private String workEmail;
  private Long salary;

}
