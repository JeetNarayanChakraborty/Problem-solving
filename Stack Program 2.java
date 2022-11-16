/*Find All the Next Greater Elements using Stack */




import java.util.*;



public class st_P2 
{
	Scanner s = new Scanner(System.in);
	
	private ArrayList<Integer> Stack = new ArrayList<Integer>();
	private int top = -1;
	
	
	void push(int t)
	{
		Stack.add(t);
		top++;
	}
	
	int pop()
	{
		int temp;
		
		temp = Stack.get(top);
		Stack.remove(top);
		top--;
		
		return temp;
	}
	
	
	void NextGreaterElement()
	{
		int i,n;
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		System.out.print("No. of items :");  
		n = s.nextInt();
		
		
		for(i=0; i<n; i++)
		{
			System.out.print("Enter number :");   //Array to integers on which NGE search will be performed
			a.add(s.nextInt());
		}
		
		push(a.get(0));  //Push first element into stack
		
		
		for(i=1; i<a.size(); i++)
		{
			if(a.get(i) > Stack.get(top))      /* if element is greater than Stack(top) , pop() and print element as NGE,
			{                                                           push the NGE element back into stack */        
				System.out.println(pop() + " : " + a.get(i));   
				push(a.get(i));
			}
		}
		
		System.out.print(Stack.get(top) + " : " + "-1");   //NGE for remaining element in Stack is -1
	}
	
	
	
	public static void main(String[] args)
	{
		st_P2 st = new st_P2();
				
		st.NextGreaterElement();
		
		
	}

}
