package warsztaty;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) throws IOException {

		String fileName1 = "LiczbyLotto.txt";
		Random r = new Random();
		int minRand = 1;
		int maxRand = 49;

		ArrayList<String> lottoNumb = new ArrayList<>();

		String userNumb = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Wytypuj 6 liczb od 1 do 49");

		for (int i = 0; i < 6; i++) {

			userNumb = sc.next();
			lottoNumb.add(userNumb);

		}
		sc.close();
		ArrayList<Integer> randNumbList = new ArrayList<>();
		Integer wylosowana = r.nextInt((maxRand - minRand) + 1) + minRand;
		randNumbList.add(wylosowana);
		for (int i = 0; i < 5; i++) {
			do {
				wylosowana = r.nextInt((maxRand - minRand) + 1) + minRand;
			} while (randNumbList.contains(wylosowana));
			randNumbList.add(wylosowana);
			System.out.println(wylosowana);

		}

		Path path1 = Paths.get(fileName1);

		Files.write(path1, lottoNumb);

		int count = 0;

		for (int i = 0; i < randNumbList.size(); i++) {
			for (int j = 0; j < randNumbList.size(); j++) {

				if (randNumbList.get(i) == Integer.parseInt(lottoNumb.get(j))) {
					count++;
				}
			}
		}
		if (count == 6) {
			System.out.println("Wygrałeś totka!");
		} else if (count == 5) {
			System.out.println("Trafiłeś piątke!");
		} else if (count == 4) {
			System.out.println("Trafiłeś czwórke!");
		} else if (count == 3) {
			System.out.println("Trafiłeś trójke!");
		} else {
			System.out.println("Może następnym razem bedzie lepiej :).");
		}
		System.out.println(count);

		System.out.println(randNumbList);
		System.out.println(lottoNumb);

	}

}
