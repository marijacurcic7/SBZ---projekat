package com.flowershop.backend;

import com.flowershop.model.Proizvodi;
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


public class VrstaCvecaTest {
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
	public void test1() {

        KieServices ks = KieServices.Factory.get();
        kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
		KieSession kSession = kieContainer.newKieSession("test-session");

        Zahtev zahtev = new Zahtev();
        zahtev.setMinCena(1000.0);
        zahtev.setMaxCena(5000.0);
		zahtev.setRazlogKupovine("vencanje");
		zahtev.setSezona(Cvet.Sezona.JESEN);
        kSession.insert(zahtev);

        VrsteCveca vrste = ModelFactory.getVrsteCveca(0);
        kSession.insert(vrste);

        kSession.getAgenda().getAgendaGroup("group1").setFocus();
        int fired = kSession.fireAllRules();

        assertThat(2, is(fired));
        assertThat(2, is(vrste.getRed()));
        assertThat(2, is(vrste.getCvece().size()));
		
	}

    @SuppressWarnings("unchecked")
	@Test
	public void test2() {

        KieServices ks = KieServices.Factory.get();
        kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
		KieSession kSession = kieContainer.newKieSession("test-session");

        Zahtev zahtev = new Zahtev();
        zahtev.setMinCena(1000.0);
        zahtev.setMaxCena(5000.0);
		zahtev.setRazlogKupovine("Dan zena");
		zahtev.setSezona(Cvet.Sezona.ZIMA);
        kSession.insert(zahtev);

        VrsteCveca vrste = ModelFactory.getVrsteCveca(0);
        kSession.insert(vrste);

        kSession.getAgenda().getAgendaGroup("group1").setFocus();
        int fired = kSession.fireAllRules();

        assertThat(1, is(fired));
        assertThat(2, is(vrste.getRed()));
        assertThat(0, is(vrste.getCvece().size()));
		
	}

    @SuppressWarnings("unchecked")
	@Test
	public void test21() {

        KieServices ks = KieServices.Factory.get();
        kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
		KieSession kSession = kieContainer.newKieSession("test-session");

        Zahtev zahtev = new Zahtev();
        zahtev.setMinCena(1000.0);
        zahtev.setMaxCena(5000.0);
		zahtev.setRazlogKupovine("Dan zena");
        zahtev.setMotiv("porodica");
		zahtev.setSezona(Cvet.Sezona.ZIMA);
        kSession.insert(zahtev);

        VrsteCveca vrste = ModelFactory.getVrsteCveca(0);
        kSession.insert(vrste);

        kSession.getAgenda().getAgendaGroup("group1").setFocus();
        int fired = kSession.fireAllRules();

        assertThat(1, is(fired));
        assertThat(2, is(vrste.getRed()));
        assertThat(1, is(vrste.getCvece().size()));
		
	}


    @SuppressWarnings("unchecked")
	@Test
	public void test3() {

        KieServices ks = KieServices.Factory.get();
        kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
		KieSession kSession = kieContainer.newKieSession("test-session");

        Zahtev zahtev = new Zahtev();
        zahtev.setMinCena(1000.0);
        zahtev.setMaxCena(5000.0);
		zahtev.setRazlogKupovine("ostalo");
        zahtev.setMotiv("postovanje");
		zahtev.setSezona(Cvet.Sezona.PROLECE);
        kSession.insert(zahtev);

        VrsteCveca vrste = ModelFactory.getVrsteCveca(0);
        kSession.insert(vrste);

        kSession.getAgenda().getAgendaGroup("group1").setFocus();
        int fired = kSession.fireAllRules();

        assertThat(2, is(fired));
        assertThat(2, is(vrste.getRed()));
        assertThat(1, is(vrste.getCvece().size()));
		
	}

    @SuppressWarnings("unchecked")
	@Test
	public void test4() {

        KieServices ks = KieServices.Factory.get();
        kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
		KieSession kSession = kieContainer.newKieSession("test-session");

        Zahtev zahtev = new Zahtev();
        zahtev.setMinCena(1000.0);
        zahtev.setMaxCena(5000.0);
		zahtev.setRazlogKupovine("poseta");
		zahtev.setSezona(Cvet.Sezona.PROLECE);
        kSession.insert(zahtev);

        VrsteCveca vrste = ModelFactory.getVrsteCveca(0);
        kSession.insert(vrste);

        kSession.getAgenda().getAgendaGroup("group1").setFocus();
        int fired = kSession.fireAllRules();

        assertThat(2, is(fired));
        assertThat(2, is(vrste.getRed()));
        assertThat(0, is(vrste.getCvece().size()));
		
	}
}
