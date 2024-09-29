package com.example.mts.tamil.school.Service;

import com.example.mts.tamil.school.model.Enrollment;
import com.example.mts.tamil.school.model.Student;
import com.example.mts.tamil.school.repos.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
   @Autowired
    CourseManagementFeignClient courseManagementFeignClient;
    //@Autowired
    //RestTemplate restTemplate;

    public  Student addData(Student student) {
        return studentRepository.save(student);
    }
    public Optional<Student> getValue(long id) {
        return studentRepository.findById(id);
    }
    public List<Student> getAllData() {
        return studentRepository.findAll();
    }
    public Student updateValue(long id, Student stu) {
        return studentRepository.findById(id).orElse(stu);
    }
    public Student deleteData(long id) {
        return studentRepository.findById(id).orElse(null);

    }

    public void enrollCourse(Enrollment enrollment) {
        courseManagementFeignClient.enrollCourse(enrollment);
    }
}





