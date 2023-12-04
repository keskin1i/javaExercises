package usluSayiHesaplama;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Üssü alınacak sayıyı giriniz : ");
		int n = scanner.nextInt();

		System.out.print("Üs olacak sayıyı giriniz : ");
		int k = scanner.nextInt();

		int total = 1;
/*
		int i = 1;
		while (i <= k) {
			total = total * n;
			i++;
		}
		System.out.println(n + "^" + k + " : " + total);
*/
		
		for (int i = 1; i <= k; i++) {
			total *= n;
		}
		System.out.println(n + "^" + k + " : " + total);
	}
}
