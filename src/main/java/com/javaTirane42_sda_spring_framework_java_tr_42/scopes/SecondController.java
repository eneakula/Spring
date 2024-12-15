package com.javaTirane42_sda_spring_framework_java_tr_42.scopes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

    private RandomNumberProvider randomNumberProvider;

    public SecondController(RandomNumberProvider randomNumberProvider) {
        this.randomNumberProvider = randomNumberProvider;
    }

    @GetMapping("/api/number/val-b")
    public Integer FetchSecondNumber() {
        return randomNumberProvider.getValue();
    }
}
