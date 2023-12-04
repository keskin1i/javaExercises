package etkinlikOnerme;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Lütfen hava sıcaklığını giriniz : ");
		int heat = input.nextInt();

		if (heat > 5) {

			if (heat < 10) {

				System.out.println("Sinemaya gidebilirsiniz.");
				
			} else if (heat >= 10 && heat <= 15) {
				
				System.out.println("Pikniğe gidebilirsiniz.");
				System.out.println("Sinemaya gidebilirsiniz.");
				
			} else if (heat >= 10 && heat <= 25) {
				
				System.out.println("Sinemaya gidebilirsiniz.");
			}

		} else {
			
			System.out.println("Kayak yapabilirsiniz.");
		}
	}
}
