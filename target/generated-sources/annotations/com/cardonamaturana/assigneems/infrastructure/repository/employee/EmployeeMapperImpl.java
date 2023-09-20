package com.cardonamaturana.assigneems.infrastructure.repository.employee;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-20T00:05:51-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
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
        employee.setCompany( companyDtoToCompany( employeeDto.getCompany() ) );

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
        employeeDto.setCompany( companyToCompanyDto( employee.getCompany() ) );

        return employeeDto;
    }

    protected Company companyDtoToCompany(CompanyDto companyDto) {
        if ( companyDto == null ) {
            return null;
        }

        Company company = new Company();

        company.setName( companyDto.getName() );
        company.setNit( companyDto.getNit() );
        company.setLocation( companyDto.getLocation() );

        return company;
    }

    protected CompanyDto companyToCompanyDto(Company company) {
        if ( company == null ) {
            return null;
        }

        CompanyDto companyDto = new CompanyDto();

        companyDto.setName( company.getName() );
        companyDto.setNit( company.getNit() );
        companyDto.setLocation( company.getLocation() );

        return companyDto;
    }
}
