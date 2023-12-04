package fibonacciSerisi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Eleman sayisini girin : ");
		int number = input.nextInt();

		int total;
		int number1 = 0;
		int number2 = 1;

		System.out.print(number + " Elemanli Fibonacci Serisi: ");

		for (int i = 1; i <= number; i++) {
			System.out.print(number1 + " ");

			total = number1 + number2;
			number1 = number2;
			number2 = total;
		}

	}
}

/*
 * Fibonacci serisi icin eleman sayisini girin: 9
 * 
 * 9 Elemanli Fibonacci Serisi: 0 1 1 2 3 5 8 13 21
 */