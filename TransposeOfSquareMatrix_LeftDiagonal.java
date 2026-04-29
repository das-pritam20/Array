package com.nit.arrays;

public class TransposeOfSquareMatrix_LeftDiagonal {
	public static void transpose(int arr[][]) {
		int m = arr.length;
		for(int i = 0; i < m; i++) {
			for(int j = i; j < m; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		// after transpose
		System.out.println("-----------After-----------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 2 },
						{ 4, 5, 6, 2 },
						{ 7, 8, 9, 2 },
						{ 1, 1, 1, 0 } };
		// before transpose
		System.out.println("-----------Before-----------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		transpose(arr);

	}
}
