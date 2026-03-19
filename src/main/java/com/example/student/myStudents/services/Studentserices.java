package com.example.student.myStudents.services;

import com.example.student.myStudents.dto.student;
import com.example.student.myStudents.except.studentDataNotxceptipn;
import com.example.student.myStudents.repo.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Studentserices {
    @Autowired
    Studentrepo studentrepo;
    public List<student> getAll(){
        return studentrepo.findAll();

    }
    public student findBYIdd(int id){
        return studentrepo.findById(id)
                .orElseThrow(() -> new studentDataNotxceptipn());
    }


}

