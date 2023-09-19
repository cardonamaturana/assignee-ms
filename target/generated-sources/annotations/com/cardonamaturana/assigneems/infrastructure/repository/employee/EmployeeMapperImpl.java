package com.cardonamaturana.assigneems.infrastructure.repository.employee;

import com.cardonamaturana.assigneems.domain.entity.Employee;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-18T16:11:23-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee toEntity(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setFullName( employeeDto.getFullName() );
        employee.setDocumentType( employeeDto.getDocumentType() );
        employee.setDocumentNumber( employeeDto.getDocumentNumber() );
        employee.setPersonalEmail( employeeDto.getPersonalEmail() );
        employee.setCompany( employeeDto.getCompany() );

        return employee;
    }

    @Override
    public EmployeeDto toDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto employeeDto = new EmployeeDto();

        employeeDto.setFullName( employee.getFullName() );
        employeeDto.setDocumentType( employee.getDocumentType() );
        employeeDto.setDocumentNumber( employee.getDocumentNumber() );
        employeeDto.setPersonalEmail( employee.getPersonalEmail() );
        employeeDto.setCompany( employee.getCompany() );

        return employeeDto;
    }
}
