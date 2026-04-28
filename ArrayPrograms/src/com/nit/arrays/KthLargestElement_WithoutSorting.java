package com.nit.arrays;

//Q. Find the Second Largest Element in an Array without sorting?

public class KthLargestElement_WithoutSorting {
	public static void main(String[] args) {
		int arr[] = {10,20,40,30,70,60,90,80,45,90,90}; 
		int k = 9;// for K-th largest element
		System.out.println("Largest element of the array is : " + findLargestElement(arr,k));
	}

	public static int findLargestElement(int[] arr, int k) {
		
		if(k <= 0 || k > arr.length ) return -1;
		
		int max = Integer.MIN_VALUE;
		for (int num : arr) {
			if (num >= max) {
				max = num;
			}
		}

		for (int i = 1; i < k; i++) {
			int max2 = Integer.MIN_VALUE;
			for (int num : arr) {
				if (num >= max2 && num < max) {
					max2 = num;
				}
			}
			if (max2 == Integer.MIN_VALUE)
				return -1;
			max = max2;

		}
		return max;
	}
}
