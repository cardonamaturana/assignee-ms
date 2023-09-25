package com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee;

import com.cardonamaturana.assigneems.infrastructure.api.dto.request.assignee.AssigneeRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class EmployeeRequest extends AssigneeRequest {

  @Schema(name = "fullName",
      description = "nombre completo : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Julio Cesar Cardona Maturana",
      type = "text")
  private String fullName;


  @Schema(name = "documentType",
      description = "tipo de documento: Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "CC",
      type = "text")
  private String documentType;


  @Schema(name = "documentNumber",
      description = "numero de documento: Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "1067946296",
      type = "text")
  private String documentNumber;


  @Schema(name = "personalEmail",
      description = "correo electrónico personal : Campo obligatorio",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "cardona.maturana@gmail.com",
      type = "text")
  @NotBlank(message = "correo electrónico personal : Dato obligatorio")
  private String personalEmail;


  @Schema(name = "companyId",
      description = "id de la empresa: Campos opcionales",
      accessMode = Schema.AccessMode.READ_WRITE,
      type = "text")
  private String companyId;


  public EmployeeRequest() {
  }

  public EmployeeRequest(String fullName, String documentType, String documentNumber,
      String personalEmail, String companyId) {
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.personalEmail = personalEmail;
    this.companyId = companyId;
  }

  public EmployeeRequest(String id, String fullName, String documentType, String documentNumber,
      String personalEmail, String company) {
    super(id);
    this.fullName = fullName;
    this.documentType = documentType;
    this.documentNumber = documentNumber;
    this.personalEmail = personalEmail;
    this.companyId = companyId;
  }
}