package Q1;

public class Q1stack 
{
	List ll;
	public Q1stack()
	{
		ll=new List();
	}
	
	public void push(int value)
	{
		ll.addFirst(value);
	}
	public void pop()
	{
		ll.deletefirst();
	}
	
	public int peek()
	{
		return ll.peekdata();
	}

}
