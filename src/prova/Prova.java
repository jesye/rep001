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
	
	
	
}
