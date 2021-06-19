package com.flowershop.repository;

import com.flowershop.model.Cvet;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CvetRepository extends JpaRepository<Cvet, Long> {
    
}
