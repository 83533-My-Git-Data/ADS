//3. Write a function to sort employees by their salary.

package com.assignment02;

import java.util.Scanner;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id:");
		id = sc.nextInt();

		System.out.println("Enter salary:");
		salary = sc.nextInt();

		System.out.println("Enter name:");
		name = sc.next();
	}

	public void display() {
		System.out.println("ID :" + id);
		System.out.println("Salary :" + salary);
		System.out.println("Name:" + name);
	}

}
