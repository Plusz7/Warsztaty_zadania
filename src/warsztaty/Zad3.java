package warsztaty;

import java.util.Scanner;

public class Zad3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Pomyśl liczbę od 0 do 1000 a ja ją zgadnę w 10ciu ruchach >;). Wciśnij enter kiedy bedziesz gotowy.");
		
		
		int min = 0;
		int max = 1000;
				
		String ans = "";
		
		for (int i = 1; i < 11; i++) {
			
			int guess = ((max - min)/2)+min;
			System.out.println("Próba nr "+ i + ". Zgaduję: " + guess + "?");
			ans = sc.nextLine();
			if (ans.equals("tak")) {
				System.out.println("Wygrałem!");
				break;
			} else if (ans.equals("za duzo")) {
				max = guess;
			} else if (ans.equals("za malo")) {
				min = guess;
			} else if (i==10) {
				System.out.println("Nie oszukuj ! >;[");
			}
			
			
		}
		
		
		
		
		
		
		
	}

}
