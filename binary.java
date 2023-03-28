/* Given an integer n, return the length of the longest consecutive run of 1s 
in its binary representation. */






import java.util.*;





public class Binary 
{
	Scanner s = new Scanner(System.in);
	
	
	
	void Longest_ones()
	{
		int i,n,si=0,max=0;
		ArrayList<Integer> bin = new ArrayList<Integer>();
		ArrayList<Integer> cons = new ArrayList<Integer>();
		
		
		System.out.print("Enter number :");
		n = s.nextInt();
		
		
		while(n != 1)
		{
			bin.add(n % 2);
			n /= 2;                        //Convert number to binary
		}
		
		bin.add(1);
		
		Collections.reverse(bin);
		
		
		for(i=0; i<bin.size(); i++)
		{
			if(bin.get(i) == 1)
			{
				si++;                             //while 1 are found increase size
				
			
				if((i+1 == bin.size()) || (bin.get(i+1) == 0))
				{
					cons.add(si);			                //if 0 comes or list ends add the size, make size 0 and continue to take another size from beginning
					si = 0;
				}
			}
		}
		
		
		for(i=0; i<cons.size(); i++)
		{
			if(max < cons.get(i))             //find maximum size from size list 
			
				max = cons.get(i);
			}
		}
		
	
		


		
		
		System.out.print("\nLongest consecutive 1's : " + max);
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		Binary b = new Binary();
		
		b.Longest_ones();
	}
	
}








