package com.flowershop.repository;

import javax.transaction.Transactional;

import com.flowershop.model.Kupac;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KupacRepository extends JpaRepository<Kupac, Long> {
    
    @Transactional
    Kupac findByEmail(String email);
}
