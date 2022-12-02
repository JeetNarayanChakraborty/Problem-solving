/* Reverse Stack using recursion */






import java.util.*;



public class st_P3 
{
	Scanner s = new Scanner(System.in);
	
	private ArrayList<Integer> Stack = new ArrayList<Integer>();
	private int top = -1;
	
	
	ArrayList<Integer> l()
	{
		return Stack;
	}
	
	void push(int t)
	{
		Stack.add(t);
		top++;
	}
	
	void pop()
	{
		Stack.remove(top);
		top--;
	}
	
	int len()
	{
		return Stack.size();
	}
	
	
	void fill()
	{
		int i;
		
		for(i=0; i<6; i++)
		{
			System.out.print("Enter number :");
			push(s.nextInt());
		}
		
		System.out.print("\nBefore reverse :");
		
		for(i=0; i<Stack.size(); i++)
		{
			System.out.print(Stack.get(i) + " ");
		}
	}
	
	
	void reverse(int p1, int p2)
	{
		int temp;
		
		if(p1 < p2)
		{	
			reverse(p1 + 1 , p2 - 1);   //Increase one end and decrease one end , 0 7 to 1 6...
			
			temp = Stack.get(p1);
			Stack.set(p1, Stack.get(p2));  // Exchange the elements at p1 and p2
			Stack.set(p2, temp);
		}
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		st_P3 s1 = new st_P3();
		int i;
		ArrayList<Integer> temp = s1.l();
		
		s1.fill();
		s1.reverse(0, s1.len()-1);
		
		System.out.print("\nAfter reverse :");
		
		for(i=0; i<s1.len(); i++)
		{
			System.out.print(temp.get(i) + " ");
		}
	}
	
}
