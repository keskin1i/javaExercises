package kombinasyonHesaplama;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int n, nFact = 1;
		int r, rFact = 1;
		int nrFact = 1;
		int c;

		Scanner scanner = new Scanner(System.in);

		System.out.print("n sayısını giriniz : ");
		n = scanner.nextInt();

		for (int i = 1; i <= n; i++) { 				// n faktöriyel
			nFact *= i;
		}

		System.out.print("r sayısını giriniz : ");
		r = scanner.nextInt();

		for (int i = 1; i <= r; i++) {
			rFact *= i;						 // r faktöriyel
		}

		for (int i = 1; i <= (n - r); i++) { 			 // n-r faktöriyel
			nrFact *= i;

		}
		System.out.println(n + " faktöriyel : " + nFact);
		System.out.println(r + " faktöriyel : " + rFact);
		System.out.println("n-r faktöriyel : " + nrFact);

		c = nFact / (rFact * (nrFact));
		System.out.println("Kombinasyon formülü : " + "C(n,r) = n! / (r! * (n-r)!)");
		System.out.println("C(n,r)= " + c);
	}
}
