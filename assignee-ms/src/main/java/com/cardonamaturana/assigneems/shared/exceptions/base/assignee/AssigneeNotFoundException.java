package com.cardonamaturana.assigneems.shared.exceptions.base.assignee;

import com.cardonamaturana.assigneems.shared.exceptions.base.BaseException;
import com.cardonamaturana.assigneems.shared.exceptions.base.ExceptionCode;
import org.springframework.http.HttpStatus;

public class AssigneeNotFoundException extends BaseException {

  public AssigneeNotFoundException() {
    super(false, HttpStatus.NOT_FOUND, ExceptionCode.ASSIGNEE_NOT_FOUND_EXCEPTION.getMessage(), ExceptionCode.ASSIGNEE_NOT_FOUND_EXCEPTION);
  }
}
