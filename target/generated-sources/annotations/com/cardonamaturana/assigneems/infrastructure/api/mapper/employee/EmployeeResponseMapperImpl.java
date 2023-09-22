package com.cardonamaturana.assigneems.infrastructure.api.mapper.employee;

import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.employee.EmployeeResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-22T12:12:15-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class EmployeeResponseMapperImpl implements EmployeeResponseMapper {

    @Override
    public EmployeeResponse toDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeResponse employeeResponse = new EmployeeResponse();

        employeeResponse.setId( employee.getId() );
        employeeResponse.setFullName( employee.getFullName() );
        employeeResponse.setDocumentType( employee.getDocumentType() );
        employeeResponse.setDocumentNumber( employee.getDocumentNumber() );
        employeeResponse.setPersonalEmail( employee.getPersonalEmail() );
        employeeResponse.setCompany( employee.getCompany() );

        return employeeResponse;
    }
}
