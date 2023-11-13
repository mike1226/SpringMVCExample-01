package com.example.servingwebcontent.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CountrySearchForm {

    @NotBlank(message = "ID should not be blank")
    private String mstCountryCD;

    public CountrySearchForm() {
    }

    public CountrySearchForm(String mstCountryCd) {
        this.mstCountryCD = mstCountryCd;
    }
}