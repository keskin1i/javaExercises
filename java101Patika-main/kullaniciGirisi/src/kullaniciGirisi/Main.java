package kullaniciGirisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Lütfen kullanıcı adınızı giriniz : ");
		String userName = input.nextLine();

		System.out.print("Şifrenizi giriniz : ");
		String password = input.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {
			System.out.println("Giriş yaptınız");

		} else if (!(userName.equals("patika")) && !(password.equals("java123"))) {
			System.out.print("Kullanıcı adı ve şifre yanlış! Lütfen bilgileri kontrol edip tekrar deneyiniz.");

		} else if (!userName.equals("patika") && password.equals("java123")) {
			System.out.println("Kullanıcı adınız yanlış tekrar deneyin");

		} else if (userName.equals("patika") && !password.equals("java123")) {
			System.out.println("Şifreniz yanlış");
			System.out.println("Yeni şifre oluşturmak için 1'e\nÇıkış için 2'ye basınız.");
			int choose = input.nextInt();

			switch (choose) {
			case 1:
				System.out.print("Lütfen yeni şifrenizi giriniz : ");
				String newPassword = input.next();

				if (newPassword.equals("java123")) {
					System.out.println("Eski bir şifre girdiniz tekrar deneyiniz.");
				} else {
					System.out.println("Yeni şifreniz güncellendi.");
				}
				break;
			case 2:
				System.out.println("Çıkış yapıldı.");
				break;

			default:
				System.out.println("Hatalı tuşlama yaptınız. Tekrar deneyiniz.");
				break;
			}

		}

	}

}
