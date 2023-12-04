package harmonikSayiBulma;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("n sayısını giriniz : ");
		int n = input.nextInt();
		double total = 0;
		double number = 1; 

		for (int i = 1; i <= n; i++) {
			total += (number / i);
		}
		System.out.println(n + " sayısının harmonik sayısı : " + total);
	}
}
