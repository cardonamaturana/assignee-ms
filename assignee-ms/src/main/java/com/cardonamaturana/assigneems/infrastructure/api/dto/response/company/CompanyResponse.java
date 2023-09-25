package com.cardonamaturana.assigneems.infrastructure.api.dto.response.company;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class CompanyResponse {

  private String companyId;
  private String companyName;
  private String nit;
  private String location;
}