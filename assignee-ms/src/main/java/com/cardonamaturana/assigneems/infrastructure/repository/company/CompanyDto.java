package com.cardonamaturana.assigneems.infrastructure.repository.company;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("companies")
public class CompanyDto {

  @Id
  private String id;
  private String name;
  private String nit;
  private String location;

  public CompanyDto() {
  }

  public CompanyDto(String id, String name, String nit, String location) {
    this.id = id;
    this.name = name;
    this.nit = nit;
    this.location = location;
  }
}