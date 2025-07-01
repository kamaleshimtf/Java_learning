package com.jpamapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MappingCourse extends JpaRepository<Course, Long> {

}
