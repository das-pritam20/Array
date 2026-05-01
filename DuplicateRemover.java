package com.nit.arrays;

// Q. Remove the duplicate elements from the array without taking the help of new array & collections?
public class DuplicateRemover {
	public static int removeDuplicate(int[] arr) {
		int n = arr.length;
		int index = 0;

		// start a loop for each element
		for (int i = 0; i < n; i++) {
			// variable to check whether the element is duplicate or not
			boolean isDuplicate = false;
			// start the loop from the next element
			for (int j = i + 1; j < n; j++) {

				// check whether the elements in index i is same as element in index j
				if (arr[i] == arr[j]) {
					isDuplicate = true;
					break;
				}
			}
			// if element is unique keep it in index that points the last unique element
			if(!isDuplicate) {
				arr[index++] = arr[i];
			}
		}

		return index;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 3, 3, 3, 4, 5, 6, 6, 9 };
		int newLength = removeDuplicate(arr);
		// loop to display the result after removing duplicate elements
		for (int i = 0; i < newLength; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
