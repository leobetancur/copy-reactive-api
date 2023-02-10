package com.reactive.student.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;


@RestControllerAdvice
public class ExceptionRestController {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleEntityNotFoundException() {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No found");
    }

    @ExceptionHandler(StudentAlreadyExists.class)
    public ResponseEntity<String> handleStudentAlreadyExists(){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(StudentAlreadyExists.STUDENT_ALREADY_EXISTS);
    }

}
