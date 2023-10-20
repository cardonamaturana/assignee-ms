package com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeRequest;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@JsonTypeName("pragmaticoRequest")
@Getter
@Setter
public class PragmaticoUpdateRequest extends EmployeeRequest {

  @Schema(name = "pragmaticoId",
      description = "id del pragmatico a actualizar : Campo obligatorio",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "8679d644-5f85-4be0-ba3c-6b97523d32d6",
      type = "text - Unique identifier format")
  @NotBlank(message = "id del pragmatico a actualizar : Campo obligatorio")
  private String pragmaticoId;



  @Schema(name = "contractType",
      description = "tipo de contrato que tiene en la empresa : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Indefinido",
      type = "text")
  private String contractType;


  @Schema(name = "jobTittle",
      description = "cargo que tiene en la empresa : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Backend developer",
      type = "text")
  private String jobTittle;


  @Schema(name = "workEmail",
      description = "correo electronico que tiene con dominio de la empresa : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "jcardona@pragma.com.co",
      type = "text")
  private String workEmail;


  @Schema(name = "salary",
      description = "salario que devenga en la empresa : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "5500000",
      type = "number")
  private Long salary;

  public PragmaticoUpdateRequest() {

  }

  public PragmaticoUpdateRequest(String contractType, String jobTittle, String workEmail,
      Long salary) {
    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }

  public PragmaticoUpdateRequest(String fullName, String documentType, String documentNumber,
      String personalEmail, String companyId, String contractType, String jobTittle,
      String workEmail, Long salary) {
    super(fullName, documentType, documentNumber, personalEmail, companyId);

    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }
}
