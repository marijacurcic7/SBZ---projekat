package com.flowershop.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.flowershop.model.Cvet;
import com.flowershop.model.FilterProizvoda;
import com.flowershop.model.Kupac;
import com.flowershop.model.Proizvod;
import com.flowershop.model.Proizvodi;
import com.flowershop.model.TipProizvoda;
import com.flowershop.model.TipoviProizvoda;
import com.flowershop.model.VrsteCveca;
import com.flowershop.model.Zahtev;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.runtime.rule.QueryResultsRow;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    private static Logger log = LoggerFactory.getLogger(TestService.class);

	private final KieContainer kieContainer;

	@Autowired
	public TestService(KieContainer kieContainer) {
		log.info("Initialising a new example session.");
		this.kieContainer = kieContainer;
	}

	public Zahtev testZahtev(Zahtev z) {
		

		List<Cvet.Sezona> sezone1 = new ArrayList<>();
		sezone1.add(Cvet.Sezona.JESEN);
		List<Cvet.Sezona> sezone2 = new ArrayList<>();
		sezone2.add(Cvet.Sezona.JESEN);
		sezone2.add(Cvet.Sezona.PROLECE);
		List<TipProizvoda> tp1 = new ArrayList<>();
		tp1.add(TipProizvoda.ARANZMAN);
		tp1.add(TipProizvoda.BUKET);
		List<String> simbolika = new ArrayList<>();
		simbolika.add("pomen");
		simbolika.add("vencanje");
		simbolika.add("Dan zena");
		List<String> simbolika2 = new ArrayList<>();
		simbolika2.add("vencanje");
		simbolika2.add("porodica");
		List<String> simbolika3 = new ArrayList<>();
		simbolika3.add("rodjendan");
		Cvet c1 = new Cvet(1L, "ruza", "opis", "bela", simbolika, Cvet.Miris.BLAG, sezone2, tp1);
		Cvet c2 = new Cvet(2L, "kala", "opis", "roze", simbolika2, Cvet.Miris.BLAG, sezone2, tp1);
		Cvet c3 = new Cvet(2L, "ruza", "opis", "crvena", simbolika3, Cvet.Miris.BLAG, sezone2, tp1);


		List<TipProizvoda> tipoviProizvoda = new ArrayList<>();
		tipoviProizvoda.add(TipProizvoda.REZANO_CVECE);
		TipoviProizvoda tp = new TipoviProizvoda(tipoviProizvoda);

		List<Cvet> cvece = new ArrayList<>();
		cvece.add(c1);
		cvece.add(c2);
		cvece.add(c3);

		VrsteCveca vrste = new VrsteCveca(cvece, 0);

		Map<Long, Integer> cveceMap1 = new HashMap<>();
		cveceMap1.put(1L, 5);
		Map<Long, Integer> cveceMap2 = new HashMap<>();
		cveceMap2.put(1L, 10);
		Map<Long, Integer> cveceMap3 = new HashMap<>();
		cveceMap3.put(2L, 3);
		Proizvod p1 = new Proizvod(1L, "bele ruze", "opis", TipProizvoda.BUKET, cveceMap1, 1000.0, 0.0);
		Proizvod p2 = new Proizvod(2L, "bele ruze", "opis", TipProizvoda.BUKET, cveceMap2, 1200.0, 0.0);
		Proizvod p3 = new Proizvod(1L, "roze kale", "opis", TipProizvoda.BUKET, cveceMap3, 950.0, 0.0);
		List<Proizvod> proizvodi = new ArrayList<>();
		proizvodi.add(p1);
		proizvodi.add(p2);
		proizvodi.add(p3);


		Proizvodi proizvodiclass = new Proizvodi(proizvodi, 0);

		KieSession kieSession = kieContainer.newKieSession("test-session");
		kieSession.insert(z);

		kieSession.insert(vrste);

		kieSession.insert(tp);

		Kupac k = new Kupac();
		k.setUkupnaCena(10000.0);
		k.setUsername("kupac1");
		kieSession.insert(k);

		

		kieSession.insert(proizvodiclass);


		FilterProizvoda fp = new FilterProizvoda();
		kieSession.insert(fp);

		int i = kieSession.fireAllRules();
		System.out.println(i);

		QueryResults results = kieSession.getQueryResults( "proizvodiPoCeni", new Object[] {  0.0, 1000.0 }  );
		System.out.println("Query results: " + results.size());

		for ( QueryResultsRow row : results ) {
			Proizvod proiz = ( Proizvod ) row.get( "proizvod" );
			System.out.println( proiz.getNaziv() + "\n" );
		}

		kieSession.dispose();

		for(Cvet c : vrste.getCvece()){
			System.out.println(c.getNaziv());
		}
		for(TipProizvoda tip : tp.getTipovi()){
			System.out.println(tip.name());
		}
		return z;
	}

	
}
