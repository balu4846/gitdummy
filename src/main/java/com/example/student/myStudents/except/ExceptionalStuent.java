package com.example.student.myStudents.except;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionalStuent {
    @ExceptionHandler(studentDataNotxceptipn.class)
    public ResponseEntity<String> handleStudentNotFound(studentDataNotxceptipn ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
