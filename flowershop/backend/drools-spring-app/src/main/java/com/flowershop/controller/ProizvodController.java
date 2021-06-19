package com.flowershop.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.flowershop.dto.ProizvodDTO;
import com.flowershop.model.Kupac;
import com.flowershop.model.Kupovina;
import com.flowershop.model.Proizvod;
import com.flowershop.model.User;
import com.flowershop.service.KupacService;
import com.flowershop.service.ProizvodService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/proizvodi")
@CrossOrigin(origins = "http://localhost:4200")
public class ProizvodController {

    @Autowired
    public ProizvodService proizvodService;

    @Autowired
    public KupacService kupacService;

    @GetMapping()
    public ResponseEntity<?> getAllProizvodi(){
        List<Proizvod> proizvodi = proizvodService.getAll();
        List<ProizvodDTO> dto = toProizvodDTOList(proizvodi);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping("/kupi/{proizvodId}")
    public ResponseEntity<?> kupi(@PathVariable("proizvodId") Long proizvodId ){
        System.out.println("OVDEEEEEEEE");
        System.out.println(proizvodId);
        Proizvod proizvod = null;
        for(Proizvod p : proizvodService.getAll()){
            if(p.getId().equals(proizvodId)){
                proizvod = p;
            }
        }
        if(proizvod == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        // User principal = (User) authentication.getPrincipal();
        kupacService.kupi(proizvod);
        // System.out.println(principal.getEmail());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private List<ProizvodDTO> toProizvodDTOList(List<Proizvod> proizvodi){
		List<ProizvodDTO> proizvodDTOs = new ArrayList<>();
		for(Proizvod p : proizvodi){
			ProizvodDTO dto = new ProizvodDTO(p.getId(), p.getNaziv(), p.getOpis(), p.getTip(), p.getCena(), p.getPopust(), p.ukupanBrojCvetova());
			proizvodDTOs.add(dto);
		}
		return proizvodDTOs;
	}
    
}
