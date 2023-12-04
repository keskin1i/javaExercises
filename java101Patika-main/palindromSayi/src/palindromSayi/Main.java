package palindromSayi;

public class Main {

	static boolean isPalindrom(int number) {

		int temp = number;
		int reverseNumber = 0;
		int lastNumber;

		while (temp != 0) {
			System.out.println("Sayı : " + temp);
			lastNumber = temp % 10;
			System.out.println("Son basamak : " + lastNumber);

			reverseNumber = (reverseNumber * 10) + lastNumber;
			System.out.println("Ters sayı : " + reverseNumber);

			temp = temp / 10;
			System.out.println("Yeni temp değeri : " + temp);

			System.out.println("-------------------");
		}
		if (number == reverseNumber) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("Palindrom olma durumu : " + isPalindrom(247742));
	}
}
