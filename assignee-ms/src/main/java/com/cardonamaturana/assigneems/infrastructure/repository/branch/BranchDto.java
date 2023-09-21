package com.cardonamaturana.assigneems.infrastructure.repository.branch;

import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeDto;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
public class BranchDto extends AssigneeDto {

  private String name;
  private String city;
  private String address;

  public BranchDto() {
  }

  public BranchDto(String name, String city, String address) {
    this.name = name;
    this.city = city;
    this.address = address;
  }

  public BranchDto(String id, String name, String city, String address) {
    super(id);
    this.name = name;
    this.city = city;
    this.address = address;
  }
}