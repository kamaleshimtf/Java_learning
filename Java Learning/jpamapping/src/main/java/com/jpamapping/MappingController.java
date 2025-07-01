package com.jpamapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mapping")
public class MappingController {

    @Autowired
    MappingRepository mappingRepository;
    @Autowired
    MappingServiceClass mappingServiceClass;

    @Autowired
    MappingCourse mappingCourse;

    @PostMapping()
    public String postMapping(@RequestBody StudentEntity student) {
        mappingRepository.save(student);
       // mappingServiceClass.save();
      //  mappingServiceClass.update(student);
      //  mappingServiceClass.delete(10L);
        return "Successfully posted student";
    }
    @GetMapping()
    public Optional<StudentEntity> getCourses(){
        Optional<StudentEntity> courses = mappingRepository.findById(15L);
        return courses;
    }
}
