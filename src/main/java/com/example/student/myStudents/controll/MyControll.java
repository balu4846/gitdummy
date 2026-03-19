package com.example.student.myStudents.controll;

import com.example.student.myStudents.dto.student;
import com.example.student.myStudents.repo.Studentrepo;
import com.example.student.myStudents.services.Studentserices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class MyControll {
    @Autowired
    private Studentserices studentserices;

    @GetMapping("/api/all")
    public ResponseEntity<List<student>> getAllStudent() {

        List<student> stud = studentserices.getAll();

        return new ResponseEntity<List<student>>(stud, HttpStatus.ACCEPTED);

    }

}
