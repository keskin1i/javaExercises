package recursiveAsalSayi;

import java.util.Scanner;

public class Main {

	static boolean isPrime(int divider, int divisor) {
		if (divisor == 1) {
			return true;
		}
		if (divider % divisor == 0) {
			return false;
		}
		return isPrime(divider, divisor - 1);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int number = input.nextInt();

		if (isPrime(number, number / 2)) {
			System.out.println(number + " bir asal sayıdır.");
		} else {
			System.out.println(number + " bir asal sayı değildir.");
		}

	}
}
