
//4. Implement circular queue using counter method
package com.sunbeam;

import java.util.Scanner;

	class Queue11 {
		int arr[];
		int rear, front;
		final int SIZE;
		static int count;

		Queue11(int size) {
			SIZE = size;
			arr = new int[SIZE];
			count = 0;
		}

		public void push(int value) {
			rear = (rear + 1) % SIZE;
			arr[rear] = value;
			count++;
		}

		public int pop() {
			int temp = (front + 1) % SIZE;
			front = (front + 1) % SIZE;
			count--;
			if (front == rear)
				front = rear = -1;
			return temp;
		}

		public int peek() {
			return arr[(front + 1) % SIZE];
		}

		public boolean isEmpty() {
			return count == 0;
		}

		public boolean isFull() {
			return count == SIZE;
		}

	}

	public class question04 {

		public static void main(String[] args) {

			Queue11 q = new Queue11(4);
			int choice;
			Scanner sc = new Scanner(System.in);
			do {
				System.out.println("0. Exit\n1. Push\n2. Pop\n3. Peek");
				System.out.print("Enter choice : ");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					if (q.isFull()) {

						System.out.println("Queue is full");

					} else {
						System.out.print("Enter value : ");
						int value = sc.nextInt();
						q.push(value);
					}
					break;
				case 2:
					if (q.isEmpty())
						System.out.println("Queue is empty");
					else
						q.pop();
					break;
				case 3:
					if (q.isEmpty())
						System.out.println("Queue is empty");
					else
						System.out.println("Peeked value : " + q.peek());
					break;
				}
			} while (choice != 0);
			sc.close();

		}

	}


