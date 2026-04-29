package com.nit.arrays;

//Q. Find the Second Largest Element in an Array without sorting?

public class KthLargestElement_WithoutSorting {
	
	public static void main(String[] args) {
		int arr[] = {10,20,40,30,70,60,90,80,45,90,90}; 
		int k = 9;// for K-th largest element
		System.out.println("Largest element of the array is : " + findLargestElement(arr,k));
	}

	public static int findLargestElement(int[] arr, int k) {
		// terminates the method if k is in invalid range
		if(k <= 0 || k > arr.length ) return -1;
		//taking a max variable that stores the minimum value that a Integer can hold
		int max = Integer.MIN_VALUE;
		//find the largest element of the array and store it in max
		for (int num : arr) {
			if (num >= max) {
				max = num;
			}
		}
		//iterate a loop for k-1 times(already got the max once so first step is done) to find the k-th largest element
		for (int i = 1; i < k; i++) {
			//storing the minimum value an Integer variable can store in max2
			int max2 = Integer.MIN_VALUE;
			//taking a for-each loop to iterate the array elements exactly once
			for (int num : arr) {
				//update the max2 if the num taken from the array is greater than equals max2 and less than max
				if (num >= max2 && num < max) {
					max2 = num;
				}
			}
			// if the the max2 still holds the initial value then it is obvious that the k value is higher than expected 
			if (max2 == Integer.MIN_VALUE) return -1;
			
			//if execution still continues then the found element will be stored in max2 so update the max with max2
			max = max2;

		}
		// finally returning the k-th max element of the array
		return max;
	}
}
