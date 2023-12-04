package gelismisHesapMakinesi;

import java.util.Scanner;

/*	static int sum(int a, int b) {
		int result = a + b;
		System.out.println("Toplam : " + result);
		return result;
	}

	static int minus(int a, int b) {
		int result = a - b;
		System.out.println("Toplam : " + result);
		return result;
	}

	static int times(int a, int b) {
		int result = a * b;
		System.out.println("Toplam : " + result);
		return result;
	}

	static int divided(int a, int b) {
		if (b == 0) {
			System.out.println("Bir sayı sıfıra bölünemez!");
			return 0;
		}
		int result = a / b;
		System.out.println("Toplam : " + result);
		return result;
	}

	static int power(int a, int b) {
		int result = 1;
		for (int i = 1; i <= b; i++) {
			result *= a;

		}
		System.out.println(a + " ^ " + b + " = " + result);
		return result;
	}

	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int select;

		String menu = "1- Toplama İşlemi\n" + "2- Çıkarma İşlemi\n" + "3- Çarpma İşlemi\n" + "4- Bölme İşlemi\n"
				+ "5- Üslü Sayı Hesaplama\n" + "6- Mod Alma\n" + "7- Dikdörthgen Alan ve Çevre Hesabı\n"
				+ "0- Çıkış yap";

		while (true) {
			System.out.println(menu);

			System.out.print("Bir işlem seçiniz : ");
			select = input.nextInt();

			if (select == 0) {
				break;
			}

			System.out.print("İlk sayıyı giriniz : ");
			int a = input.nextInt();

			System.out.print("İkinci sayıyı giriniz : ");
			int b = input.nextInt();

			int result = 0;

			switch (select) {
			case 1:
				sum(a, b);
				break;
			case 2:
				minus(a, b);
				break;
			case 3:
				times(a, b);
				break;
			case 4:
				divided(a, b);
				break;
			case 5:
				power(a, b);
				break;
			case 6:
				mod(a, b);
				break;
			case 7:
				calculate(a, b);
			default:
				System.out.println("Hatalı tuşlama yaptınız tekrar deneyiniz.");
				break;
			}

		}
	}
	
	*/

public class Main {

	static void plus() {
		Scanner scan = new Scanner(System.in);
		int number, result = 0;
		System.out.print("Kaç adet sayı gireceksiniz : ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i + ". sayı :");
			number = scan.nextInt();
			result += number;
		}
		System.out.println("Sonuç : " + result);
	}

	static void minus() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç adet sayı gireceksiniz : ");
		int n = scan.nextInt();
		int number, result = 0;

		for (int i = 1; i <= n; i++) {
			System.out.print(i + ". sayı :");
			number = scan.nextInt();
			if (i == 1) {
				result += number;
				continue;
			}
			result -= number;
		}

		System.out.println("Sonuç : " + result);
	}

	static void times() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç adet sayı gireceksiniz : ");
		int n = scan.nextInt();
		int number, result = 1;

		for (int i = 1; i <= n; i++) {

			System.out.print(i + ". sayı :");
			number = scan.nextInt();

			if (number == 0) {
				result = 0;
				break;
			}
			result *= number;
		}

		System.out.println("Sonuç : " + result);
	}

	static void divided() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç adet sayı gireceksiniz :");
		int n = scan.nextInt();
		double number, result = 0.0;

		for (int i = 1; i <= n; i++) {
			System.out.print(i + ". sayı :");
			number = scan.nextDouble();
			if (i != 1 && number == 0) {
				System.out.println("Böleni 0 giremezsiniz.");
				continue;
			}
			if (i == 1) {
				result = number;
				continue;
			}
			result /= number;
		}

		System.out.println("Sonuç : " + result);
	}

	static void power() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban değeri giriniz :");
		int base = scan.nextInt();
		System.out.print("Üs değeri giriniz :");
		int exponent = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}

		System.out.println("Sonuç : " + result);
	}

	static void factorial() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayı giriniz :");
		int n = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		System.out.println("Sonuç : " + result);
	}

	static void mod() {
		Scanner scan = new Scanner(System.in);
		System.out.print("İlk sayıyı giriniz : ");
		int number = scan.nextInt();
		
		System.out.print("İkinci sayıyı giriniz :");
		int number2 = scan.nextInt();
		
		int result = number % number2;
		System.out.println("Sonuç : " + result);
	}

	static void calculate() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Uzun kenarı giriniz : ");
		int longSide = scan.nextInt();

		System.out.print("Kısa kenarı giriniz : ");
		int shortSide = scan.nextInt();

		int perimeter = 2 * (longSide + shortSide);
		System.out.println("Dikdörtgenin çevresi : " + perimeter);
		int area = shortSide * longSide;
		System.out.println("Dikdörtgenin alanı : " + area);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		String menu = "1- Toplama İşlemi\n" + "2- Çıkarma İşlemi\n" + "3- Çarpma İşlemi\n" + "4- Bölme işlemi\n"
				+ "5- Üslü Sayı Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n"
				+ "8- Dikdörtgen Alan ve Çevre Hesabı\n" + "0- Çıkış Yap";

		do {
			System.out.println(menu);
			System.out.print("Lütfen bir işlem seçiniz :");
			select = scan.nextInt();
			switch (select) {
			case 1:
				plus();
				break;
			case 2:
				minus();
				break;
			case 3:
				times();
				break;
			case 4:
				divided();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7:
				mod();
				break;
			case 8:
				calculate();
				break;
			case 0:
				System.out.println("Çıkış yapılıyor...\n" + "Çıkış yapıldı.");
				break;
			default:
				System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
			}
		} while (select != 0);

	}
}
