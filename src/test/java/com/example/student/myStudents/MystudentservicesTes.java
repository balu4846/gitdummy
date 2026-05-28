package com.example.student.myStudents;


import com.example.student.myStudents.dto.student;
import com.example.student.myStudents.except.studentDataNotxceptipn;
import com.example.student.myStudents.repo.Studentrepo;
import com.example.student.myStudents.services.Studentserices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class MystudentservicesTes {

    @Mock
    public Studentrepo studentrepo;
    @InjectMocks
    public Studentserices studentserices;
  @Test
    void testAllApi(){
        List<student> students = List.of(
                new student(1, "John", 20),
                new student(2, "Alice", 22),
                new student(3, "Bob", 19),
                new student(4, "David", 21),
                new student(5, "Emma", 23),
                new student(6, "Michael", 20),
                new student(7, "Sophia", 24),
                new student(8, "Daniel", 18),
                new student(9, "Olivia", 22),
                new student(10, "James", 25)
        );
        Mockito.when(studentrepo.findAll()).thenReturn(students);
        List<student> lstStd = studentserices.getAll();
      Assertions.assertFalse(lstStd.isEmpty());
    }
    @Test
    void testBYId(){
        student s = new student(1, "John", 20);
        Mockito.when(studentrepo.findById(1)).thenReturn(Optional.of(s));
        student rs = studentserices.findBYIdd(1);
        Assertions.assertNotNull(rs);
        Assertions.assertEquals(1,rs.getId());

    }

    void testByidCase(){
      Mockito.when(studentrepo.findById(999)).thenReturn(Optional.empty());
        // Correct assertion
        assertThrows(studentDataNotxceptipn.class, () -> {
            studentserices.findBYIdd(999);
        });
    }

}
