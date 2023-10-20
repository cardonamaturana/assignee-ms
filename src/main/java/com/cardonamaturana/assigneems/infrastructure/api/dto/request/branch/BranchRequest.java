package com.cardonamaturana.assigneems.infrastructure.api.dto.request.branch;

import com.cardonamaturana.assigneems.infrastructure.api.dto.request.assignee.AssigneeRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString(callSuper = true)
public class BranchRequest extends AssigneeRequest {

  @Schema(name = "name",
      description = "nombre de la sede : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Sede el mirador de las flores - branch",
      type = "text")
  private String name;


  @Schema(name = "city",
      description = "ciudad donde se encuentra la sede : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Medellín",
      type = "text")
  private String city;


  @Schema(name = "address",
      description = "direccion de la sede : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Cra 87 # 47-25",
      type = "text")
  private String address;

  public BranchRequest() {

  }

  public BranchRequest(String name, String city, String address) {
    this.name = name;
    this.city = city;
    this.address = address;
  }

  public BranchRequest(String id, String name, String city, String address) {
    super(id);
    this.name = name;
    this.city = city;
    this.address = address;
  }
}