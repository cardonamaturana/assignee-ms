package com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.company.CompanyRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeRequest;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@JsonTypeName("pragmaticoRequest")
@Getter
@Setter
public class PragmaticoRequest extends EmployeeRequest {


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

  public PragmaticoRequest(){

  }

  public PragmaticoRequest( String contractType, String jobTittle, String workEmail,
      Long salary) {
    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }

  public PragmaticoRequest(String fullName, String documentType, String documentNumber,
      String personalEmail, CompanyRequest company, String contractType, String jobTittle,
      String workEmail, Long salary) {
    super(fullName, documentType, documentNumber, personalEmail, company);

    this.contractType = contractType;
    this.jobTittle = jobTittle;
    this.workEmail = workEmail;
    this.salary = salary;
  }
}
