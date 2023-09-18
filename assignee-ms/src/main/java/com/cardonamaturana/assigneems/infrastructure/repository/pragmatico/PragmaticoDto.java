package com.cardonamaturana.assigneems.infrastructure.repository.pragmatico;


import com.cardonamaturana.assigneems.infrastructure.repository.employee.EmployeeDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@SuperBuilder
@Document
public class PragmaticoDto extends EmployeeDto {

  private String contractType;
  private String jobTittle;
  private String workEmail;
  private Long salary;

}