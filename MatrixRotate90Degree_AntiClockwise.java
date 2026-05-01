package com.nit.arrays;

// Q. Given a matrix, your task is to rotate the matrix 90 degrees anti-clockwise
public class MatrixRotate90Degree_AntiClockwise {
	public static void rotateAntiClockwise(int[][] matrix) {
	    int n = matrix.length;

	    // Step 1: Transpose
	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            int temp = matrix[i][j];
	            matrix[i][j] = matrix[j][i];
	            matrix[j][i] = temp;
	        }
	    }

	    // Step 2: Reverse each column
	    for (int j = 0; j < n; j++) {
	        int top = 0, bottom = n - 1;
	        while (top < bottom) {
	            int temp = matrix[top][j];
	            matrix[top][j] = matrix[bottom][j];
	            matrix[bottom][j] = temp;
	            top++;
	            bottom--;
	        }
	    }
	}

	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		// before rotation
		System.out.println("-----------Before-----------");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		rotateAntiClockwise(matrix);
		// after rotation
		System.out.println("-----------After-----------");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
