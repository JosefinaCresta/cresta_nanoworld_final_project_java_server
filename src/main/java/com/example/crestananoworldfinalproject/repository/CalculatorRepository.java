package com.example.crestananoworldfinalproject.repository;

import com.example.crestananoworldfinalproject.model.Calculator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalculatorRepository extends JpaRepository<Calculator, Long> {
}
