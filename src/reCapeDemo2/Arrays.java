package reCapeDemo2;

public class Arrays {

	public static void main(String[] args) {

		String[] ogrenciler = new String[3]; //Strintg[] ogrenciler={"ahmet","ayse","deniz"}
		ogrenciler[0]="ahmet";
		ogrenciler[1]="ayse";
		ogrenciler[2]="deniz";

		for(String ogrenci:ogrenciler) { // ogrenci dizisindeki her bir elemani gez ogrenciye at
			System.out.println(ogrenci);
		}
		System.out.println("***************************");
		for(int i = 0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("***************************");
		
		
		double[] myList = {1.2,1.3,1.4,1.5,1.6}; // double[] myList=new double[5] denilebilir
		double total =0;
		double maxSayi=myList[0];
		for(double numbers:myList) {
			if(maxSayi<numbers) {
				maxSayi=numbers;
			}
			total=total+numbers;
			System.out.println(numbers);
			
			
		}
		System.out.println("toplam sayi="+total);
		System.out.println("En Buyuk sayi ="+ maxSayi);
	}

}
