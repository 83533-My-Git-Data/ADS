package Q2;



public class deque 
{
	List l;
	public deque()
	{
		l=new List();
	}
	
	
	
	public boolean isEmpty() {
		return l.isEmpty(); 
	}
	
	public void pushf(int value) {
		l.addFirst(value);
	}
	
	public void popf() {
		l.deleteLast();
	}
	public void pushr(int value) {
		l.addLast(value);
	}
	
	public void popr() {
		l.deletefirst();
	}
	
	public int peek() {
		return l.peekdata();
	}
}
