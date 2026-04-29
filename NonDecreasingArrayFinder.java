package com.nit.arrays;

//Q. Given an array of n integers, return true if the array is sorted in non-decreasing order or else false?
public class NonDecreasingArrayFinder {
	public static boolean testNonDecreasing(int arr[]) {
		boolean isNonDecreasing = true;
		//traverse through the array
		for(int i = 1; i<arr.length; i++) {
			if(arr[i-1]>arr[i]) {
				//break the loop if previous element is greater than next element
				isNonDecreasing = false;
				break;
			}
		}
		return isNonDecreasing;
	}
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		if(testNonDecreasing(arr)) System.out.println("Array is in Non-Decreasing order.");
		else System.out.println("Array is not in Non-Decreasing order.");
	}
}
