package daireAlanVeCevre;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double pi = 3.14; // pi sayısı sabit olduğu için burda tanımlandı.

		System.out.print("Dairenin yarıçapını giriniz : ");
		int r = input.nextInt();

		System.out.print("Dairenin merkez açısının ölçüsünü giriniz :");
		int a = input.nextInt();

		double daireDilimiAlani = (pi * (r*r) * a) / 360;

		System.out.println("Dairenin diliminin alanı : " + daireDilimiAlani);

	}
}
