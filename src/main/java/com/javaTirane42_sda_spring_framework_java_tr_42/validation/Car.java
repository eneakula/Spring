package com.javaTirane42_sda_spring_framework_java_tr_42.validation;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public class Car {
    @NotEmpty
    private Long id;

    @NotNull
    @Length(min = 3)
    private String name;

    @Min(1)
    private Integer WheelsNumber;



    public Car(Long id, String name, Integer wheelsNumber) {
        this.id = id;
        this.name = name;
        WheelsNumber = wheelsNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWheelsNumber() {
        return WheelsNumber;
    }

    public void setWheelsNumber(Integer wheelsNumber) {
        WheelsNumber = wheelsNumber;
    }
}
