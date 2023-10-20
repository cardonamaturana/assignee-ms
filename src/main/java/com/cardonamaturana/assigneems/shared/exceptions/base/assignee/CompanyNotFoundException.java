package com.cardonamaturana.assigneems.shared.exceptions.base.assignee;

import com.cardonamaturana.assigneems.shared.exceptions.base.BaseException;
import com.cardonamaturana.assigneems.shared.exceptions.base.ExceptionCode;
import org.springframework.http.HttpStatus;

public class CompanyNotFoundException extends BaseException {

  public CompanyNotFoundException() {
    super(false, HttpStatus.NOT_FOUND, ExceptionCode.COMPANY_NOT_FOUND.getMessage(),
        ExceptionCode.COMPANY_NOT_FOUND);
  }
}
