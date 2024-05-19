package Q1;



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
	
	public boolean isEmpty()
	{
		return head==null;
	}
	
	public void addFirst(int value)
	{
		Node newnode=new Node(value);
		if(isEmpty())
		{
			head=newnode;
			newnode.next=newnode.prev=newnode;
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
		}
		else
		{
			newnode.next=head;
			newnode.prev=head.prev;
			head.prev.next=newnode;
			head.prev=newnode;
			//head=newnode;
			
			
		}
	}
	
	public void deleteLast()
	{
		if(isEmpty())
			return;
		else if(head==head.next)
			head=null;
		else
		{
			head.prev.prev.next=head;
			head.prev=head.prev.prev;
		}
	}
	
	public void deletefirst()
	{
		if(isEmpty())
			return;
		else if(head==head.next)
			head=null;
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
	
	public void addpos(int value,int pos)
	{
		Node nn=new Node(value);
		if(pos<1)
			return;
		else if(isEmpty())
		{
			head=nn;
			nn.prev=nn.next=nn;
		}
		else if (pos==1)
			addFirst(value);
		else 
		{
			Node trav=head;
			for(int i=1;i<pos-1;i++)
			{
				trav=trav.next;
				if(trav==head &&pos!=2)
					return;
			}
			nn.next=trav.next;
			nn.prev=trav;
			trav.next.prev=nn;
			trav.next=nn;
			
			
		}
	
		
	}
	
	public void deletepos(int pos)
	{
		if(isEmpty())
			return;
		else if(head==head.next)
			head=null;
		else if(pos==1)
		{
			head.prev.next=head.next;
			head=head.next;
			
		}
		else
		{
			Node trav=head;
			for(int i=1;i<pos;i++)
			{
				trav=trav.next;
				if(trav==head)
					return;
			}
			trav.next.prev=trav.prev;
			trav.prev.next=trav.next;
		}
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
