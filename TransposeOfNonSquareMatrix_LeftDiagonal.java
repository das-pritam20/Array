package com.nit.arrays;

public class TransposeOfNonSquareMatrix_LeftDiagonal {
	public static void transpose(int arr[][]) {
		int m = arr.length;
		int n = arr[0].length;
		
		int res[][]= new int[n][m]; // swapped length of rows and columns
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				res[i][j] = arr[j][i];
			}
		}
		// after transpose
		System.out.println("-----------After-----------");
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[][] = { { 1, 2,  },
						{ 3, 4,  },
						{ 5, 6,  } };
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
