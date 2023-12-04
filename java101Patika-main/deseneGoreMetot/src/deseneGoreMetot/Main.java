package deseneGoreMetot;

import java.util.Scanner;

public class Main {

	static void recursiveMetot(int n) {
		if (n > 0) {
			System.out.print(n + " ");
			recursiveMetot(n - 5);
		}
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("N sayısını giriniz : ");
		int n = input.nextInt();

		System.out.print("Çıktı : ");
		recursiveMetot(n);
	}
}
