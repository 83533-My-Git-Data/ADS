package com.sunbeam;

public class List {
   static class Node {
		private Employee E;
		private Node next;
//		public Object name;

		public Node(Employee E) {

			this.E = E;

			next = null;
		}

//		@Override
//		public String toString() {
//			return "Node [E=" + E + "]";
//		}
		
   }
	private Node head;

	public List() {
		head = null;
	
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(Employee E) {
		Node newnode = new Node(E);
		newnode.next = head;
		
		head = newnode;
		
	}
	public void delete(int id) {
//		Node trav = head;
//		int counter = 0;
//		while(!(trav.E.getEmpid()==id)) {
//			counter++;
//			trav= trav.next;
//		}
//		while(counter!=0) {
//			deleteEmp(id);
//		}
		if(isEmpty())
			return;
		else {
			Node trav = head;
			if(trav.E.getEmpid()== id) {
				trav=trav.next;
			   trav.next=trav.next.next;
			
			}
//			trav=trav.next;
		}
		
	}
	
	public boolean displayEMPName(String name) {
		Node trav = head;
		while(trav!= null) {
			if(trav.E.getName().equals(name)) {
			 System.out.println(" "+trav.E.toString());
			 return true;
			}
			trav =  trav.next;
		}
		System.out.println(" ");
		return false;
	}
//	public boolean displayId(int id) {
//		Node trav = head;
//		while(trav!=null) {
//			if(trav.E.getEmpid()==id) {
//				System.out.println(" "+trav.E.toString());
//				return true;
//				
//			}
//			trav = trav.next;
//		}
//		System.out.println(" ");
//		return false;
//	}
	public boolean updateSalary(int id, double sal) {
		Node trav = head;
		while(trav!=null) {
			if(trav.E.getEmpid()==id) {
				trav.E.setSalary(sal);
				
				return true;
			}
			trav = trav.next;
			
		}
		System.out.println(" ");
		return false;
	}
	public void display() {
		Node trav = head;
		if(isEmpty())
			return; 
		System.out.println("List :");
		while(trav!=null) {
			System.out.println(" "+trav.E.toString());
			trav = trav.next;
		}
		System.out.println("");
	}
}
