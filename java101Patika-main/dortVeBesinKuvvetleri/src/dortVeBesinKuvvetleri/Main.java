package dortVeBesinKuvvetleri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Bir sayı giriniz : ");
		int number = scanner.nextInt();

		System.out.print("4 sayısının kuvvetleri : ");
		for (int i = 1; i <= number; i *= 4) {

			if (i == 1) {
				continue;
			}
			System.out.print(i + ",");
		}

		System.out.println();

		System.out.print("5 sayısının kuvvetleri : ");
		for (int i = 1; i < number; i *= 5) {

			if (i == 1) {
				continue;
			}
			System.out.print(i + ",");
		}
	}

}
