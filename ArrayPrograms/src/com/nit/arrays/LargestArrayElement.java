package com.nit.arrays;

import java.util.Arrays;

//Q. Find the Largest Element in an Array?
public class LargestArrayElement {
	
	public static void main(String[] args) {
		int arr[] = {10,20,40,30,70,60,90,80,45,90,90,90}; 
		int k = 10;// 1 for first largest element
		System.out.println("Largest element of the array is : " + findLargestElement(arr,k));
	}

	public static int findLargestElement(int[] arr, int k) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int c=1;
		
		for(int i=arr.length-1;i>0;i--)
		{
			if(arr[i]!=arr[i-1])
				c++;
			
			if(c==k)
				return arr[i-1];
		}
		return -1;
	}
}
