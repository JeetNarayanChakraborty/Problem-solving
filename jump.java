/* Given an integer list where each number represents the number of hops that can be made, 
determine whether the last index can be reached starting at index 0. */







import java.util.*;





public class jump 
{
	Scanner s = new Scanner(System.in);
	
	ArrayList<Integer> c = new ArrayList<Integer>();
	
	
	void fill()
	{
		int i;
		
		for(i=0; i<6; i++)
		{
			System.out.print("Enter element :");
			c.add(s.nextInt());
		}
	}
	
	
	void can_or_cant()
	{
		int i,loc=0,b=0;    //Take a index pointer at 0th index 
		
		for(i=0; i<c.size(); i++)
		{	
			loc = ((loc + c.get(i)) % c.size());  //Move the pointer by number of jumps availble
			
			if(loc == 0)
			{
				b = 1;
				System.out.println("\nDestination reacheable");  //If destination reached break
				break;
			}
		}
		
		if(b != 1)
		{
			System.out.println("Destination not reacheable");  //else cannot be reached
		}
	}
	
	
	
	public static void main(String[] args)
	{
		jump j = new jump();
		
		j.fill();
		j.can_or_cant();
	}
	
}





