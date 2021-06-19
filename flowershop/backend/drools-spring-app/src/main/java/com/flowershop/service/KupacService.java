package com.flowershop.service;

import java.util.Date;
import java.util.HashMap;

import com.flowershop.model.Admin;
import com.flowershop.model.Kupac;
import com.flowershop.model.Kupovina;
import com.flowershop.model.Proizvod;
import com.flowershop.model.User;
import com.flowershop.repository.AdminRepository;
import com.flowershop.repository.KupacRepository;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class KupacService implements UserDetailsService {

    private final KieContainer kieContainer;

    @Autowired
    KupacRepository kupacRepository;

    @Autowired
    AdminRepository adminRepository;

    @Autowired
    public KupovinaService kupovinaService;

    @Autowired
	public KupacService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

    public Kupac findByEmail(String email) {
		return kupacRepository.findByEmail(email);
	}

    public void save(Kupac kupac){
        kupacRepository.save(kupac);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Kupac kupac = kupacRepository.findByEmail(email);

        if (kupac != null)
            return kupac;

        Admin admin = adminRepository.findByEmail(email);

        if (admin != null)
            return admin;

        throw new UsernameNotFoundException(String.format("No user found with username '%s'.", email));
    }

    public double izracunajPopust(Kupac kupac){
        System.out.println(kupac.getUkupnaCena());

        KieSession kieSession = kieContainer.newKieSession("test-session");

        kieSession.insert(kupac);

		kieSession.getAgenda().getAgendaGroup("group5").setFocus();
		kieSession.fireAllRules();

        return kupac.getPopust();
    }

    public void kupi(Proizvod proizvod){
        Kupac kupac = findByEmail("kupac1@gmail.com");
        Kupovina kupovina = new Kupovina();
        kupovina.setProizvodi(new HashMap<>());
        kupovina.getProizvodi().put(proizvod.getId(), 1);
        kupovina.setProizvod(proizvod);
        kupovina.setDatum(new Date());
        kupovina.setKupac(kupac);
        double cena = proizvod.cenaSaPopustom(kupac.getPopust());
        kupovina.setIznos(cena);
        kupovinaService.save(kupovina);

        // kupac.getKupljeniProizvodi().add(proizvod);
        kupac.getKupovine().add(kupovina);
        kupac.dodajNaIznos(cena);
        double popust = izracunajPopust(kupac);
        System.out.println("POPUST: " + popust);
        save(kupac);
    }

    public Kupac getKupac() {
        Kupac kupac = findByEmail("kupac1@gmail.com");
        return kupac;
    }
    
}
