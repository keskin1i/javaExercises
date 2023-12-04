package ciftSayilarinToplami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number, total = 0;

		do {
			System.out.print("Bir sayı giriniz : ");
			number = input.nextInt();

			// 4'ün katı olması aynı zamanda çift olduğu anlamına gelmekte ama yinede göstermek istedim.
			if (number % 2 == 0 && number % 4 == 0) {
				total += number;
			}

		} while (number % 2 == 0);

		System.out.println("Çift sayıların toplamı : " + total);
	}

}
