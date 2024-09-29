package com.example.mts.tamil.school.controller;

import com.example.mts.tamil.school.Service.StudentService;
import com.example.mts.tamil.school.model.Enrollment;
import com.example.mts.tamil.school.model.Student;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    private StudentService studentService;
    @Autowired
     StudentController( StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/student")
    public  Student addValue(@RequestBody Student student   ) {
          studentService.addData(student);
        return student;
    }
    @PostMapping("{id}/enroll")
    ResponseEntity<Void> enrollCourse (@RequestBody Enrollment enrollment) {
        studentService.enrollCourse(enrollment);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping( "/student/{id}")
    public Optional<Student >
    getStudent(@PathVariable Long id) {
        return studentService.getValue(id);
    }
    @GetMapping("/student")
    public List <Student> getAllStudents() {
        return studentService. getAllData();
    }
    @PutMapping("/student")
    public Student updateValue(@PathVariable  Student stu,long id) {
        return studentService. updateValue(id,stu);
    }
    @DeleteMapping("/student")
    public Student deleteValue(@PathVariable long id) {
        return studentService.deleteData(id);
    }
}
 
//for (int i = 0; i < studentList.size(); i++) {
//            Student student = studentList.get(i);
//            if (student.getId() == id) {
//                studentList.remove(student);
//                return ResponseEntity.status(200).body("student removed: " + student.getName());
//            }
//        }


