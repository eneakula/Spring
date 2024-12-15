package com.javaTirane42_sda_spring_framework_java_tr_42.exeptionhandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public final class GlobalExceptionHandler {

    @ExceptionHandler(SdaException.class)
    public Error handleSdaException(SdaException e) {
        return new Error(e.getMessage());
    }

    @ExceptionHandler(SpecificSdaException.class)
    public Error handleSpecificSdaException(SpecificSdaException e) {
        return new Error(e.getMessage());
    }
}
