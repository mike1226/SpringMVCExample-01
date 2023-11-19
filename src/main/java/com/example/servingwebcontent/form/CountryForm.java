package com.example.servingwebcontent.form;

import lombok.Data;

@Data
public class CountryForm {

    // country code
    private String cd;

    // country name
    private String name;

    public CountryForm() {
        this.cd = "";
        this.name = "";
    }

    public CountryForm(String cd, String name) {
        this.cd = cd;
        this.name = name;
    }
    
}
