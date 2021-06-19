// package com.flowershop.backend;

// import com.flowershop.model.Kupac;
// import com.flowershop.util.KnowledgeSessionHelper;
// import com.flowershop.util.ModelFactory;

// import org.junit.BeforeClass;
// import org.junit.jupiter.api.Test;
// import org.kie.api.KieServices;
// import org.kie.api.runtime.KieContainer;
// import org.kie.api.runtime.KieSession;

// import static org.hamcrest.CoreMatchers.is;
// import static org.junit.Assert.assertThat;


// public class PopustiTest {
    
//     KieSession kSession = null;
// 	static KieContainer kieContainer;
//     static KieServices ks;
	
// 	@BeforeClass
// 	public static void beforeClass() {
//         ks = KieServices.Factory.get();
// 		kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));
// 		// kieContainer = KnowledgeSessionHelper.createRuleBase();
// 	}
// 	@SuppressWarnings("unchecked")
// 	@Test
// 	public void test1() {
//         KieServices ks = KieServices.Factory.get();
//         kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));

// 		// KieSession kSession = KnowledgeSessionHelper.getStatefulKnowledgeSession(kieContainer, "test-session");
// 		KieSession kSession = kieContainer.newKieSession("test-session");

//         Kupac k = ModelFactory.getKupac10();
        
//         kSession.insert(k);
        
//         int fired = kSession.fireAllRules();

//         assertThat(1, is(fired));
//         assertThat(k.getPopust(), is(10.0));
		
// 	}
//     @SuppressWarnings("unchecked")
// 	@Test
// 	public void test2() {
// 		// KieSession kSession = KnowledgeSessionHelper.getStatefulKnowledgeSession(kieContainer, "test-session");
//         KieServices ks = KieServices.Factory.get();
//         kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));

//         KieSession kSession = kieContainer.newKieSession("test-session");
//         Kupac k = ModelFactory.getKupac20();
        
//         kSession.insert(k);
        
//         int fired = kSession.fireAllRules();

//         assertThat(1, is(fired));
//         assertThat(k.getPopust(), is(20.0));
		
// 	}
//     @SuppressWarnings("unchecked")
// 	@Test
// 	public void test3() {
// 		// KieSession kSession = KnowledgeSessionHelper.getStatefulKnowledgeSession(kieContainer, "test-session");
//         KieServices ks = KieServices.Factory.get();
//         kieContainer = ks.newKieContainer(ks.newReleaseId("sbnz.integracija", "drools-spring-kjar", "0.0.1-SNAPSHOT"));

//         KieSession kSession = kieContainer.newKieSession("test-session");

//         Kupac k = ModelFactory.getKupac30();
        
//         kSession.insert(k);
        
//         int fired = kSession.fireAllRules();

//         assertThat(1, is(fired));
//         assertThat(k.getPopust(), is(30.0));
		
// 	}
// }
