package com.nit.arrays;

import java.util.Arrays;

public class ArrayRotaterLeft {
	public static void reverse(int arr[], int start, int end) {
		// reversing the elements of the given array from 'start' index to 'end' index
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void leftRotate(int arr[], int k) {
		int n = arr.length;
		k = k % n; // to handle k > n
		if (k == 0)
			return;
		// first reverse the array from 0 to k - 1 place
		reverse(arr, 0, k - 1);
		// then reverse the array from k-th index to the end
		reverse(arr, k, n - 1);
		// then reverse the whole array
		reverse(arr, 0, n - 1);

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 4;// no. of times that the array is to be rotated
		System.out.println(Arrays.toString(arr));
		leftRotate(arr, k);
		System.out.println(Arrays.toString(arr));

	}
}
