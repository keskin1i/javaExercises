package harmonikOrtalama;

public class Main {

	public static void main(String[] args) {

		int[] list = { 15, 6, 7, 12, 7, 9, 3 };

		double harmonicSeries = 0;

		for (int i : list) {
			harmonicSeries += 1.0 / i;
		}

		double harmonicMean = list.length / harmonicSeries;

		System.out.println("Harmonik ortalama : " + harmonicMean);
	}

}
