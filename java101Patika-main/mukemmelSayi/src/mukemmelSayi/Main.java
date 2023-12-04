package mukemmelSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz : ");
		int number = input.nextInt();
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total = total + i;
			}
		}
		if (number < 1) {
			System.out.println("Geçersiz sayı.");
			return;
		}

		if (total == number) {
			System.out.println("Mükemmel sayıdır.");
		} else {
			System.out.println("Mükemmel sayı değildir.");
		}
	}

}