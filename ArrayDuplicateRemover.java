package com.nit.arrays;

//Q. Remove duplicates from sorted array?
public class ArrayDuplicateRemover {
	// most optimal way is to use two-pointers technique
	public static int removeDuplicates(int arr[]) {
		if (arr.length == 0) return 0;
		// taking a pointer that will hold the index of last unique element
		int i = 0;
		// iterating through the array to move duplicates to last
		for (int j = 1; j < arr.length; j++) {
			// if the element in j index is not same with the last unique element then
			if (arr[i] != arr[j]) {
				// first update the position of last unique element stored
				i++;
				// put the element to the last updated unique index
				arr[i] = arr[j];
			}
		}
		// returning the updated length of unique elements
		return i + 1;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 10, 20, 30, 40, 40, 70 };
		int n = removeDuplicates(arr);
		// print the array elements with updated length
		for (int j = 0; j < n; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
