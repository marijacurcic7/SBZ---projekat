package com.flowershop.repository;

import javax.transaction.Transactional;

import com.flowershop.model.Admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    
    @Transactional
    Admin findByEmail(String email);
    
}
