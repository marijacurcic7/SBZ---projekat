package com.flowershop.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.flowershop.model.Cvet;
import com.flowershop.model.Kupac;
import com.flowershop.model.Proizvod;
import com.flowershop.model.Proizvodi;
import com.flowershop.model.TipProizvoda;
import com.flowershop.model.TipoviProizvoda;
import com.flowershop.model.VrsteCveca;
import com.flowershop.model.Zahtev;

public class ModelFactory {
    
    public static Kupac getKupac10(){
        return new Kupac(1L, "Ime", "Prezime", "kupac1", "password", null, null, 5000.0, 0.0);
    }

    public static Kupac getKupac20(){
        return new Kupac(2L, "Ime", "Prezime", "kupac2", "password", null,  null, 12000.0, 0.0);
    }

    public static Kupac getKupac30(){
        return new Kupac(3L, "Ime", "Prezime", "kupac3", "password", null, null, 15080.0, 0.0);
    }

    // public static Zahtev getZahtev(){
        
    // }

    public static TipoviProizvoda getTipoviProizvoda(){
        TipoviProizvoda tipovi = new TipoviProizvoda();
        List<TipProizvoda> tipoviProizvoda = new ArrayList<>();
        tipoviProizvoda.add(TipProizvoda.REZANO_CVECE);
        tipovi.setTipovi(tipoviProizvoda);
        return tipovi; 
    }

    public static VrsteCveca getVrsteCveca(int red){

        List<Cvet.Sezona> sezone1 = new ArrayList<>();
		sezone1.add(Cvet.Sezona.JESEN);
        sezone1.add(Cvet.Sezona.ZIMA);
		List<Cvet.Sezona> sezone2 = new ArrayList<>();
		sezone2.add(Cvet.Sezona.JESEN);
		sezone2.add(Cvet.Sezona.PROLECE);
		List<TipProizvoda> tp1 = new ArrayList<>();
		// tp1.add(TipProizvoda.ARANZMAN);
		tp1.add(TipProizvoda.BUKET);

        List<TipProizvoda> tp2 = new ArrayList<>();
		tp1.add(TipProizvoda.SAKSIJSKO_CVECE);
		tp1.add(TipProizvoda.BUKET);

        List<TipProizvoda> tp3 = new ArrayList<>();
		tp1.add(TipProizvoda.VENAC);
		tp1.add(TipProizvoda.BUKET);

		List<String> simbolika = new ArrayList<>();
		simbolika.add("pomen");
		simbolika.add("vencanje");
		simbolika.add("Dan zena");
		List<String> simbolika2 = new ArrayList<>();
		simbolika2.add("vencanje");
		simbolika2.add("porodica");
        simbolika2.add("poseta");
		List<String> simbolika3 = new ArrayList<>();
		simbolika3.add("Dan zena");
        simbolika.add("postovanje");
		Cvet c1 = new Cvet(1L, "ruza", "opis", "bela", simbolika, Cvet.Miris.BLAG, sezone2, tp3);
		Cvet c2 = new Cvet(2L, "kala", "opis", "roze", simbolika2, Cvet.Miris.NEMA, sezone1, tp1);
		Cvet c3 = new Cvet(2L, "ruza", "opis", "crvena", simbolika3, Cvet.Miris.BLAG, sezone2, tp2);

		List<Cvet> cvece = new ArrayList<>();
		cvece.add(c1);
		cvece.add(c2);
		cvece.add(c3);

		VrsteCveca vrste = new VrsteCveca(cvece, red);
        return vrste;
    }

    public static Proizvodi getProizvodi(){
        Proizvodi proizvodi = new Proizvodi();
        
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

        Cvet c1 = new Cvet(1L, "ruza", "opis", "bela", simbolika, Cvet.Miris.BLAG, sezone2, tp1);
		Cvet c2 = new Cvet(2L, "kala", "opis", "roze", simbolika2, Cvet.Miris.BLAG, sezone2, tp1);
		Cvet c3 = new Cvet(2L, "ruza", "opis", "crvena", simbolika2, Cvet.Miris.BLAG, sezone2, tp1);

		Map<Long, Integer> cveceMap1 = new HashMap<>();
		cveceMap1.put(1L, 5);
		Map<Long, Integer> cveceMap2 = new HashMap<>();
		cveceMap2.put(1L, 10);
		Map<Long, Integer> cveceMap3 = new HashMap<>();
		cveceMap3.put(2L, 3);
        Map<Long, Integer> cveceMap4 = new HashMap<>();
		cveceMap3.put(3L, 4);

		// Proizvod p1 = new Proizvod(1L, "bele ruze", "opis", TipProizvoda.BUKET, cveceMap1, 1000.0, 0.0);
		// Proizvod p2 = new Proizvod(2L, "bele ruze", "opis", TipProizvoda.BUKET, cveceMap2, 1200.0, 0.0);
		// Proizvod p3 = new Proizvod(1L, "roze kale", "opis", TipProizvoda.BUKET, cveceMap3, 950.0, 0.0);
		// Proizvod p4 = new Proizvod(1L, "roze kale", "opis", TipProizvoda.SAKSIJSKO_CVECE, cveceMap4, 950.0, 0.0);

        List<Proizvod> lista = new ArrayList<>();
        // lista.add(p1);
        // lista.add(p2);
        // lista.add(p3);
        // lista.add(p4);

        proizvodi.setProizvodi(lista);
        
        
        return proizvodi;
    }
}
