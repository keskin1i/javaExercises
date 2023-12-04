package enYakinKucukVeBuyukSayi;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int[] list = { 15, 12, 788, 1, -1, -788, 2, 0 };
		System.out.println(Arrays.toString(list));

		System.out.print("Bir sayı giriniz : ");
		int number = input.nextInt();

		int min = list[0];
		int max = list[0];

		for (int i : list) {
			if (i < number) {
				min = i;
			}
			if (i > number) {
				max = i;
			}
		}
		System.out.println("maksimum sayı : " + max);
		System.out.println("minumum sayı : " + min);

		Arrays.sort(list);

		for (int i : list) {
			if (i > min && i < number) {
				min = i;
			}

			if (i < max && i > number) {
				max = i;
			}

		}
		System.out.println("Girilen değere yakın en küçük sayı : " + min);
		System.out.println("Girilen değere yakın en büyük sayı : " + max);

	}
}