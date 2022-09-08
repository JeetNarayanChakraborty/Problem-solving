
/*Given a stream of elements too large to store in memory, 
pick a random element from the stream with uniform probability. */






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
		
		
		reservoir.add(stream.get(0));            //first f elements from stream here(f = 1)
		
		
		
		for(i=1; i<stream.size(); i++)
		{
		    t = (int)Math.random() * (i - 0 + 1) + 0;  // Pick Random element from range and compare it with element 
		                                         // reservoir
		    
		    if(t <= reservoir.size())
		    {
		        reservoir.set(t, stream.get(t));
		    }
		}
		
		
		
		
		System.out.println("Random element from stream :" + reservoir.get(t));
	}
}
