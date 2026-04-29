package com.nit.arrays;

// Q. Given a non-empty array of integers 'arr', every element appears twice except for one. Find that single one.
public class NomRepeatingElementFinder {
	public static int findNonRepeatingElement(int arr[]) {
		int num = 0;
		// Retrieve each element from the array
		for(int a : arr) {
			// perform XOR operation
			// a ^ a --> 0
			// a ^ 0 --> a
			num = num ^ a;
		}
		// finally all duplicate elements will get cancelled out and the unique element will be stored in num
		return num;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,1,3,4,2,3,5,4}; 
		System.out.println("The non repeating element is : " + findNonRepeatingElement(arr));
	}
}
