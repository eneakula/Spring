package com.javaTirane42_sda_spring_framework_java_tr_42.scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
//@Scope("prototype")
public class RandomNumberProvider {

    private final int value = new Random().nextInt();

    public int getValue() {
        return value;
    }
}
