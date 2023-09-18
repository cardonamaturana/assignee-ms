package com.cardonamaturana.assigneems.infrastructure.repository.employee;

import com.cardonamaturana.assigneems.domain.entity.Employee;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-18T00:49:23-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee toEntity(EmployeeDto employeeDto) {
        if ( employeeDto == null ) {
            return null;
        }

        Employee.EmployeeBuilder<?, ?> employee = Employee.builder();

        employee.fullName( employeeDto.getFullName() );
        employee.documentType( employeeDto.getDocumentType() );
        employee.documentNumber( employeeDto.getDocumentNumber() );
        employee.personalEmail( employeeDto.getPersonalEmail() );
        employee.company( employeeDto.getCompany() );

        return employee.build();
    }

    @Override
    public EmployeeDto toDto(Employee employee) {
        if ( employee == null ) {
            return null;
        }

        EmployeeDto.EmployeeDtoBuilder<?, ?> employeeDto = EmployeeDto.builder();

        employeeDto.fullName( employee.getFullName() );
        employeeDto.documentType( employee.getDocumentType() );
        employeeDto.documentNumber( employee.getDocumentNumber() );
        employeeDto.personalEmail( employee.getPersonalEmail() );
        employeeDto.company( employee.getCompany() );

        return employeeDto.build();
    }
}
