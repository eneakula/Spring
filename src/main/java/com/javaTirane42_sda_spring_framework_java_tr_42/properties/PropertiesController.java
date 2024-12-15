package com.javaTirane42_sda_spring_framework_java_tr_42.properties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertiesController {

    private PropertiesGroup propertiesGroup;

    public PropertiesController(PropertiesGroup propertiesGroup) {
        this.propertiesGroup = propertiesGroup;
    }

    @GetMapping("property-a")
    public String getPropertyA() {
        return propertiesGroup.getPropertyA();
    }

    @GetMapping("property-b")
    public String getPropertyB() {
        return propertiesGroup.getPropertyB();
    }
}
