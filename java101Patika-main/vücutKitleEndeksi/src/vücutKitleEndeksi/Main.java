package vücutKitleEndeksi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen boyunuzu metre cinsinden giriniz : ");
		double boy = input.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz : ");
		double kilo = input.nextInt();
		
		double kitleEndeksi= kilo/(boy*boy);
		System.out.println("Vücut kitle Endeksiniz : "+kitleEndeksi);

	}

}
