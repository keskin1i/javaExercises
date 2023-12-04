package minMaxHesaplama;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int max = 0, min = 0;

		System.out.print("Kaç tane sayı gireceksiniz : ");
		int counter = input.nextInt();

		for (int i = 1; i <= counter; i++) {

			System.out.print(i + ".sayı giriniz : ");
			int number = input.nextInt();

			if (number > max) {
				max = number;
			}
			if (number < min) {
				min = number;
			}
		}
		System.out.println("En büyük sayı : " + max);
		System.out.println("En küçük sayı : " + min);
	}
}
