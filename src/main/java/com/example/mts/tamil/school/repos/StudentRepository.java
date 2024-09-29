package com.example.mts.tamil.school.repos;

import com.example.mts.tamil.school.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface
StudentRepository extends JpaRepository<Student, Long> {

}
