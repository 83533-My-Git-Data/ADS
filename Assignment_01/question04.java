//4. Create array of employees and search employee by i. empid ii. name iii. salary

package com.assignment01;

import java.util.Scanner;

public class question04 {
	public static int linearSearch(Employee[] e,int n,double key) {
		for (int i=0;i<n;i++) {
//		if(key == e[i].getId())
//		if(e[i].getName().equals(key))
		if(key == e[i].getSalary())
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Employee e[] = {
				new Employee(1,"aditi",2000),
				new Employee(2,"vinita",4500),
				new Employee(3,"sayli",3000),
				new Employee(4,"aishwarya",2500)
		};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter salary:");
		double key = sc.nextDouble();
//		System.out.println("Enter name :");
//		String key = sc.next();
		
//		System.out.println("Enter Id :");
//		int key = sc.nextInt();
		
		int index = linearSearch(e,e.length,key);
		if(index!=-1) {
			System.out.println("Employee is found at index :"+index);
			System.out.println(e[index]);
		}
		else {
			System.out.println("Employee is not found");
		}
		
		
		sc.close();
	}
}
class Employee{
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
