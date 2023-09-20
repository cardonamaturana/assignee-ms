package com.cardonamaturana.assigneems.infrastructure.api.mapper.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.pragmatico.PragmaticoResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-20T00:05:51-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class PragmaticoResponseMapperImpl implements PragmaticoResponseMapper {

    @Override
    public PragmaticoResponse toDto(Pragmatico pragmatico) {
        if ( pragmatico == null ) {
            return null;
        }

        PragmaticoResponse pragmaticoResponse = new PragmaticoResponse();

        pragmaticoResponse.setFullName( pragmatico.getFullName() );
        pragmaticoResponse.setDocumentType( pragmatico.getDocumentType() );
        pragmaticoResponse.setDocumentNumber( pragmatico.getDocumentNumber() );
        pragmaticoResponse.setPersonalEmail( pragmatico.getPersonalEmail() );
        pragmaticoResponse.setCompany( pragmatico.getCompany() );
        pragmaticoResponse.setContractType( pragmatico.getContractType() );
        pragmaticoResponse.setJobTittle( pragmatico.getJobTittle() );
        pragmaticoResponse.setWorkEmail( pragmatico.getWorkEmail() );
        pragmaticoResponse.setSalary( pragmatico.getSalary() );

        return pragmaticoResponse;
    }
}
