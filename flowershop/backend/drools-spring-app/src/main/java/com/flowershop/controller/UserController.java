package com.flowershop.controller;

import java.util.ArrayList;
import java.util.List;

import com.flowershop.dto.KupacDTO;
import com.flowershop.dto.KupovinaDTO;
import com.flowershop.dto.ProizvodDTO;
import com.flowershop.model.Kupac;
import com.flowershop.model.Kupovina;
import com.flowershop.service.KupacService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/korisnik")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    public KupacService kupacService;
    
    @GetMapping()
    public ResponseEntity<?> getUserDetails(){
        Kupac kupac = kupacService.getKupac();
        KupacDTO dto = new KupacDTO(kupac.getId(), kupac.getFirstName(), kupac.getLastName(), kupac.getEmail(), kupac.getPassword(), kupac.getUkupnaCena(), kupac.getPopust());
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @GetMapping("/kupovine")
    public ResponseEntity<?> getKupovine(){
        Kupac kupac = kupacService.getKupac();
        List<KupovinaDTO> dto = new ArrayList<>();
        for(Kupovina kupovina : kupac.getKupovine()){
            ProizvodDTO proizvodDTO = new ProizvodDTO(kupovina.getProizvod().getId(), kupovina.getProizvod().getNaziv(), kupovina.getProizvod().getOpis(), kupovina.getProizvod().getTip(), 
            kupovina.getProizvod().getCena(), kupovina.getProizvod().getPopust(), kupovina.getProizvod().ukupanBrojCvetova());
            KupovinaDTO kupovinaDTO = new KupovinaDTO(kupovina.getId(), proizvodDTO, kupovina.getDatum(), kupovina.getIznos());
            dto.add(kupovinaDTO);
        }
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
