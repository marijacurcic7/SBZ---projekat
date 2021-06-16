package com.flowershop.backend;

import com.flowershop.model.Proizvodi;
import com.flowershop.model.Zahtev;
import com.flowershop.model.Cvet;

import com.flowershop.util.ModelFactory;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BrojCvetovaTest {

    KieSession kSession = null;
	static KieContainer kieContainer;
    static KieServices ks;
	
	@BeforeClass
	public static void beforeClass() {
        ks = KieServices.Factory.get();
		kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
	}
	@SuppressWarnings("unchecked")
	@Test
	public void testParni() {

        KieServices ks = KieServices.Factory.get();
        kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
		KieSession kSession = kieContainer.newKieSession("test-session");

        Zahtev zahtev = new Zahtev();
        zahtev.setMinCena(1000.0);
        zahtev.setMaxCena(5000.0);
		zahtev.setRazlogKupovine("pomen");
		zahtev.setSezona(Cvet.Sezona.JESEN);

        kSession.insert(zahtev);

        Proizvodi p = ModelFactory.getProizvodi();
        
        kSession.insert(p);
        
        int fired = kSession.fireAllRules();

        assertThat(1, is(fired));
        assertThat(1, is(p.getProizvodi().size()));
        assertTrue(p.getProizvodi().get(0).paranBrojCvetova());
		
	}

    @SuppressWarnings("unchecked")
	@Test
	public void testNeparni() {

        KieServices ks = KieServices.Factory.get();
        kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
		KieSession kSession = kieContainer.newKieSession("test-session");

        Zahtev zahtev = new Zahtev();
        zahtev.setMinCena(1000.0);
        zahtev.setMaxCena(5000.0);
		zahtev.setRazlogKupovine("poseta");
		zahtev.setSezona(Cvet.Sezona.JESEN);

        kSession.insert(zahtev);

        Proizvodi p = ModelFactory.getProizvodi();
        
        kSession.insert(p);
        
        int fired = kSession.fireAllRules();

        assertThat(1, is(fired));
        assertThat(3, is(p.getProizvodi().size()));
        assertFalse(p.getProizvodi().get(0).paranBrojCvetova());
        assertFalse(p.getProizvodi().get(1).paranBrojCvetova());
        assertTrue(p.getProizvodi().get(2).paranBrojCvetova());

		
	}
}
