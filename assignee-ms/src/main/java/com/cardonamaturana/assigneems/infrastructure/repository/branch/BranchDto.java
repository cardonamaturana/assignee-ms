package com.cardonamaturana.assigneems.infrastructure.repository.branch;

import com.cardonamaturana.assigneems.infrastructure.repository.AssigneeDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Document
public class BranchDto extends AssigneeDto {

  @Id
  private String id;
  private String name;
  private String city;
  private String address;

  public BranchDto() {
  }

  public BranchDto(String id, String name, String city, String address) {
    this.id = id;
    this.name = name;
    this.city = city;
    this.address = address;
  }
}