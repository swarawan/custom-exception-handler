package com.swarawan.ex.config;

import com.swarawan.ex.model.ResponseModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> exception(Exception exception) {
        String message = exception.getLocalizedMessage();

        ResponseModel model = new ResponseModel("ERROR", null, message);
        return new ResponseEntity<>(model, HttpStatus.BAD_REQUEST);
    }
}
