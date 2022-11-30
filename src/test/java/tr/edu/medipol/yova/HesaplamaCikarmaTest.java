package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaCikarmaTest {

	@Test
	public void HesaplamaCikarmaTestt() {
	
		int sayi1 = 61;
		int sayi2 = 11;
		HesaplamaCikarma h = new HesaplamaCikarma();
		int gerceklesen = h.cikarma(sayi1, sayi2);
		assertEquals(50, gerceklesen);
		
		
	}

	
	
	
}