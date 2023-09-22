package com.cardonamaturana.assigneems.infrastructure.api.mapper.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico.PragmaticoSaveRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-21T22:38:07-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class PragmaticoRequestMapperImpl implements PragmaticoRequestMapper {

    @Override
    public Pragmatico toEntity(PragmaticoSaveRequest pragmaticoSaveRequest) {
        if ( pragmaticoSaveRequest == null ) {
            return null;
        }

        Pragmatico pragmatico = new Pragmatico();

        pragmatico.setFullName( pragmaticoSaveRequest.getFullName() );
        pragmatico.setDocumentType( pragmaticoSaveRequest.getDocumentType() );
        pragmatico.setDocumentNumber( pragmaticoSaveRequest.getDocumentNumber() );
        pragmatico.setPersonalEmail( pragmaticoSaveRequest.getPersonalEmail() );
        pragmatico.setCompany( pragmaticoSaveRequest.getCompany() );
        pragmatico.setContractType( pragmaticoSaveRequest.getContractType() );
        pragmatico.setJobTittle( pragmaticoSaveRequest.getJobTittle() );
        pragmatico.setWorkEmail( pragmaticoSaveRequest.getWorkEmail() );
        pragmatico.setSalary( pragmaticoSaveRequest.getSalary() );

        return pragmatico;
    }
}
