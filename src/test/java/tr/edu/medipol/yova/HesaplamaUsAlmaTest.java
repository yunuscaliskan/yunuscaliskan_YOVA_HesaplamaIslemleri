package tr.edu.medipol.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamaUsAlmaTest {

	@Test
	public void HesaplamaUsAlmaTestt() {
	
		int taban = 4;
		int kuvvet = 5;
		HesaplamaUsAlma h = new HesaplamaUsAlma();
        double sonuc = Math.pow(taban, kuvvet);
        assertArrayEquals(1024.0, sonuc);
		
		
	}

	private void assertArrayEquals(double d, double sonuc) {
		
		
	}

	
	
	
}