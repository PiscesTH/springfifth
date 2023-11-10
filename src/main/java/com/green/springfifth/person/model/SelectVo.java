package com.green.springfifth.person.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SelectVo {
    private String fname;
    private String lname;
    private String street;
    private String city;
    private String country;
}
