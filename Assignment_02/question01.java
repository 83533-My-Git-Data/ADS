//1. Write a insertion sort function to sort array and returns no of comparisions.

package com.assignment02;

import java.util.Arrays;

public class question01 {
    public static void insertionSort(int arr[], int n) {
    	int comps=0;
    	for(int i=1;i<n;i++) {
    		int temp = arr[i];
    		int j = i-1;
    		
    		while(j >= 0 && arr[j] > temp) {
    			comps++;
    			arr[j+1]=arr[j];
    			j--;
    		}
    		arr[j+1]=temp;
    	}
    	System.out.println("No. of comparisons :"+comps);
    }
    public static void main(String[] args) {
    	int arr[] = {55, 44, 22, 66, 11, 33};
    	
    	System.out.println("Before sort :"+Arrays.toString(arr));
    	insertionSort(arr,arr.length);
    	System.out.println("After sort:"+Arrays.toString(arr));
    }
}
