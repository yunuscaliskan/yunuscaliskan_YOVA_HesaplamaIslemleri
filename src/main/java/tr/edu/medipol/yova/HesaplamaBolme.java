package tr.edu.medipol.yova;



public class HesaplamaBolme {

	public static void main(String[] args) {
		HesaplamaBolme h = new HesaplamaBolme();
		 double bolmeSonucu = h.bolme(9, 3);
		 System.out.println(bolmeSonucu);
   
	}

	double bolme(int i, int j) {
		
		return 0;
	}

	double bolme(int sayi1, int sayi2) {
		float sonuc = sayi1 / sayi2;
		return sonuc;
	}
} 


