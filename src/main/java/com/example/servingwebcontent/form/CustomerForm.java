package com.example.servingwebcontent.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerForm {
    
    @NotBlank(message = "ID should not be blank")
    private String id;
    @NotBlank(message = "Name should not be blank")
    private String username;
    private String postCode;
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email should not be blank")
    private String email;
    private String phoneNumber;
    
    public CustomerForm() {
    }
    
    public CustomerForm(String id,String name, String postcode, String email, String phone) {
        this.id = id;
        this.username = name;
        this.postCode = postcode;
        this.email = email;
        this.phoneNumber = phone;
    }
}
