package com.flowershop.controller;

import java.util.ArrayList;
import java.util.List;

import com.flowershop.dto.ProizvodDTO;
import com.flowershop.dto.ZahtevDTO;
import com.flowershop.mapper.ZahtevMapper;
import com.flowershop.model.Cvet;
import com.flowershop.model.Proizvod;
import com.flowershop.model.Zahtev;
import com.flowershop.service.TestService;
import com.flowershop.service.ZahtevService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping(value = "/zahtevi")
@CrossOrigin(origins = "http://localhost:4200")
public class AppController { 

	@Autowired
	public ZahtevService zahtevService;


	@PostMapping()
	public ResponseEntity<?> kreirajZahtev(@RequestBody ZahtevDTO dto) {
		System.out.println(dto.getRazlogKupovine());
		ZahtevMapper mapper = new ZahtevMapper();
		System.out.println("Kreiraj zahtev");
		Zahtev zahtev = mapper.toEntity(dto);
		zahtevService.calculateSeason(zahtev);
		List<Proizvod> proizvodi = zahtevService.kreirajZahtev(zahtev);

		return new ResponseEntity<>(toProizvodDTOList(proizvodi), HttpStatus.OK);

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
