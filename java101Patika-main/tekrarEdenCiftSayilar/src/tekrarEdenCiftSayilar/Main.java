package tekrarEdenCiftSayilar;

import java.util.Arrays;

public class Main {

	static boolean isFind(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}

		}
		return false;
	}

	public static void main(String[] args) {

		int[] list = { 4, 7, 4, 4, 2, 9, 10, 21, 2, 33, 9, 10, 2 };
		int[] duplicate = new int[list.length];
		int index = 0;

		for (int i = 0; i < list.length; i++) {

			for (int j = 0; j < list.length; j++) {
				if (i != j && list[i] == list[j] && list[i] % 2 == 0) {
					if (!isFind(duplicate, list[i])) {
						duplicate[index++] = list[i];
						break;
					}
				}
			}
		}
		for (int value : duplicate) {
			if (value != 0) {
				System.out.println(value);
			}
		}

		// System.out.println(Arrays.toString(duplicate));
	}
}
