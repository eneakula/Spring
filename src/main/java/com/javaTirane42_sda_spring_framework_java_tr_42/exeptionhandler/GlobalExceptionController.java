package com.javaTirane42_sda_spring_framework_java_tr_42.exeptionhandler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GlobalExceptionController {

    @GetMapping("global-sda")
    public void runGlobalSda(){
        throw new SdaException("Global Sda Exception");
    }

    @GetMapping("global-specific")
    public void runGlobalSpecific(){
        throw new SpecificSdaException("Global Specific Sda Exception");
    }
}
