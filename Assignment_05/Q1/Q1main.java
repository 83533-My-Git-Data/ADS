package Q1;

import java.util.Stack;

public class Q1main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Q1stack s=new Q1stack();
		s.push(15);
		s.push(25);
		s.pop();
		s.push(35);
		s.pop();
		
		System.out.println(" "+ s.peek());
		
		
		

	}
	


}
