package tr.edu.medipol.yova;



public class HesaplamaCarpma {

	public static void main(String[] args) {
		HesaplamaCarpma h = new HesaplamaCarpma();
		 int carpmaSonucu = h.carpma(5, 6);
		 System.out.println(carpmaSonucu);
   
	}

	int carpma(int sayi1, int sayi2) {
		int sonuc = sayi1 * sayi2;
		return sonuc;
	}
} 
