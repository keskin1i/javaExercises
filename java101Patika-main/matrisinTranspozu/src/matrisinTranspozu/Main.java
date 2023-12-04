package matrisinTranspozu;

public class Main {
	public static void main(String[] args) {

		int[][] matris = { 	{ 1, 5, 3 }, 
							{ 4, 8, 6 }, 
							{ 7, 3, 9 }, 
							{ 1, 3, 5 } };

		int[][] transpose = new int[matris[0].length][matris.length];

		System.out.println("Matris ");
		for (int[] row : matris) {
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		System.out.println("-------");
		
		System.out.println("Transpozu");
		for (int i = 0; i < matris[0].length; i++) {
			for (int j = 0; j < matris.length; j++) {
				System.out.print(matris[j][i] + " ");
			}
			System.out.println();
		}
	}
}
