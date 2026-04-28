package com.nit.arrays;

// Q.  Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 
//		and then return the matrix?
public class SetMatrixZero {
	public static void setZeros(int arr[][]) {
		// taking boolean arrays to handle if there are more than one zeros in the matrix
		boolean row[] = new boolean[arr.length]; 
		boolean col[] = new boolean[arr[0].length]; 
		// finding the position of zeros of the matrix
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				// if zero found then changing the boolean arrays' elements to true
				if(arr[i][j]==0) {
					row[i] = true;
					col[j] = true;
				}
				
			}
		}
		//replacing zeros to the rows and columns as per the found zeros
		for(int k= 0;k<arr.length;k++) {
			for(int l = 0; l<arr[k].length;l++) {
				if(row[k] || col[l]) {
					arr[k][l] = 0;
				}
			}
		}
		// matrix after adding zeros
		System.out.println("------------After-----------");
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int arr[][]= {{1,0,0},
					  {4,5,6},
					  {7,8,9}};
		//matrix before adding zeros
		System.out.println("-----------Before-----------");
		for(int i = 0; i<arr.length;i++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		setZeros(arr);
	}
}
