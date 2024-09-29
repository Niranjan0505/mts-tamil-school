package com.example.mts.tamil.school.Service;

import com.example.mts.tamil.school.model.Enrollment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name="course-management-client",url = "http://localhost:9090" )
public interface CourseManagementFeignClient {
    @PostMapping("/enroll")
    ResponseEntity<Enrollment>enrollCourse(@RequestBody Enrollment enrollment);
}
