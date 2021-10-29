package com.example.Day2.repository;

import com.example.Day2.entity.Benefits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitsRepository extends JpaRepository<Benefits, Long> {
}
