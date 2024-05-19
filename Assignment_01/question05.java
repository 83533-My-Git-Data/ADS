//5. Implement binary search algorithm if array is sorted in descending orde
package com.assignment01;

import java.util.Scanner;

public class question05 {
	public static int binarySearch(int arr[], int n, int key) {
		int left = 0, right = n - 1, mid;
		while (left <= right) {
			mid = (left + right) / 2;

			if (key == arr[mid]) {
				return mid;
			} else if (key > arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 99, 88, 77, 66, 55, 44, 33, 22, 11 };
		Scanner sc = new Scanner(System.in);
		System.out.println("key element:");
		int key = sc.nextInt();

		int index = binarySearch(arr, arr.length, key);
		if (index != -1) {
			System.out.println("Key is found :" + index);
		} else {
			System.out.println("Key is not found");
		}
		sc.close();
	}
	
}
