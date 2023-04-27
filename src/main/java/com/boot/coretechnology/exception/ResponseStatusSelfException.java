package com.boot.coretechnology.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author wang
 * @create 2022-2022-11-13:56
 */
@ResponseStatus(value= HttpStatus.FORBIDDEN,reason="your erro is must!")
public class ResponseStatusSelfException extends RuntimeException {
    public ResponseStatusSelfException(){}

    public ResponseStatusSelfException(String message){
        super(message);
    }
}
