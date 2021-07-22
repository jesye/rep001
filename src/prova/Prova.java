package prova;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Prova {

	private static final Logger log = LogManager.getLogger(Prova.class);
	
			List <Integer> list = new ArrayList<Integer>();
	
	
	public void incremento () {
	
		log.info("num elementi before: {}", list.size());
		
		for (int i = 0; i<10; i++) {
		
	    	list.add(i);
	    	log.info("num elementi during: {}", list.size());
		
	}
		log.info("num elementi after: {}", list.size());
	
	}
	
	public void msg () {
	
		log.trace("Messaggio di trace");   //ti permette di stampare tutti i log sotto
	    log.debug("Messaggio di debug");  //li metti come debug e te li stampa con tutto il resto quando lo attivi
		log.info("Messaggio di info");   //da le info di ciò che fa l'app e tutto il resto sotto
		log.warn("Messaggio di warn");   //da messaggi di warning e tutto il resto
		log.error("Messaggio di error");  //serve per segnalare errori va in qualche if fallimento 
		log.fatal("Messaggio di fatal");   //serve quando il programma sta crashando
		
	}
	
}
