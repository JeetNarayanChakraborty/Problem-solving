/* Find the celebrity , by asking the minimum number of question , 
Celebrity(0 persons known by celeb , n-1 person knows celeb)  */



mport java.util.ArrayList;


public class Celebrity2 
{
	private ArrayList<Integer> Stack = new ArrayList<Integer>();
	private int top = -1;
	
	
	int know[][] = {{0, 1, 0, 0, 1},
                       {0, 0, 0, 0, 1},
                       {0, 0, 0, 0, 1},  //Edge matrix to define the a person knows other or not
                       {0, 0, 1, 0, 1},
                       {0, 0, 0, 0, 0}};
	
	
	void push(int c)
	{
		Stack.add(c);
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
	
	
	
	void Find_Celeb()
	{
		Celebrity2 c2 = new Celebrity2();
		int i,person1=0,person2=0;
		
		
		for(i=0; i<know.length; i++)
		{
			c2.push(i);
		}
		
		
		while(c2.Stack.size() > 1)
		{
			person1 = c2.pop();       //Pop first two people , let A and B 
			person2 = c2.pop();
			
			
			if(c2.is_Known(person1, person2))
			{
				c2.push(person2);           //If A knows B then A might be Celebrity so push back
			}
			
			else
			{
				c2.push(person1);          //Else push B
			}                                                  //Until there is more than one
		}
		
		
		
		if(c2.Stack.size() == 1)
		{
			System.out.println("Person " + (c2.Stack.get(c2.top)+1) + " is Celebrity");
		}
		
		else if(c2.Stack.size() == 0)
		{
			System.out.println("No Celebrity is there");
		}
	}
	
	
	Boolean is_Known(int p1, int p2)
	{
		if(know[p1][p2] == 1)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
	public static void main(String[] args)
	{
		Celebrity2 c2 = new Celebrity2();
		
		c2.Find_Celeb();
	}
	
}




