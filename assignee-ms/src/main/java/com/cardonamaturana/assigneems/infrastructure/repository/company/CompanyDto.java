package com.cardonamaturana.assigneems.infrastructure.repository.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@SuperBuilder
@Getter
@Setter
@Document
public class CompanyDto {

    @Id
    private String id;
    private String name;
    private String nit;
    private String location;


}