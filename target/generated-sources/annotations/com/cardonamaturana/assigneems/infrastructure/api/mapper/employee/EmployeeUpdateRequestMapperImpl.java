package com.cardonamaturana.assigneems.infrastructure.api.mapper.employee;

import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeUpdateRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-22T14:57:14-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class EmployeeUpdateRequestMapperImpl implements EmployeeUpdateRequestMapper {

    @Override
    public Employee toEntity(EmployeeUpdateRequest employeeUpdateRequest) {
        if ( employeeUpdateRequest == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setId( employeeUpdateRequest.getEmployeeId() );
        employee.setFullName( employeeUpdateRequest.getFullName() );
        employee.setDocumentType( employeeUpdateRequest.getDocumentType() );
        employee.setDocumentNumber( employeeUpdateRequest.getDocumentNumber() );
        employee.setPersonalEmail( employeeUpdateRequest.getPersonalEmail() );
        employee.setCompany( employeeUpdateRequest.getCompany() );

        return employee;
    }
}
