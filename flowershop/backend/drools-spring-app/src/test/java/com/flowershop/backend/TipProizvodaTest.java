package com.flowershop.backend;

import com.flowershop.model.TipProizvoda;
import com.flowershop.model.TipoviProizvoda;
import com.flowershop.model.VrsteCveca;
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

public class TipProizvodaTest {

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
	public void testVenac() {

        KieServices ks = KieServices.Factory.get();
        kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
		KieSession kSession = kieContainer.newKieSession("test-session");

        Zahtev zahtev = new Zahtev();
        zahtev.setMinCena(1000.0);
        zahtev.setMaxCena(5000.0);
		zahtev.setRazlogKupovine("pomen");
		zahtev.setSezona(Cvet.Sezona.JESEN);
        kSession.insert(zahtev);

        TipoviProizvoda tp = ModelFactory.getTipoviProizvoda();
        kSession.insert(tp);

        VrsteCveca vrste = ModelFactory.getVrsteCveca(2);
        kSession.insert(vrste);

        int fired = kSession.fireAllRules();

        assertThat(2, is(fired));
        assertThat(3, is(tp.getTipovi().size()));
        assertTrue(tp.getTipovi().contains(TipProizvoda.VENAC));
        assertFalse(tp.getTipovi().contains(TipProizvoda.ARANZMAN));
        assertTrue(tp.getTipovi().contains(TipProizvoda.BUKET));
        assertTrue(tp.getTipovi().contains(TipProizvoda.REZANO_CVECE));
        assertFalse(tp.getTipovi().contains(TipProizvoda.SAKSIJSKO_CVECE));

		
	}

    @SuppressWarnings("unchecked")
	@Test
	public void testBezVenca() {

        KieServices ks = KieServices.Factory.get();
        kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
		KieSession kSession = kieContainer.newKieSession("test-session");

        Zahtev zahtev = new Zahtev();
        zahtev.setMinCena(1000.0);
        zahtev.setMaxCena(4999.0);
		zahtev.setRazlogKupovine("pomen");
		zahtev.setSezona(Cvet.Sezona.JESEN);
        kSession.insert(zahtev);

        TipoviProizvoda tp = ModelFactory.getTipoviProizvoda();
        kSession.insert(tp);

        VrsteCveca vrste = ModelFactory.getVrsteCveca(2);
        kSession.insert(vrste);

        int fired = kSession.fireAllRules();

        assertThat(1, is(fired));
        assertThat(2, is(tp.getTipovi().size()));
        assertFalse(tp.getTipovi().contains(TipProizvoda.VENAC));
        assertFalse(tp.getTipovi().contains(TipProizvoda.ARANZMAN));
        assertTrue(tp.getTipovi().contains(TipProizvoda.BUKET));
        assertTrue(tp.getTipovi().contains(TipProizvoda.REZANO_CVECE));
        assertFalse(tp.getTipovi().contains(TipProizvoda.SAKSIJSKO_CVECE));

		
	}


    @SuppressWarnings("unchecked")
	@Test
	public void testSaksijskoCvece() {

        KieServices ks = KieServices.Factory.get();
        kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
		KieSession kSession = kieContainer.newKieSession("test-session");

        Zahtev zahtev = new Zahtev();
        zahtev.setMinCena(1000.0);
        zahtev.setMaxCena(4999.0);
		zahtev.setRazlogKupovine("slava");
		zahtev.setSezona(Cvet.Sezona.JESEN);
        kSession.insert(zahtev);

        TipoviProizvoda tp = ModelFactory.getTipoviProizvoda();
        kSession.insert(tp);

        VrsteCveca vrste = ModelFactory.getVrsteCveca(2);
        kSession.insert(vrste);

        int fired = kSession.fireAllRules();

        assertThat(2, is(fired));
        assertThat(3, is(tp.getTipovi().size()));
        assertFalse(tp.getTipovi().contains(TipProizvoda.VENAC));
        assertFalse(tp.getTipovi().contains(TipProizvoda.ARANZMAN));
        assertTrue(tp.getTipovi().contains(TipProizvoda.BUKET));
        assertTrue(tp.getTipovi().contains(TipProizvoda.REZANO_CVECE));
        assertTrue(tp.getTipovi().contains(TipProizvoda.SAKSIJSKO_CVECE));

		
	}
}
