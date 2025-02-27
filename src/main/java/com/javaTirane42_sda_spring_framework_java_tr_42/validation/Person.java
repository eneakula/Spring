package com.javaTirane42_sda_spring_framework_java_tr_42.validation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

@Validated
public class Person {

    @NotNull
    @Length(min = 3, max = 32)
    private String firstName;

    @Email
    private String email;


    private String address;

    @JsonIgnore
    @AssertTrue
    public boolean isAddressValid() {
        return address != null && address.split(" ").length >= 2;
    }

    public Person(String firstName, String email, String address) {
        this.firstName = firstName;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
