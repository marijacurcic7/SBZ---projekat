package com.flowershop.service;

import com.flowershop.model.Kupovina;
import com.flowershop.repository.KupovinaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KupovinaService {

    @Autowired
    public KupovinaRepository kupovinaRepository;

    public void save(Kupovina kupovina){
        kupovinaRepository.save(kupovina);
    }
    
}
