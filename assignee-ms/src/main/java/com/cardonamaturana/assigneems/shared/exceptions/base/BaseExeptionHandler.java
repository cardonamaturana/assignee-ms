package com.cardonamaturana.assigneems.shared.exceptions.base;


import com.cardonamaturana.assigneems.shared.exceptions.response.ErrorResponse;
import java.sql.Timestamp;
import java.util.stream.Collectors;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
@RequestMapping(MediaType.APPLICATION_JSON_VALUE)
public class BaseExeptionHandler {

  @ExceptionHandler(BaseException.class)
  public ResponseEntity<ErrorResponse> errorHandler(BaseException ex) {
    return new ResponseEntity<>(ErrorResponse.builder()
        .status(ex.getStatus().value())
        .code(ex.getCode())
        .message(ex.getMessage())
        .date(ex.getDate().toString())
        .build(),
        HttpStatus.valueOf(ex.getStatus().value()));
  }

  @ExceptionHandler(HttpMessageNotReadableException.class)
  public ResponseEntity<ErrorResponse> handleHttpMessageNotReadableException(
      HttpMessageNotReadableException ex) {

    return new ResponseEntity<>(ErrorResponse.builder()
        .status(HttpStatus.BAD_REQUEST.value())
        .date(new Timestamp(System.currentTimeMillis()).toString())
        .code(ExceptionCode.NOT_VALID_PARAMETER_STRUCTURE.getCode())
        .message(ExceptionCode.NOT_VALID_PARAMETER_STRUCTURE.getMessage())
        .build(),
        HttpStatus.valueOf(HttpStatus.BAD_REQUEST.value()));
  }


  @ExceptionHandler(MethodArgumentNotValidException.class)
  public ResponseEntity<ErrorResponse> handleMethodArgumentNotValid(
      MethodArgumentNotValidException ex) {
    String errorMessage = ex.getBindingResult().getFieldErrors().stream()
        .map(fieldError -> fieldError.getDefaultMessage())
        .collect(Collectors.joining("; "));

    return new ResponseEntity<>(ErrorResponse.builder()
        .status(HttpStatus.BAD_REQUEST.value())
        .date(new Timestamp(System.currentTimeMillis()).toString())
        .code(ExceptionCode.NOT_VALID_PARAMETER.getCode())
        .message(errorMessage)
        .build(),
        HttpStatus.valueOf(HttpStatus.BAD_REQUEST.value()));

  }


  @ExceptionHandler(BindException.class)
  protected ResponseEntity<ErrorResponse> handleBindException(BindException ex) {
    String errorMessage = ex.getBindingResult().getFieldErrors().stream()
        .map(fieldError -> fieldError.getDefaultMessage().concat("\n"))
        .collect(Collectors.joining("; "));

    return new ResponseEntity<>(ErrorResponse.builder()
        .status(HttpStatus.BAD_REQUEST.value())
        .date(new Timestamp(System.currentTimeMillis()).toString())
        .code(ExceptionCode.NOT_VALID_PARAMETER_STRUCTURE.getCode())
        .message(errorMessage)
        .build(),
        HttpStatus.valueOf(HttpStatus.BAD_REQUEST.value()));
  }


}
