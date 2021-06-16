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


@RestController
public class AppController { 
	private static Logger log = LoggerFactory.getLogger(AppController.class);

	private final TestService sampleService;

	@Autowired
	public AppController(TestService sampleService) {
		this.sampleService = sampleService;
	}

	@Autowired
	public ZahtevService zahtevService;

	@RequestMapping(value = "/zahtev", method = RequestMethod.GET)
	public Zahtev test() {

		Zahtev zahtev = new Zahtev();
        zahtev.setMinCena(1000.0);
        zahtev.setMaxCena(5000.0);
		zahtev.setRazlogKupovine("pomen");
		zahtev.setSezona(Cvet.Sezona.JESEN);
		// zahtev.setMotiv("porodica");


		

		log.debug("Request received for: " + zahtev);

		Zahtev z = sampleService.testZahtev(zahtev);

		return z;
	}

	@PostMapping("/zahtev1")
	public ResponseEntity<List<ProizvodDTO>> kreirajZahtev(@RequestBody ZahtevDTO dto) {
		ZahtevMapper mapper = new ZahtevMapper();
		System.out.println("Kreiraj zahtev");
		Zahtev zahtev = mapper.toEntity(dto);
		List<Proizvod> proizvodi = zahtevService.kreirajZahtev(zahtev);

		return new ResponseEntity<>(toProizvodDTOList(proizvodi), HttpStatus.OK);

		
	}
	
	private List<ProizvodDTO> toProizvodDTOList(List<Proizvod> proizvodi){
		List<ProizvodDTO> proizvodDTOs = new ArrayList<>();
		for(Proizvod p : proizvodi){
			ProizvodDTO dto = new ProizvodDTO(p.getId(), p.getNaziv(), p.getOpis(), p.getTip(), p.getCena(), p.getPopust());
			proizvodDTOs.add(dto);
		}
		return proizvodDTOs;
	}
	
	
}
