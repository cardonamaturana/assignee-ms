package com.cardonamaturana.assigneems.infrastructure.api.dto.request.assignee;

import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico.PragmaticoRequest;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@JsonSubTypes({
    @JsonSubTypes.Type(value = EmployeeRequest.class, name = "employeeRequest"),
    @JsonSubTypes.Type(value = PragmaticoRequest.class, name = "pragmaticoRequest")
})
@NoArgsConstructor
@AllArgsConstructor
public abstract class AssigneeRequest {

}