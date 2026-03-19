package com.example.student.myStudents.repo;

import com.example.student.myStudents.dto.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepo  extends JpaRepository<student,Integer> {
}
