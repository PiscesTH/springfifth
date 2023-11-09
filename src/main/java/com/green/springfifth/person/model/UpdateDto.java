package com.green.springfifth.person.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateDto {
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private int personId;
}
