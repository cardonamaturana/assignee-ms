package com.cardonamaturana.assigneems.infrastructure.repository.pragmatico;


import com.cardonamaturana.assigneems.infrastructure.repository.employee.EmployeeDto;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@SuperBuilder
@Document
public class PragmaticoDto extends EmployeeDto {

  @Id
  private String id;
  private String contractType;
  private String jobTittle;
  private String workEmail;
  private Long salary;

}