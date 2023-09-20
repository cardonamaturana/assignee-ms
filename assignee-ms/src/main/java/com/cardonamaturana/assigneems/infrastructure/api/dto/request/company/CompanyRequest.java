package com.cardonamaturana.assigneems.infrastructure.api.dto.request.company;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class CompanyRequest {

  @Schema(name = "name",
      description = "nombre de la empresa : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Pragma",
      type = "text")
  private String name;


  @Schema(name = "nit",
      description = "nit de la empresa : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "125487564-8",
      type = "text")
  private String nit;

  @Schema(name = "location",
      description = "ubicación de la empresa : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Cra 8 # 97-54",
      type = "text")
  private String location;


  public CompanyRequest() {
  }
  public CompanyRequest(String name, String nit, String location) {
    this.name = name;
    this.nit = nit;
    this.location = location;
  }

}