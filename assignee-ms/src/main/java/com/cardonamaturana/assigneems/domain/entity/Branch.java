package com.cardonamaturana.assigneems.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;


@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class Branch extends Assignee {

    private String name;
    private String city;
    private String address;

}