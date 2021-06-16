package com.flowershop.mapper;

import com.flowershop.dto.ZahtevDTO;
import com.flowershop.model.Zahtev;

public class ZahtevMapper {
    

    public Zahtev toEntity(ZahtevDTO dto) {
		Zahtev zahtev = new Zahtev(dto.getId(), dto.getRazlogKupovine(), dto.getMotiv(), dto.getDatum(), dto.getMinCena(), dto.getMaxCena(), dto.getTipProizvoda(), dto.getSezona());
		
		return zahtev;
	}

    public ZahtevDTO toDTO(Zahtev zahtev){
        ZahtevDTO dto = new ZahtevDTO(zahtev.getId(), zahtev.getRazlogKupovine(), zahtev.getMotiv(), zahtev.getDatum(), zahtev.getMinCena(), zahtev.getMaxCena(), zahtev.getTipProizvoda(), zahtev.getSezona());
        return dto;
    }
}
