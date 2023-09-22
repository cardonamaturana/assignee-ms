package com.cardonamaturana.assigneems.infrastructure.api.mapper.employee;

import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-21T22:38:07-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class EmployeeRequestMapperImpl implements EmployeeRequestMapper {

    @Override
    public Employee toEntity(EmployeeRequest employeeRequest) {
        if ( employeeRequest == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setFullName( employeeRequest.getFullName() );
        employee.setDocumentType( employeeRequest.getDocumentType() );
        employee.setDocumentNumber( employeeRequest.getDocumentNumber() );
        employee.setPersonalEmail( employeeRequest.getPersonalEmail() );
        employee.setCompany( employeeRequest.getCompany() );

        return employee;
    }
}
