package com.cardonamaturana.assigneems.infrastructure.api.mapper;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico.PragmaticoRequest;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T20:16:24-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class PragmaticoRequestMapperImpl implements PragmaticoRequestMapper {

    @Override
    public Pragmatico toEntity(PragmaticoRequest pragmaticoRequest) {
        if ( pragmaticoRequest == null ) {
            return null;
        }

        Pragmatico.PragmaticoBuilder<?, ?> pragmatico = Pragmatico.builder();

        pragmatico.contractType( pragmaticoRequest.getContractType() );
        pragmatico.jobTittle( pragmaticoRequest.getJobTittle() );
        pragmatico.workEmail( pragmaticoRequest.getWorkEmail() );
        pragmatico.salary( pragmaticoRequest.getSalary() );

        return pragmatico.build();
    }
}
