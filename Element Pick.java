
/*Given a stream of elements too large to store in memory, 
pick k random elements from the stream with uniform probability. */





import java.util.*;
import java.lang.Math;




public class Main
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		
		
		ArrayList<Integer> stream = new ArrayList();
		ArrayList<Integer> reservoir = new ArrayList();
		int c = 1,t = 0,i;
		
		
		
		while(c != 0)
		{
		    System.out.print("Enter number :");
		    stream.add(s.nextInt());                //Stream elements input from user,size not known
		    System.out.print("Another number ? ");   
		    c = s.nextInt();                       
		}
		
		
	    System.out.print("How many elements to pick ? ");
	    t = s.nextInt();
	    
	    
	    for(i=0; i<t; i++)
	    {
	        reservoir.add(stream.get(i));       //Adding first k elements from Stream
	    }
	    
	    c = t;
	    
	    
		for(i=t; i<stream.size(); i++)
		{
		    t = (int)Math.random() * (i+1);      // Generate random number from range and check whether <= Reservoir size.  
		    
		    if(t <= reservoir.size())
		    {
		        reservoir.set(t, stream.get(i));
		    }
		}
		
		
		
		
		System.out.print("\nRandom " + c + " elements from stream :");
		
		
		for(i=0; i<reservoir.size(); i++)
		{
		    System.out.print(reservoir.get(i) + " ");
		}
	}
}
