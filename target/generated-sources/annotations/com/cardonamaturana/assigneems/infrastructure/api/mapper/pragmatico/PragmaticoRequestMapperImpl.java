package com.cardonamaturana.assigneems.infrastructure.api.mapper.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.company.CompanyRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico.PragmaticoRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-20T00:05:51-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class PragmaticoRequestMapperImpl implements PragmaticoRequestMapper {

    @Override
    public Pragmatico toEntity(PragmaticoRequest pragmaticoRequest) {
        if ( pragmaticoRequest == null ) {
            return null;
        }

        Pragmatico pragmatico = new Pragmatico();

        pragmatico.setFullName( pragmaticoRequest.getFullName() );
        pragmatico.setDocumentType( pragmaticoRequest.getDocumentType() );
        pragmatico.setDocumentNumber( pragmaticoRequest.getDocumentNumber() );
        pragmatico.setPersonalEmail( pragmaticoRequest.getPersonalEmail() );
        pragmatico.setCompany( companyRequestToCompany( pragmaticoRequest.getCompany() ) );
        pragmatico.setContractType( pragmaticoRequest.getContractType() );
        pragmatico.setJobTittle( pragmaticoRequest.getJobTittle() );
        pragmatico.setWorkEmail( pragmaticoRequest.getWorkEmail() );
        pragmatico.setSalary( pragmaticoRequest.getSalary() );

        return pragmatico;
    }

    protected Company companyRequestToCompany(CompanyRequest companyRequest) {
        if ( companyRequest == null ) {
            return null;
        }

        Company company = new Company();

        company.setName( companyRequest.getName() );
        company.setNit( companyRequest.getNit() );
        company.setLocation( companyRequest.getLocation() );

        return company;
    }
}
