package mayinTarlasi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	int rowNumber;
	int colNumber;
	String[][] mineMap;
	String[][] gameMap;
	int mineCount;

	public MineSweeper(int rowNumber, int colNumber) {
		this.rowNumber = rowNumber;
		this.colNumber = colNumber;
		this.mineCount = (colNumber * rowNumber) / 4;
		this.mineMap = new String[rowNumber][colNumber];
		this.gameMap = new String[rowNumber][colNumber];

	}

	public void run() {
		System.out.println("============= Welcome to Minesweeper Game ============= ");
		randomMineMaker();
		printMineMap();
		playCheck();
	}

	public void randomMineMaker() {
		Random rnd = new Random();

		for (int i = 0; i < this.rowNumber; i++) {
			for (int j = 0; j < this.colNumber; j++) {
				this.gameMap[i][j] = "-";
				this.mineMap[i][j] = "-";
			}
		}
		while (mineCount > 0) {
			int rowMineNumber = rnd.nextInt(rowNumber);
			int colMineNumber = rnd.nextInt(colNumber);

			if (mineMap[rowMineNumber][colMineNumber].equals("-")) {
				mineMap[rowMineNumber][colMineNumber] = "*";
				mineCount--;
			}
		}
	}

	public void printMineMap() {
		for (String[] row : mineMap) {
			for (String col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	public void printGameMap() {
		for (String[] row : gameMap) {
			for (String column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
	}

	public boolean checkWin() {
		int emptyCell = 0;
		int minedCell = 0;
		for (int i = 0; i < mineMap.length; i++) {
			for (int j = 0; j < mineMap[i].length; j++) {
				if (gameMap[i][j].equals("-")) {
					emptyCell++;
				}
				if (mineMap[i][j].equals("*")) {
					minedCell++;
				}
			}
		}
		if (emptyCell == minedCell) {
			return false;
		}
		return true;
	}

	public void playCheck() {
		Scanner input = new Scanner(System.in);
		boolean finish = false;
		while (!finish) {
			System.out.print("Satır seçiniz    : ");
			int selectedRow = input.nextInt();
			System.out.print("Sütun seçiniz     : ");
			int selectedColumn = input.nextInt();

			mineCount = 0;

			if (selectedRow < rowNumber && selectedColumn < colNumber) {
				if (mineMap[selectedRow][selectedColumn].equals("-")
						&& gameMap[selectedRow][selectedColumn].equals("-")) {
					for (int i = selectedRow - 1; i < selectedRow + 2; i++) {
						for (int j = selectedColumn - 1; j < selectedColumn + 2; j++) {
							if (i >= 0 && j >= 0 && i < rowNumber && j < colNumber && mineMap[i][j].equals("*")) {
								mineCount++;
								gameMap[selectedRow][selectedColumn] = Integer.toString(mineCount);
							} else {
								gameMap[selectedRow][selectedColumn] = Integer.toString(mineCount);
							}

						}
					}
					printGameMap();
					if (!checkWin()) {
						System.out.println("Oyunu kazandınız. Tebrik ederiz.");
						printMineMap();
						finish = true;
					}

				} else if (mineMap[selectedRow][selectedColumn].equals("*")) {
					System.out.println("Mayına bastınız oyun bitti..");
					printMineMap();
					finish = true;
				} else if (!gameMap[selectedRow][selectedColumn].equals("-")) {
					System.out.println("İşaretlenmiş alan başka bir alan seçiniz.");
				}

			} else {
				System.out.println("Lütfen " + this.rowNumber + " - " + this.colNumber + " arası seçim yapınız");
			}
		}
	}

}
