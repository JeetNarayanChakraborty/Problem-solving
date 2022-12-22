/* Given a set of closed intervals, find the smallest set of numbers that covers all the intervals. 
If there are multiple smallest sets, return any of them. */








import java.util.*;



public class interval 
{
	Scanner s = new Scanner(System.in);
	
	void minInterval()
	{
		ArrayList<ArrayList<Integer>> intervals = new ArrayList<ArrayList<Integer>>();
		int i,n,max=0,min=Integer.MAX_VALUE,lowerLimit=0,upperLimit=0;
		int si1=0,si2=0;
		
		
		
		System.out.print("Enter number of Intervals :");
		n = s.nextInt();
		
		
		for(i=0; i<n; i++)
		{
			intervals.add(new ArrayList<Integer>());
			
			System.out.print("Interval " + (i+1) + " :");
			
			intervals.get(i).add(s.nextInt());
			intervals.get(i).add(s.nextInt());
		}
		
		
		for(i=0; i<intervals.size(); i++)
		{
			if(max < intervals.get(i).get(1))
			{
				max = intervals.get(i).get(1);      //Find the interval which covers lowermost point
				si1 = i;
			}
		}
		
		
		for(i=0; i<intervals.size(); i++)
		{
			if(min > intervals.get(i).get(0))
			{
				min = intervals.get(i).get(0);    //Find the interval which covers uppermost point
				si2 = i;
			}
		}
		
		upperLimit = intervals.get(si1).get(0);
		lowerLimit = intervals.get(si2).get(1);
		
		
		for(i=0; i<intervals.size(); i++)
		{
			if(intervals.get(i).get(1) < lowerLimit)   //Check if some intervals have less range than lower interval
			{
				lowerLimit = intervals.get(i).get(1);     //Update lower limit
			}
		}
		
		for(i=0; i<intervals.size(); i++)
		{
			if(intervals.get(i).get(0) > upperLimit)   //Check if some intervals have less range than upper interval
			{
				upperLimit = intervals.get(i).get(0);    //Update upper limit
			}
		}
		
		
		
		
		System.out.print("\nMinimum interval is ");
		
		System.out.println(lowerLimit + " - " + upperLimit);
	}
	
	
	
	public static void main(String[] args)
	{
		interval val = new interval();
		
		val.minInterval();
	}

}
