package prova;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class ProvaMain {
	private static final Logger log = LogManager.getLogger(ProvaMain.class);
	
	public static void main(String[] args) {

//		Prova a = new Prova();
//		a.incremento();
	
		log.trace("Messaggio di trace");   //ti permette di stampare tutti i log sotto
	    log.debug("Messaggio di debug");  //li metti come debug e te li stampa con tutto il resto quando lo attivi
		log.info("Messaggio di info");   //da le info di ciò che fa l'app e tutto il resto sotto
		log.warn("Messaggio di warn");   //da messaggi di warning e tutto il resto
		log.error("Messaggio di error");  //serve per segnalare errori va in qualche if fallimento 
		log.fatal("Messaggio di fatal");   //serve quando il programma sta crashando
		

	
	}
private void doSomething() {
	
}
}
