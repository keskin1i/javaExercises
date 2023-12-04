package recursiveFibonacci;

public class Main {

	static int f(int n) {

		if (n == 1 || n == 2) {
			return 1;
		}
		return f(n - 1) + f(n - 2);
	}

	public static void main(String[] args) {

		int result = f(5);
		System.out.println(result);
	}
}
