package com.cardonamaturana.assigneems.shared.exceptions.base;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ExceptionCode {

  ASSIGNEE_NOT_FOUND("ERR-001", "Exception.ASSIGNEE_NOT_FOUND",
      "El id del responsable no existe en BD"),
  NOT_VALID_PARAMETER("ERR-002", "Exception.NOT_VALID_PARAMETER",
      "Error en los tipos de datos o valores ingresados"),
  NOT_VALID_PARAMETER_STRUCTURE("ERR-003",
      "Exception.NOT_VALID_PARAMETER_STRUCTURE",
      "Error en los campos del JSON o los valores ingresados no tienen el tipo de dato correcto."),

  ENTITY_TYPE_MISMATCH("ERR-004", "Exception.ENTITY_TYPE_MISMATCH",
      "Los objetos no coinciden"),
  COMPANY_NOT_FOUND("ERR-005", "Exception.COMPANY_NOT_FOUND",
      "El id de la empresa no existe en BD");

  private final String code;
  private final String type;
  private final String message;


}
