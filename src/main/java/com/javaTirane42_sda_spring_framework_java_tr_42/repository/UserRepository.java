package com.javaTirane42_sda_spring_framework_java_tr_42.repository;

import com.javaTirane42_sda_spring_framework_java_tr_42.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
