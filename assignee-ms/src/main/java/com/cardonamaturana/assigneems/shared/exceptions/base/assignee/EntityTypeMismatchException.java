package com.cardonamaturana.assigneems.shared.exceptions.base.assignee;

import com.cardonamaturana.assigneems.shared.exceptions.base.BaseException;
import com.cardonamaturana.assigneems.shared.exceptions.base.ExceptionCode;
import org.springframework.http.HttpStatus;

public class EntityTypeMismatchException extends BaseException {

  public EntityTypeMismatchException() {
    super(false, HttpStatus.NOT_FOUND, ExceptionCode.ENTITY_TYPE_MISMATCH.getMessage(),
        ExceptionCode.ENTITY_TYPE_MISMATCH);
  }
}
