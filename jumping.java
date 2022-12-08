/*Given an integer list where each number represents the number of hops that can be made, 
determine whether one can reach the last index starting at index 0. */







import java.util.*;





public class jump 
{
	Scanner s = new Scanner(System.in);
	
	ArrayList<Integer> c = new ArrayList<Integer>();
	
	
	void fill()
	{
		int i;
		
		for(i=0; i<4; i++)
		{
			System.out.print("Enter element :");   //Taking input from user
			c.add(s.nextInt());
		}
	}
	
	
	void can_or_cant()
	{
		int i,loc=0,b=0;
		
		for(i=0; i<c.size(); i++)
		{	
			loc = ((loc + c.get(i)) % c.size());    //Moving forward circularly in the array
			
			if(loc == 0)
			{
				b = 1;
				System.out.println("\nDestination reacheable");  //If index 0 is reached , break;
				break;
			}
		}
		
		if(b == 0)
		{
			System.out.println("\nDestination not reacheable");
		}
	}
	
	
	
	public static void main(String[] args)
	{
		jump j = new jump();
		
		j.fill();
		j.can_or_cant();
	}
	
}




