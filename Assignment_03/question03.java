package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

class Stack1{
	int top;
	int arr[];
	final int SIZE;
	Stack1(int size){
		SIZE=size;
		arr= new int[SIZE];
		top=-1;
	}
	public void push(int value) {
		top++;
		arr[top]=value;
	}
	public int pop() {
		return arr[top--];
	}
	public int peek() {
		return arr[top];
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean idFull() {
		return top==SIZE-1;
	}
	
	
}
public class question03 {
	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55};
		System.out.println(Arrays.toString(arr));
		Stack1 st= new Stack1(arr.length);
		for(int i=0;i<arr.length;i++) {
			st.push(arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			arr[i]=st.pop();
		}
		System.out.println("Afther reverse the array");
		System.out.println(Arrays.toString(arr));

	}

}
