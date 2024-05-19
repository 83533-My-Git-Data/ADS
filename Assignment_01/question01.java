package com.assignment01;

public class question01 {
	
		public static boolean isPalindromeIterative(String str) {
		    int left = 0;
		    int right = str.length() - 1;
		    
		    while (left < right) {
		        if (str.charAt(left) != str.charAt(right)) {
		            return false;
		        }
		        left++;
		        right--;
		    }
		    return true;
//		    Time Complexity: O(n)
//		    Space Complexity: O(1)
		}
		public static boolean isPalindromeRecursive(String str, int left, int right) {
		    if (left >= right) {
		        return true;
		    }
		    if (str.charAt(left) != str.charAt(right)) {
		        return false;
		    }
		    return isPalindromeRecursive(str, left + 1, right - 1);
//		    Time Complexity: O(n)
//		    Space Complexity: O(n)
		}


		public static void main(String[] args) {
			String str="abccba";
			 //boolean flag=isPalindromeIterative(str);
			 boolean flag=isPalindromeRecursive(str,0,str.length()-1);
			 if(flag==false) {
				 System.out.println("given String is not Palindrome");
			 }
			 else {
				 System.out.println("given String is Palindrome");
			 }
		}

	}


