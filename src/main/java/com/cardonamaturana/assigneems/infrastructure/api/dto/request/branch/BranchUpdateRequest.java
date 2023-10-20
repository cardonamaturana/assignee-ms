package com.cardonamaturana.assigneems.infrastructure.api.dto.request.branch;

import com.cardonamaturana.assigneems.infrastructure.api.dto.request.assignee.AssigneeRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString(callSuper = true)
public class BranchUpdateRequest extends AssigneeRequest {

  @Schema(name = "branchId",
      description = "id de la sede a actualizar : Campo obligatorio",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "8679d644-5f85-4be0-ba3c-6b97523d32d6",
      type = "text - Unique identifier format")
  @NotBlank(message = "id de la sede a actualizar : Campo obligatorio")
  private String branchId;


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

  public BranchUpdateRequest() {

  }

  public BranchUpdateRequest(String name, String city, String address) {
    this.name = name;
    this.city = city;
    this.address = address;
  }

  public BranchUpdateRequest(String id, String name, String city, String address) {
    super(id);
    this.name = name;
    this.city = city;
    this.address = address;
  }
}