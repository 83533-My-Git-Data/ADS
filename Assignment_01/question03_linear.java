//3. Write a program to print no of comparisions done to search a key in i. linear search ii. binary serach
package com.assignment01;

import java.util.Scanner;

public class question03_linear {

	public static int linearSearch(int arr[], int n, int key) {
		int comps = 0;
		
		for(int i = 0; i<n;i++) 
		{
			comps++;
			if(key == arr[i]) {
			   System.out.println("No of comparisons:"+comps);
			return i;
			}
		}
		return -1;

}

	public static void main(String[] args) {
		 int arr[]= {88, 33, 66, 99, 11, 77, 22, 55, 14};
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("key element :");
		   int key = sc.nextInt();
		   
		   int index = linearSearch(arr, arr.length,key);
		   
		   if(index!= -1) {
			   System.out.println("key is found at index :" +index);
		   }
		   else {
			   System.out.println("key is not found");
		   }
		   sc.close();
	}
}
