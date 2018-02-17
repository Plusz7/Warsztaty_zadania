package warsztaty;


import java.util.Random;
import java.util.Scanner;

public class Zad1 {

	public static void main(String[] args) {
		
		gra(10);

	}

	static void gra(int count) {

		Random r = new Random();
		int minRand = 0;
		int maxRand = 100;
		int wylosowana = r.nextInt((maxRand - minRand) + 1) + minRand;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Podaj liczbe od 0 do 100, musisz zgadnąć w maximum " + count + " ruchach.");
		for (int i = 1; i <= count; i++) {

			int a = sc.nextInt();
			if (a != wylosowana) {
				if ( a > wylosowana) {
					System.out.println("Za dużo!");
					
				} else if ( a < wylosowana) {
					System.out.println("Za mało!");
				}

			} 
			if (i == count && a != wylosowana) {
				System.out.println("Przegrałeś!");
			}
			if ( a == wylosowana ){
				System.out.println("Zgadłeś!");

			}
		}
		
	}
}