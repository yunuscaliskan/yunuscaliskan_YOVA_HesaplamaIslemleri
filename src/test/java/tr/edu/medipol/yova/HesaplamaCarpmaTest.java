package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaCarpmaTest {

	@Test
	public void HesaplamaCarpmaTestt() {
	
		int sayi1 = 5;
		int sayi2 = 6;
		HesaplamaCarpma h = new HesaplamaCarpma();
		int gerceklesen = h.carpma(sayi1, sayi2);
		assertEquals(30, gerceklesen);
		
		
	}

	
	
	
}
