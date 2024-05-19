//8. to find rank of an element in a stream of integers. rank: rank of a given integer "x", in stream is "total
//no. of ele's less than or equal to x (including x).
//Input: { 10, 20, 15, 3, 4, 4, 1 } Ouput: Rank of 4 is: 4
package com.assignment01;

import java.util.Scanner;

public class question08 {
	public static int rankOfElement(int arr[], int N, int element) {
		int count = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] == element || arr[i] < element) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 40, 20, 30, 10, 50, 60, 20, 80 };
		System.out.println("Enter Key to Search: ");
		Scanner sc = new Scanner(System.in);
		int element = sc.nextInt();
		int rank = rankOfElement(arr, arr.length, element);
		System.out.println("Rank of " + element + " is " + rank);
		sc.close();
	}

}
