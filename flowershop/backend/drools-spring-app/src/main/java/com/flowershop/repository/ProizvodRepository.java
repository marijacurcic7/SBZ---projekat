package com.flowershop.repository;

import java.util.List;
import java.util.Optional;

import com.flowershop.model.Proizvod;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProizvodRepository extends JpaRepository<Proizvod, Long> {

}
