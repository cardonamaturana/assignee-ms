package com.cardonamaturana.assigneems.infrastructure.repository.contributor;

import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.infrastructure.repository.employee.EmployeeDto;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@SuperBuilder
@Getter
@Setter
@Document
public class ContributorDto extends EmployeeDto {

  @Id
  private String id;
  private String serviceDescription;
  private Date serviceEndDate;
  private Long totalServicePayment;
  private String currency;

}