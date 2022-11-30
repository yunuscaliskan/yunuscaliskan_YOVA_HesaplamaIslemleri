package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaBolmeTest {

	@Test
	public void HesaplamaBolmeTestt() {
	
		int sayi1 = 9;
		int sayi2 = 3;
		HesaplamaBolme h = new HesaplamaBolme();
		double gerceklesen = h.bolme(sayi1, sayi2);
		assertArrayEquals(3, gerceklesen);
		
	}

	private void assertArrayEquals(double d, double sonuc) {
		
		
	}
}
	
	
	