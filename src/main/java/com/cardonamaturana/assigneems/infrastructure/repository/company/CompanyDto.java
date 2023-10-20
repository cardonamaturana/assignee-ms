package com.cardonamaturana.assigneems.infrastructure.repository.company;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document("companies")
@TypeAlias("CompanyDto")
public class CompanyDto {

  @Id
  private String id;
  private String name;
  private boolean state = true;
  private String nit;
  private String location;
}