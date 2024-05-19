package com.assignment01;

import java.util.Scanner;

public class question03_binary {

	public static int binarySearch(int arr[], int n, int key) {
		int left = 0, right = n - 1, mid, comps = 0;
		while (left <= right) {
			comps++;

			mid = (left + right) / 2;

			if (key == arr[mid])
				return mid;

			else if (key < arr[mid])

				right = mid - 1;

			else

				left = mid + 1;
			System.out.println("No of Comparisons :" +comps);
		}

		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key element:");
		int key = sc.nextInt();

		int index = binarySearch(arr, arr.length, key);
		if (index != -1)
			System.out.println("Key is found at index: " + index);
		else
			System.out.println("Key is not found");
		System.out.println("");
		sc.close();
	}
}
