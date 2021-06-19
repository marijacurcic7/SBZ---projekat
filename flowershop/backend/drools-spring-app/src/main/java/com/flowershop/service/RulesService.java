package com.flowershop.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import com.flowershop.model.BrojVrsta;
import com.flowershop.model.Cvet;
import com.flowershop.model.Kupac;
import com.flowershop.model.Kupovina;
import com.flowershop.model.KupovinaEvent;
import com.flowershop.model.PreporuceniProizvodi;
import com.flowershop.model.Proizvod;
import com.flowershop.model.Proizvodi;
import com.flowershop.model.TipProizvoda;
import com.flowershop.model.TipoviProizvoda;
import com.flowershop.model.VrsteCveca;
import com.flowershop.model.Zahtev;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RulesService {
    
    private KieSession kieSession;
	
	private KieContainer kieContainer;


    @Autowired
	public RulesService(KieContainer kieContainer) {
		this.kieContainer = kieContainer;
	}

	@PostConstruct
	private void initializeSession() {
		this.kieSession = kieContainer.newKieSession("test-session");
	}

    public List<Proizvod> preporuciProizvode(Zahtev zahtev, VrsteCveca cvece, Proizvodi proizvodi, TipoviProizvoda tipoviProizvoda){


		//vrste cveca
		this.kieSession.insert(zahtev);
		this.kieSession.getAgenda().getAgendaGroup("group1").setFocus();
		this.kieSession.fireAllRules();

        System.out.println("GROUP 1 " + cvece.getRed());
		for(Cvet c : cvece.getCvece()){
			System.out.println(c.getNaziv() + ", " + c.getBoja());
		}

        //tipovi proizvoda
		this.kieSession.insert(zahtev);
		this.kieSession.insert(cvece);
		this.kieSession.insert(tipoviProizvoda);

		this.kieSession.getAgenda().getAgendaGroup("group2").setFocus();
		this.kieSession.fireAllRules();

		System.out.println("GROUP 2");
		for(TipProizvoda tip : tipoviProizvoda.getTipovi()){
			System.out.println(tip.name());
		}


		this.kieSession.insert(zahtev);
		this.kieSession.insert(proizvodi);

		this.kieSession.getAgenda().getAgendaGroup("group3").setFocus();
		this.kieSession.fireAllRules();

		System.out.println("GROUP 3");
		for(Proizvod p: proizvodi.getProizvodi()){
            System.out.println(p.getNaziv());
        }

		// List<Proizvod> preporuceniList = new ArrayList<>();
		// PreporuceniProizvodi preporuceni = new PreporuceniProizvodi();
		// preporuceni.setProizvodi(preporuceniList);

        this.kieSession.insert(tipoviProizvoda);
		this.kieSession.insert(proizvodi);

		this.kieSession.getAgenda().getAgendaGroup("group4").setFocus();
		this.kieSession.fireAllRules();

		System.out.println("GROUP 4");
		for(Proizvod p: proizvodi.getProizvodi()){
            System.out.println(p.getNaziv());
        }
		System.out.println();

        List<Proizvod> preporuceniProizvodi = new ArrayList<>();

		for(Proizvod p: proizvodi.getProizvodi()){
			boolean postoji = false;
			for(BrojVrsta bv : p.getCvece()){
				if(cvece.getCvece().contains(bv.getCvet())){
					postoji = true;
				}
			}
			if(postoji){
				preporuceniProizvodi.add(p);
				System.out.println(p.getNaziv());
			}
		}

        return preporuceniProizvodi;
    }

    public void novaKupovina(Kupovina kupovina, Kupac kupac){
        KupovinaEvent kupovinaEvent = new KupovinaEvent(kupovina.getKupac().getId(), kupovina.getIznos(), 60000L);

        System.out.println(kupovina);
        System.out.println(kupovina.getIznos());

        this.kieSession.insert(kupac);
        this.kieSession.insert(kupovinaEvent);

		this.kieSession.getAgenda().getAgendaGroup("group6").setFocus();
		this.kieSession.fireAllRules();

        System.out.println("Popust: " + kupac.getPopust());
    }
}
