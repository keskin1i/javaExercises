package recursiveUsluSayiHesaplama;

import java.util.Scanner;

public class Main {

	static int recursivePow(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		}
		return base * recursivePow(base, exponent - 1);

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Taban değerini giriniz : ");
		int base = input.nextInt();

		System.out.print("Üs değerini giriniz : ");
		int exponent = input.nextInt();

		int result = recursivePow(base, exponent);
		System.out.println("Sonuç : " + result);

	}
}
