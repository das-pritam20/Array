package com.nit.arrays;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

// Q. Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays?
public class FindUnion {
	public static Integer[] findUnion(int[] arr1, int arr2[]) {
		Set<Integer> union = new TreeSet<Integer>();// removes duplicate + default sorting
		for (int a : arr1) {
			union.add(a);
		}
		for (int b : arr2) {
			union.add(b);
		}
		return union.toArray(Integer[]::new);
	}

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 2, 3, 4, 4, 5 };
		int arr2[] = { 1, 3, 5, 6, 7, 7, 8, 9 };

		System.out.println(Arrays.toString(findUnion(arr1, arr2)));
	}
}
