package com.cardonamaturana.assigneems.domain.entity;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString(callSuper = true)
public class Contributor extends Employee {

  private String serviceDescription;
  private Date serviceEndDate;
  private Long totalServicePayment;
  private String currency;

  public Contributor() {

  }

  public Contributor(String serviceDescription, Date serviceEndDate, Long totalServicePayment,
      String currency) {
    this.serviceDescription = serviceDescription;
    this.serviceEndDate = serviceEndDate;
    this.totalServicePayment = totalServicePayment;
    this.currency = currency;
  }

  public Contributor(String fullName, String documentType, String documentNumber,
      String personalEmail, Company company, String serviceDescription, Date serviceEndDate,
      Long totalServicePayment, String currency) {
    super(fullName, documentType, documentNumber, personalEmail, company);
    this.serviceDescription = serviceDescription;
    this.serviceEndDate = serviceEndDate;
    this.totalServicePayment = totalServicePayment;
    this.currency = currency;
  }

  public Contributor(String id, String fullName, String documentType, String documentNumber,
      String personalEmail, Company company, String serviceDescription, Date serviceEndDate,
      Long totalServicePayment, String currency) {
    super(id, fullName, documentType, documentNumber, personalEmail, company);
    this.serviceDescription = serviceDescription;
    this.serviceEndDate = serviceEndDate;
    this.totalServicePayment = totalServicePayment;
    this.currency = currency;
  }
}