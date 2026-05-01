package com.nit.arrays;
// Q. Iterate the 3D array by using loops
public class ThreeDArray {
    public static void main(String[] args) {

        int[][][] arr = {
            { {1, 2}, {3, 4} },
            { {5, 6}, {7, 8} }
        };

        // Iterating using loops
        for (int i = 0; i < arr.length; i++) {           // layers
            for (int j = 0; j < arr[i].length; j++) {    // rows
                for (int k = 0; k < arr[i][j].length; k++) { // columns
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println("----");
        }
    }
}
