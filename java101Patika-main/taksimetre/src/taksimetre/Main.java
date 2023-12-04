package taksimetre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Km değerini giriniz : ");
		double startPrice = 10;
		int km = input.nextInt();
		double perKm = 2.20;
		double total = km * perKm;
		total += startPrice;

		total = (total < 20) ? 20 : total;
		System.out.println("Toplam tutar : " + total);
	}

}
