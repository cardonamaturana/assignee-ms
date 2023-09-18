package com.cardonamaturana.assigneems.infrastructure.api.mapper;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico.PragmaticoRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-18T00:49:23-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
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
