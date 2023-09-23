package com.cardonamaturana.assigneems.infrastructure.api.dto.request.contributor;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString(callSuper = true)
public class ContributorRequest extends EmployeeRequest {

  @Schema(name = "serviceDescription",
      description = "Descripcion del servicio que presta : Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "Mantenimiento de pc",
      type = "text")
  private String serviceDescription;


  @Schema(name = "serviceEndDate",
      description = "Fecha de finalización del servicio: Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "2024-05-12",
      type = "Date")
  private Date serviceEndDate;


  @Schema(name = "totalServicePayment",
      description = "Valor monetario pagado por el servicio, sin puntos: Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "3000000",
      type = "Number")
  private Long totalServicePayment;

  @Schema(name = "currency",
      description = "Moneda en la que se realiza el pago: Campo opcional",
      accessMode = Schema.AccessMode.READ_WRITE,
      example = "COP",
      type = "Text")
  private String currency;

  public ContributorRequest() {

  }

  public ContributorRequest(String serviceDescription, Date serviceEndDate,
      Long totalServicePayment,
      String currency) {
    this.serviceDescription = serviceDescription;
    this.serviceEndDate = serviceEndDate;
    this.totalServicePayment = totalServicePayment;
    this.currency = currency;
  }

  public ContributorRequest(String fullName, String documentType, String documentNumber,
      String personalEmail, String companyId, String serviceDescription, Date serviceEndDate,
      Long totalServicePayment, String currency) {
    super(fullName, documentType, documentNumber, personalEmail, companyId);
    this.serviceDescription = serviceDescription;
    this.serviceEndDate = serviceEndDate;
    this.totalServicePayment = totalServicePayment;
    this.currency = currency;
  }

  public ContributorRequest(String id, String fullName, String documentType, String documentNumber,
      String personalEmail, String companyId, String serviceDescription, Date serviceEndDate,
      Long totalServicePayment, String currency) {
    super(id, fullName, documentType, documentNumber, personalEmail, companyId);
    this.serviceDescription = serviceDescription;
    this.serviceEndDate = serviceEndDate;
    this.totalServicePayment = totalServicePayment;
    this.currency = currency;
  }
}