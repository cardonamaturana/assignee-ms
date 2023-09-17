package com.cardonamaturana.assigneems.domain.entity;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public class Contributor extends Employee {

  private String serviceDescription;
  private Date serviceEndDate;
  private Long totalServicePayment;
  private String currency;

}