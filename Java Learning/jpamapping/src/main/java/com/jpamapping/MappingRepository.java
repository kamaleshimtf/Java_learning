package com.jpamapping;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public interface MappingRepository extends JpaRepository<StudentEntity, Long> {
}
