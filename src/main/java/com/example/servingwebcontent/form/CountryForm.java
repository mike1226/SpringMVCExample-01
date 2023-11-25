package com.example.servingwebcontent.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CountryForm {
    
    @NotBlank(message = "ID should not be blank")
    private String mstcountrycd;
    @NotBlank(message = "Name should not be blank")
    private String mstcountrynanme;
    
    public CountryForm() {
    }
    
    public CountryForm(String mstcountrycd,String mstcountrynanme) {
        this.mstcountrycd = mstcountrycd;
        this.mstcountrynanme = mstcountrynanme;

    }
}
