package com.sunbeam;

import java.util.Scanner;

public class Tester {
public static void main(String[] args) {
	int choice;
	Scanner sc = new Scanner(System.in);
	List l1 = new List();
	
	do {
		System.out.println("\n1. Add employee\r\n"
				+ "2. Display all employees\r\n"
				+ "3. Search employee by name\r\n"
				+ "4. Delete employee by empid\r\n"
				+ "5. Update salary of employe");
		System.out.println("Enter choice :");
		choice= sc.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.println("Add Employee");
			int id;
			String name;
			double salary;
			System.out.println("Enter Empid:");
			id = sc.nextInt();
			System.out.println("Enter EmpName:");
			name= sc.next();
			System.out.println("Enter EmpSalary:");
			salary = sc.nextDouble();
			
			Employee E = new Employee(id,name ,salary);
			
			l1.addFirst(E);
			System.out.println("Employee added");
			
			break;
		case 2:
			System.out.println("Display All employees");
			l1.display();
			break;
		case 3:
			System.out.println("Search Employee by name");
			System.out.println("Enter EmpName to search:");
			String name1 = sc.next();
			boolean res = l1.displayEMPName(name1);
			if(res == false)
				System.out.println("Employee is not present");
			
			break;
		case 4:
			System.out.println("Delete Employee by EmpId");
			System.out.println("Enter Empid to delete");
			int id1 = sc.nextInt();
			l1.delete(id1);
			break;
		case 5:
			System.out.println("Update salary by Employee");
			int id2 = sc.nextInt();
			double sal = sc.nextDouble();
			l1.updateSalary(id2,sal);
		    }
	}while(choice!=0);
	
}
}
