package com.cardonamaturana.assigneems.infrastructure.repository.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T20:16:24-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class PragmaticoMapperImpl implements PragmaticoMapper {

    @Override
    public Pragmatico toEntity(PragmaticoDto pragmaticoDto) {
        if ( pragmaticoDto == null ) {
            return null;
        }

        Pragmatico.PragmaticoBuilder<?, ?> pragmatico = Pragmatico.builder();

        pragmatico.fullName( pragmaticoDto.getFullName() );
        pragmatico.documentType( pragmaticoDto.getDocumentType() );
        pragmatico.documentNumber( pragmaticoDto.getDocumentNumber() );
        pragmatico.personalEmail( pragmaticoDto.getPersonalEmail() );
        pragmatico.company( pragmaticoDto.getCompany() );
        pragmatico.contractType( pragmaticoDto.getContractType() );
        pragmatico.jobTittle( pragmaticoDto.getJobTittle() );
        pragmatico.workEmail( pragmaticoDto.getWorkEmail() );
        pragmatico.salary( pragmaticoDto.getSalary() );

        return pragmatico.build();
    }

    @Override
    public PragmaticoDto toDto(Pragmatico pragmatico) {
        if ( pragmatico == null ) {
            return null;
        }

        PragmaticoDto.PragmaticoDtoBuilder<?, ?> pragmaticoDto = PragmaticoDto.builder();

        pragmaticoDto.fullName( pragmatico.getFullName() );
        pragmaticoDto.documentType( pragmatico.getDocumentType() );
        pragmaticoDto.documentNumber( pragmatico.getDocumentNumber() );
        pragmaticoDto.personalEmail( pragmatico.getPersonalEmail() );
        pragmaticoDto.company( pragmatico.getCompany() );
        pragmaticoDto.contractType( pragmatico.getContractType() );
        pragmaticoDto.jobTittle( pragmatico.getJobTittle() );
        pragmaticoDto.workEmail( pragmatico.getWorkEmail() );
        pragmaticoDto.salary( pragmatico.getSalary() );

        return pragmaticoDto.build();
    }
}
