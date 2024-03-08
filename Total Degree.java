

/* Given a clock time in hh:mm format, determine, to the nearest degree, 
the angle between the hour and the minute hands. */




import java.util.*;




public class Main
{
    static Scanner s = new Scanner(System.in);

    
    
	public static void main(String[] args) 
	{
	    int n=0, hour=0, minute=0, totalDegree=0;
	    
	    
	    System.out.print("Enter hour hand position :");
	    hour = s.nextInt();
	    
	    System.out.print("Enter minute hand position :");
	    minute = s.nextInt();
		
		
		
		//each 5 min = 30 degree so divide min/5
		
		
		if(minute % 5 == 0)
		{
		    n = minute / 5;
		    totalDegree = n * 30;
		}
		
		
		//so 1 min = 6 degree, calculate the remaining mins using that
		
		else
		{
		    n = minute / 5;
		    int n2 = minute % 5;
		    
		    totalDegree = (n * 30) + (n2 * 6);
		}
		
		
		//if hour hand is less than 12 add (12- hour) * 30 as eah hour equals 30 degree
		
		
		if(hour < 12)
		{
		    totalDegree += ((12 - hour) * 30);
		}
		
		else
		{
		    totalDegree -= (hour * 30);
		}
		
		
		
		totalDegree -= minute;
		
		
		
		
		
		System.out.println("The total degree betweeen hour and minute hand :" + totalDegree);
	}
}
