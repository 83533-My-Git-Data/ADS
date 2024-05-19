

package com.sunbeam;

import java.util.Scanner;

class Stack22{
	 int top;
	 final int SIZE;
	 int arr[];
	  static int max=0;
	 Stack22(int size){
		    SIZE=size;
			arr= new int[SIZE];
			top=-1;
	 }
	 public void push(int value) {
		 if(value>max) {
			 max=value;
		 }
			top++;
			arr[top]=value;
		}
	 public int maximum(){
		 return max;
	 }
 }
public class question02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Stack22 st=new Stack22(5);
		for(int i=0;i<5;i++) {
			System.out.println("enter the value");
			st.push(sc.nextInt());
		}
		System.out.println("maximum value : "+st.maximum());

	}

}
