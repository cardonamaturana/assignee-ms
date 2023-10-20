package com.cardonamaturana.assigneems.infrastructure.api.dto.response.branch;

import com.cardonamaturana.assigneems.infrastructure.api.dto.request.assignee.AssigneeRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.assignee.AssigneeResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString(callSuper = true)
public class BranchResponse extends AssigneeResponse {


  private String name;
  private String city;
  private String address;

  public BranchResponse() {

  }

  public BranchResponse(String name, String city, String address) {
    this.name = name;
    this.city = city;
    this.address = address;
  }

  public BranchResponse(String id, String name, String city, String address) {
    super(id);
    this.name = name;
    this.city = city;
    this.address = address;
  }
}