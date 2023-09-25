package com.cardonamaturana.assigneems.infrastructure.api.dto.request.company;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class CompanyUpdateRequest {


  @Schema(name = "companyId",
      description = "id de la empresa a actualizar : Campo obligatorio",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "8679d644-5f85-4be0-ba3c-6b97523d32d6",
      type = "text - Unique identifier format")
  @NotBlank(message = "id de la empresa a actualizar : Campo obligatorio")
  private String companyId;


  @Schema(name = "companyName",
      description = "Nombre de la empresa : Campo obligatorio",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Help Center",
      type = "text")
  @NotBlank(message = "Nombre de la empresa : Campo obligatorio")
  private String companyName;


  @Schema(name = "nit",
      description = "Nit de la empresa: Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "8587967554-9",
      type = "text")
  private String nit;


  @Schema(name = "location",
      description = "Ubicación de la empresa : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Cra Siempre Viva #32-54",
      type = "text")
  private String location;
}