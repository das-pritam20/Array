package com.nit.arrays;

//Q. Convert a matrix to its upper triangular form.
public class MatrixUpperTriangleConverter {
	public static void toUpperTriangular(int[][] matrix) {
	    int n = matrix.length;

	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < matrix[i].length; j++) {
	            if (i > j) {
	                matrix[i][j] = 0;
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 2 }, { 4, 5, 6, 2 }, { 7, 8, 9, 2 }, { 1, 1, 1, 1 } };
// before lower triangle form
		System.out.println("-----------Before-----------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		toUpperTriangular(arr);
		
// after lower triangle form
		System.out.println("-----------After-----------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
