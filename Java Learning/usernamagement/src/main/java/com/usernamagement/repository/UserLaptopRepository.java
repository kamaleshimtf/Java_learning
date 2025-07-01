package com.usernamagement.repository;

import com.usernamagement.entity.UserLaptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLaptopRepository extends JpaRepository<UserLaptop, Long> {
}
