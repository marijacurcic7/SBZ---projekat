package com.flowershop.service;

import java.util.List;
import java.util.Optional;

import com.flowershop.model.Proizvod;
import com.flowershop.repository.ProizvodRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProizvodService {

    @Autowired
    public ProizvodRepository proizvodRepository;

    public List<Proizvod> getAll(){
        return proizvodRepository.findAll();
    }

    public Optional<Proizvod> finById(Long id){
        return proizvodRepository.findById(id);
    }
    
}
