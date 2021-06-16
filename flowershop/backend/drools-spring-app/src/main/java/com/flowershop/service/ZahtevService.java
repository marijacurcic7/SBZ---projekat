package com.flowershop.service;

import com.flowershop.dto.ZahtevDTO;
import com.flowershop.model.Zahtev;

import java.util.ArrayList;
import java.util.Arrays;
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

import org.springframework.stereotype.Service;

@Service
public class ZahtevService {
    private static Logger log = LoggerFactory.getLogger(TestService.class);

	private final KieContainer kieContainer;

	@Autowired
	public ZahtevService(KieContainer kieContainer) {
		log.info("Initialising a new example session.");
		this.kieContainer = kieContainer;
	}
    
    public List<Proizvod> kreirajZahtev(Zahtev zahtev){

        VrsteCveca cvece = getCvece();
        Proizvodi proizvodi = getProizvodi();

		List<TipProizvoda> tipoviProizvoda = new ArrayList<>();
		tipoviProizvoda.add(TipProizvoda.REZANO_CVECE);
		TipoviProizvoda tp = new TipoviProizvoda(tipoviProizvoda);

		KieSession kieSession = kieContainer.newKieSession("test-session");
		kieSession.insert(zahtev);
		kieSession.insert(cvece);
		kieSession.insert(tp);
        kieSession.insert(proizvodi);

		// Kupac k = new Kupac();
		// k.setUkupnaCena(10000.0);
		// k.setUsername("kupac1");
		// kieSession.insert(k);
		
		// FilterProizvoda fp = new FilterProizvoda();
		// kieSession.insert(fp);

		int i = kieSession.fireAllRules();
		// System.out.println(i);

		// QueryResults results = kieSession.getQueryResults( "proizvodiPoCeni", new Object[] {  0.0, 1000.0 }  );
		// System.out.println("Query results: " + results.size());

		// for ( QueryResultsRow row : results ) {
		// 	Proizvod proiz = ( Proizvod ) row.get( "proizvod" );
		// 	System.out.println( proiz.getNaziv() + "\n" );
		// }

		kieSession.dispose();

		for(Cvet c : cvece.getCvece()){
			System.out.println(c.getNaziv() + ", " + c.getBoja());
		}
		for(TipProizvoda tip : tp.getTipovi()){
			System.out.println(tip.name());
		}
        for(Proizvod p: proizvodi.getProizvodi()){
            System.out.println(p.getNaziv());
        }

		List<Proizvod> preporuceniProizvodi = new ArrayList<>();

		for(Proizvod p: proizvodi.getProizvodi()){
			boolean postoji = true;
			for(Long cvet : p.getCvece().keySet()){
				if(getCvetById(cvet, cvece) == null){
					postoji = false;
				}
			}
			if(postoji){
				preporuceniProizvodi.add(p);
				System.out.println(p.getNaziv());
			}
		}


        return preporuceniProizvodi;

    }

