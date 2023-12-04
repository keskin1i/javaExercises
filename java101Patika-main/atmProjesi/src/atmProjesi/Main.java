package atmProjesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String userName, password;
		int right = 3;
		double balance = 1500;
		double price = 0;

		int choose;

		while (right > 0) {
			System.out.print("Kullanıcı adınız : ");
			userName = input.nextLine();
			
			System.out.print("Parolanız : ");
			password = input.nextLine();

			if (userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhaba kodluyoruz bankasına hoşgeldiniz.");
				do {
					
					System.out.println("1-Para yatırma\n" 
										+ "2-Para çekme\n" 
										+ "3-Bakiye sorgulama\n"
										+ "4-Çıkış yap");
					System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
					choose = input.nextInt();
					
					switch (choose) {
					case 1:
						System.out.print("Yatırılıcak tutarı giriniz : ");
						price = input.nextDouble();
						balance += price;
						break;
					case 2:
						System.out.println("Çekilecek tutarı giriniz : ");
						price = input.nextDouble();
						if (price>balance) {
							System.out.println("Bakiyeniz yetersiz, Hesap bakiyenz : "+balance);
						}
						else {
							balance -= price;							
						}
						break;
					case 3:
						System.out.println("Bakiyeniz : " + balance);
						break;
					case 4:
						System.out.println("Çıkış yapılıyor...");
						break;
					default:
						System.out.println("Hatalı tuşlama yaptınız tekrar deneyiniz.");
					}

				} while (choose != 4);
				System.out.println("Tekrar görüşmek dileğiyle.");
				break;
				
			} else {
				right--;

				if (right == 0) {
					System.out.println("Hesabınız bloke edilmiştir. Lütfen bankayla iletişime geçiniz.");
				} else {
					System.out.println("Hatalı kullancı adı veya şifre girdiniz. Tekrar deneyiniz.");
					System.out.println("Kalan hakkınız : " + right);
				}

			}
		}
	}

}
