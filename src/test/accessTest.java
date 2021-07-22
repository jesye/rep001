package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import prova.Prova;

class accessTest {

	Prova a = new Prova();
	
	@Test
	void test() {
		
		
		
		a.incremento();
		
	}

	
	@Test
	void test2() {
	a.msg();
		
		
	}
	
	
	
}
