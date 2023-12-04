package hipotenusHesapalama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("A kenarını giriniz : ");
		int a = input.nextInt();
		System.out.print("B kenarını giriniz : ");
		int b = input.nextInt();
		System.out.print("C kenarını giriniz : ");
		int c = input.nextInt();

		int u = (a + b + c) / 2;
		int cevre = 2 * u;
		double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

		System.out.println("Üçgenin çevresi : " + cevre);
		System.out.println("Üçgenin alanı : " + alan);

	}

}
