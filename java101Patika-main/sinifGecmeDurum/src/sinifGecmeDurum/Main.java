package sinifGecmeDurum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int mat, fizik, turkce, kimya, muzik, invalidLesson = 0, totalLesson = 5;

		System.out.print("Matematik notunuz : ");
		mat = input.nextInt();

		System.out.print("Türkçe notunuz : ");
		turkce = input.nextInt();

		System.out.print("Kimya notunuz : ");
		kimya = input.nextInt();

		System.out.print("Müzik notunuz : ");
		muzik = input.nextInt();

		System.out.print("Fizik notunuz : ");
		fizik = input.nextInt();

		if (mat < 0 || mat > 100) {
			mat = 0;
			invalidLesson++;
		}
		if (turkce < 0 || turkce > 100) {
			turkce = 0;
			invalidLesson++;
		}
		if (kimya < 0 || kimya > 100) {
			kimya = 0;
			invalidLesson++;
		}
		if (muzik < 0 || muzik > 100) {
			muzik = 0;
			invalidLesson++;
		}
		if (fizik < 0 || fizik > 100) {
			fizik = 0;
			invalidLesson++;
		}

		double total = mat + fizik + kimya + muzik + turkce;
		
		double average = total / (totalLesson - invalidLesson);
		
		if (average <= 55) {
			System.out.println("Sınıfta kaldınız,seneye tekrar görüşşmek üzere!");

		} else {
			System.out.println("Tebrikler sınıf geçtiniz.");
		}

		System.out.println("Ortalamanız : " + average);
	}

}
