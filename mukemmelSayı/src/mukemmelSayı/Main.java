package mukemmelSayı;

public class Main {

	public static void main(String[] args) {
		int number= 6;
		int total = 0;
		for(int x = 1;x<number;x++) {
			if(number%x==0) {
				total=total+x;
			}
		}
		if(total==number) {
			System.out.println("Mükemmel sayıdır.");
		}else {
			System.out.println("Mükemmel sayı değildir.");
		}

	}

}
