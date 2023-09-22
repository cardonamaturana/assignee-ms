package com.cardonamaturana.assigneems.infrastructure.api.mapper.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico.PragmaticoUpdateRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-22T12:12:15-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class PragmaticoUpdateRequestMapperImpl implements PragmaticoUpdateRequestMapper {

    @Override
    public Pragmatico toEntity(PragmaticoUpdateRequest pragmaticoUpdateRequest) {
        if ( pragmaticoUpdateRequest == null ) {
            return null;
        }

        Pragmatico pragmatico = new Pragmatico();

        pragmatico.setId( pragmaticoUpdateRequest.getAssigneeId() );
        pragmatico.setFullName( pragmaticoUpdateRequest.getFullName() );
        pragmatico.setDocumentType( pragmaticoUpdateRequest.getDocumentType() );
        pragmatico.setDocumentNumber( pragmaticoUpdateRequest.getDocumentNumber() );
        pragmatico.setPersonalEmail( pragmaticoUpdateRequest.getPersonalEmail() );
        pragmatico.setCompany( pragmaticoUpdateRequest.getCompany() );
        pragmatico.setContractType( pragmaticoUpdateRequest.getContractType() );
        pragmatico.setJobTittle( pragmaticoUpdateRequest.getJobTittle() );
        pragmatico.setWorkEmail( pragmaticoUpdateRequest.getWorkEmail() );
        pragmatico.setSalary( pragmaticoUpdateRequest.getSalary() );

        return pragmatico;
    }
}
