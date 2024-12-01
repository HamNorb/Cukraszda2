package com.example.securityrole.repository;

import com.example.securityrole.UzenetOsztaly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<UzenetOsztaly, Long> {
}