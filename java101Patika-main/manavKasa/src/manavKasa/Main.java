package manavKasa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.00;

		System.out.print("Kaç kilo armut ? : ");
		double armut = input.nextDouble();

		System.out.print("Kaç kilo elma ? : ");
		double elma = input.nextDouble();

		System.out.print("Kaç kilo domates ? : ");
		double domates = input.nextDouble();

		System.out.print("Kaç kilo muz ? : ");
		double muz = input.nextDouble();

		System.out.print("Kaç kilo patlıcan ? : ");
		double patlican = input.nextDouble();

		double tutar = (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat)
				+ (patlican * patlicanFiyat);
		System.out.println("Toplam tutar : " + tutar); 
	}

}