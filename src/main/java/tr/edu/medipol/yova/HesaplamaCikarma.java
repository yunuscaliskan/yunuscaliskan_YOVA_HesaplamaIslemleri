package tr.edu.medipol.yova;



public class HesaplamaCikarma {

	public static void main(String[] args) {
		 HesaplamaCikarma h = new HesaplamaCikarma();
		 int cikarmaSonucu = h.cikarma(61, 11);
		 System.out.println(cikarmaSonucu);
   
	}

	int cikarma(int sayi1, int sayi2) {
		int sonuc = sayi1 - sayi2;
		return sonuc;
	}
} 
