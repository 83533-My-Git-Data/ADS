package com.assignment02;

import java.util.Arrays;

public class EmployeeMain {
	
	public static void insertionSort(Employee[] e, int n) {
		for (int i = 1;i<n;i++) {
			Employee temp = e[i];
			
			int j = i-1;
			
			while(j>=0 && e[j].getSalary() > temp.getSalary()) {
				e[j+1] = e[j];
				j--;
			}
			
			e[j+1] = temp;
		}
	}
public static void main(String[] args) {
	Employee e[] = {
			new Employee(1,"aaa",2000),
			new Employee(2,"bbb",4500),
			new Employee(3,"ccc",3000),
			new Employee(4,"ddd",2500)
	};
	
	System.out.println("Array before sort "+Arrays.toString(e));
	insertionSort(e, e.length);
	System.out.println("Arrays after sort "+Arrays.toString(e));
}
}
