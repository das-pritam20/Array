package com.nit.arrays;

// Q. Remove the duplicate elements from the array without taking the help of new array & collections?
public class DuplicateRemover {
	public static void removeDuplicate(int []arr) {
		int n = arr.length;
		
		// start a loop for each element
		for(int i = 0 ; i < n ; i++) {
			// start the loop from the next element 
			for(int j = i+1 ; j < n ; j++) {
				
				// check whether the elements in index i is same as element in index j
				if(arr[i] == arr[j]) {
					
					// if equal, start a loop to shift the elements from j index towards left to remove the duplicate
					for(int k = j; k < n-1 ; k++) {
						// swapping the element with the next element so that the duplicate is removed
						arr[k] = arr[k+1];
					}
					
					// checking the same index again if in case consecutive elements are equal
					j--;
					
					// resizing the array after removing the duplicate elements
					n--;
				}
			}
		}
		
		// loop to display the result after removing duplicate elements
		for(int i = 0; i < n ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,3,3,3,4,5,6}; 
		removeDuplicate(arr);
	}

}
