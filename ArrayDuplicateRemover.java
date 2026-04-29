package com.nit.arrays;

//Q. Remove duplicates from sorted array?
public class ArrayDuplicateRemover {
	//most optimal way is to use two-pointers technique
	public static void removeDuplicates(int arr[]) {
		//taking a pointer that will hold the index of last unique element
		int i = 0;
		//iterating through the array to move duplicates to last
		for(int j = 1; j<arr.length; j++) {
			//if the element in j index is not same with the last unique element then swap them
			if(arr[i] != arr[j]) {
				//first updating the position of last unique element stored
				i++;
				//put the element to the last updated unique index
				arr[i] = arr[j];
			}
		}
		//print the array elements with updated length i.e., j that is pointing to the last unique element
		for(int j = 0; j<=i; j++) {
			System.out.print(arr[j] +" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {10,10,20,30,40,40,70};
		removeDuplicates(arr);
	}
}
