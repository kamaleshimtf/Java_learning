package com.jpamapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MappingServiceClass {
    StudentEntity studentEntity = new StudentEntity();
    Address address = new Address();
    @Autowired
    MappingRepository mappingRepository;
//    public void save(){
//        StudentEntity student = new StudentEntity();
//        student.setName("Arun");
//        address.setStreetName("MG Road");
//        address.setStreetNumber("10");
//        address.setCity("Chennai");
//        student.setAddress(address);
//        mappingRepository.save(student);
//    }
//
//    public void update(StudentEntity studentEntity ){
//        StudentEntity student = mappingRepository.findById(10L)
//                .orElseThrow(() -> new RuntimeException("Student not found"));
//        student.setName("Updated Kamalesh");
//        student.getAddress().setCity("Bangalore");
//        mappingRepository.save(student);
//    }
//
//    public void delete(Long id){
//        mappingRepository.deleteById(id);
//    }

}