    private VrsteCveca getCvece(){

        List<Cvet.Sezona> sezone1 = new ArrayList<>();
		sezone1.add(Cvet.Sezona.ZIMA);
        List<Cvet.Sezona> sezone2 = new ArrayList<>();
		sezone2.add(Cvet.Sezona.PROLECE);
        List<Cvet.Sezona> sezone3 = new ArrayList<>();
		sezone3.add(Cvet.Sezona.LETO);
		List<Cvet.Sezona> sezone4 = new ArrayList<>();
		sezone4.add(Cvet.Sezona.JESEN);

        List<Cvet.Sezona> sezone12 = new ArrayList<>();
		sezone12.add(Cvet.Sezona.ZIMA);
        sezone12.add(Cvet.Sezona.PROLECE);
        List<Cvet.Sezona> sezone23 = new ArrayList<>();
		sezone23.add(Cvet.Sezona.LETO);
        sezone23.add(Cvet.Sezona.PROLECE);
        List<Cvet.Sezona> sezone34 = new ArrayList<>();
		sezone34.add(Cvet.Sezona.LETO);
        sezone34.add(Cvet.Sezona.JESEN);
        List<Cvet.Sezona> sezone14 = new ArrayList<>();
		sezone14.add(Cvet.Sezona.ZIMA);
        sezone14.add(Cvet.Sezona.JESEN);
        List<Cvet.Sezona> sezone24 = new ArrayList<>();
		sezone24.add(Cvet.Sezona.PROLECE);
        sezone34.add(Cvet.Sezona.JESEN);

        List<Cvet.Sezona> sezone234 = new ArrayList<>();
		sezone234.add(Cvet.Sezona.PROLECE);
		sezone234.add(Cvet.Sezona.LETO);
        sezone234.add(Cvet.Sezona.JESEN);

        List<Cvet.Sezona> sezone1234 = new ArrayList<>();
		sezone1234.add(Cvet.Sezona.PROLECE);
		sezone1234.add(Cvet.Sezona.LETO);
		sezone1234.add(Cvet.Sezona.PROLECE);
        sezone1234.add(Cvet.Sezona.ZIMA);

		List<TipProizvoda> tp1 = new ArrayList<>();
		tp1.add(TipProizvoda.ARANZMAN);
		tp1.add(TipProizvoda.BUKET);

        List<TipProizvoda> tp2 = new ArrayList<>();
		tp1.add(TipProizvoda.BUKET);

		// List<String> simbolika = new ArrayList<>();
		// simbolika.add("pomen");
		// simbolika.add("vencanje");
		// simbolika.add("Dan zena");
		// List<String> simbolika2 = new ArrayList<>();
		// simbolika2.add("vencanje");
		// simbolika2.add("porodica");
		// List<String> simbolika3 = new ArrayList<>();
		// simbolika3.add("rodjendan");

        String[] a1 = {"pomen", "vencanje", "postovanje", "krstenje", "slava", "zahvalnost"};
		Cvet ruzaBela = new Cvet(1L, "ruza", "opis", "bela", Arrays.asList(a1), Cvet.Miris.BLAG, sezone1234, tp1);

        String[] a2 = {"ljubav", "postovanje", "Dan zena"};
		Cvet ruzaCrvena = new Cvet(2L, "ruza", "opis", "crvena", Arrays.asList(a2), Cvet.Miris.BLAG, sezone1234, tp1);

        String[] kalaR = {"vencanje", "krstenje", "pomen", "porodica"};
		Cvet kalaRoze = new Cvet(3L, "kala", "opis", "roze", Arrays.asList(kalaR), Cvet.Miris.BLAG, sezone23, tp1);

        String[] kalaC = {"vencanje", "krstenje", "pomen", "ljubav"};
		Cvet kalaCrvena = new Cvet(4L, "kala", "opis", "crvena", Arrays.asList(kalaC), Cvet.Miris.BLAG, sezone23, tp1);

        String[] kalaB = {"vencanje", "pomen", "krstenje", "porodica"};
		Cvet kalaBela = new Cvet(5L, "kala", "opis", "bela", Arrays.asList(kalaB), Cvet.Miris.BLAG, sezone23, tp1);

        String[] ruzaZ = {"prijateljstvo", "radost", "krstenje", "slava"};
		Cvet ruzaZuta = new Cvet(6L, "ruza", "opis", "zuta", Arrays.asList(ruzaZ), Cvet.Miris.BLAG, sezone1234, tp1);

        String[] ruzaR = {"prijateljstvo", "radost", "zhvalnost"};
		Cvet ruzaRoze = new Cvet(7L, "ruza", "opis", "roze", Arrays.asList(ruzaR), Cvet.Miris.BLAG, sezone1234, tp1);

        String[] narcisB = {"krstenje", "postovanje", "poseta", "dom"};
		Cvet narcisBeli = new Cvet(8L, "narcis", "opis", "beli", Arrays.asList(narcisB), Cvet.Miris.NEMA, sezone2, tp2);

        String[] narcisZ = {"krstenje", "prijetaljstvo", "poseta", "dom"};
		Cvet narcisZuti = new Cvet(9L, "narcis", "opis", "zuti", Arrays.asList(narcisZ), Cvet.Miris.NEMA, sezone2, tp2);

        List<Cvet> cvece = new ArrayList<>();
		cvece.add(ruzaBela);
		cvece.add(ruzaCrvena);
        cvece.add(ruzaRoze);
        cvece.add(ruzaZuta);
		cvece.add(kalaRoze);
        cvece.add(kalaCrvena);
        cvece.add(kalaBela);
        cvece.add(narcisBeli);
        cvece.add(narcisZuti);

		VrsteCveca vrste = new VrsteCveca(cvece, 0);

        return vrste;
    }

    private Proizvodi getProizvodi() {
        Map<Long, Integer> cveceMap1 = new HashMap<>();
		cveceMap1.put(1L, 5);
		Map<Long, Integer> cveceMap2 = new HashMap<>();
		cveceMap2.put(2L, 10);
		Map<Long, Integer> cveceMap3 = new HashMap<>();
		cveceMap3.put(3L, 3);
		Proizvod p1 = new Proizvod(1L, "bele ruze", "opis", TipProizvoda.BUKET, cveceMap1, 1000.0, 0.0);
		Proizvod p2 = new Proizvod(2L, "crvene ruze", "opis", TipProizvoda.BUKET, cveceMap2, 1800.0, 0.0);
		Proizvod p3 = new Proizvod(3L, "roze kale", "opis", TipProizvoda.BUKET, cveceMap3, 950.0, 0.0);
		List<Proizvod> proizvodi = new ArrayList<>();
		proizvodi.add(p1);
		proizvodi.add(p2);
		proizvodi.add(p3);

        Proizvodi proizvodiclass = new Proizvodi(proizvodi, 0);

        return proizvodiclass;
    } 

	private Cvet getCvetById(Long id, VrsteCveca cvece){
		for(Cvet c : cvece.getCvece()){
			if(c.getId().equals(id)){
				return c;
			}
		}
		return null;
	}
}
