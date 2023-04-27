package com.boot.coretechnology.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author wang
 * @create 2022-2022-11-13:47
 */
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public String handlerArithmeticException(Exception e){
        log.error("arithmetic exception!",e);
        return "login";
    }


}
