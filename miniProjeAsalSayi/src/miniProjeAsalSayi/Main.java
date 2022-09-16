package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = -2;
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayı asal değildir.");
			return;
		}
		
		if(number<1){
			System.out.println("Geçersiz sayı.");
			return;
		}
		
		for(int x = 2;x<number;x++) {
			if(number%x==0) {
				isPrime = false;
			}
		}
		if(isPrime) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}

	}

}
