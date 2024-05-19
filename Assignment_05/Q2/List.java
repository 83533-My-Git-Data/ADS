package Q2;

public class List 
{
	static class Node
	{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value)
		{
			data=value;
			next=prev=null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public boolean isEmpty()
	{
		return head==null&&tail==null;
	}
	
	public void addFirst(int value)
	{
		Node newnode=new Node(value);
		if(isEmpty())
		{
			head=newnode;
			newnode.next=newnode.prev=newnode;
			tail=newnode;
		}
		else
		{
			newnode.next=head;
			newnode.prev=head.prev;
			head.prev.next=newnode;
			head.prev=newnode;
			head=newnode;
			
			
		}
	}
	
	public void addLast(int value)
	{
		Node newnode=new Node(value);
		if(isEmpty())
		{
			head=newnode;
			newnode.next=newnode.prev=newnode;
			tail=newnode;
			
		}
		else
		{
			newnode.next=tail.next;
			newnode.prev=tail;
			tail.next=newnode;
			tail=newnode;
			
			
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
			return;
		else if(head==tail)
			tail=head=null;
		else
		{
			tail.next.prev=tail.prev;
			tail.prev.next=tail.next;
			
			tail=tail.prev;
		}
	}
	
	public void deletefirst()
	{
		if(isEmpty())
			return;
		else if(head==head.next)
		{
			tail=head=null;
			
		}
		else
		{
			head.next.prev=head.prev;
			head.prev.next=head.next;
			
			head=head.next;
		}

		
	}
	
	public int peekdata()
	{
		return head.data;
	}
	

	
	
	
	public void display()
	{
		Node trav=head;
		if(isEmpty())
			return;
		
		else
		{
			System.out.print("The list is :: ");
			do
			{
				System.out.print(" "+trav.data);
				trav=trav.next;
			}while(trav!=head);
		}
	}
}
