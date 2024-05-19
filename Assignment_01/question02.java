//2. Write a linear search algorithm to return index of last occurance of key.

package com.assignment01;

import java.util.Scanner;

public class question02{
	   public static int linearSearch(int arr[],int n,int key ){
		
		for(int i=n-1;i>-1 ;i--) {
			if(key == arr[i]) {
				return i;
			}	
		}
		return -1;   
	   }

	   public static void main(String[] args) {
		   
		   int arr[]= {88, 33, 33, 88, 11, 77, 22, 55, 14};
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.println("key element :");
		   int key = sc.nextInt();
		   
		   System.out.println("Key "+key+" at Index: "+linearSearch(arr, arr.length,key));
		   sc.close();
		   
	   }
	}


