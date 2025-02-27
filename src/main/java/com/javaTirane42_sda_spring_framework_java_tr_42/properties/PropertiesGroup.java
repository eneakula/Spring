package com.javaTirane42_sda_spring_framework_java_tr_42.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "sda.java.tirane42")
public class PropertiesGroup {

    private String propertyA;
    private String propertyB;

    public String getPropertyA() {
        return propertyA;
    }

    public String getPropertyB() {
        return propertyB;
    }

    public void setPropertyA(String propertyA) {
        this.propertyA = propertyA;
    }

    public void setPropertyB(String propertyB) {
        this.propertyB = propertyB;
    }
}
