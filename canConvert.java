/* Given an array of integers, write a function to determine whether the array could become non-decreasing by modifying at most 1 element.
For example, given the array [10, 5, 7], you should return true, since we can modify the 10 into a 1 to make the array non-decreasing. */





import java.util.*;




public class Main
{
    static Scanner s = new Scanner(System.in);
    
    
	public static void main(String[] args) 
	{
	    int i, less = 0;
	    ArrayList<Integer> nums = new ArrayList<Integer>();
	    
	    
	    
	    for(i=0; i<5; i++)
	    {
	        System.out.print("Enter number :");
	        nums.add(s.nextInt());
	    }
	    
	    
	    for(i=0; i<4; i++)
	    {
	        if((nums.get(i+1) - nums.get(i)) < 0)
	        {
	            less++;  //Count number of occurances of Array value decreasing
	        }
	        
	    }
	    
	    
	   if(less >= 2) //as max 1 element can be modified, so if decreasing occurance is more than one, it is not possible to change it.
	   {
	       System.out.println("\nCannot become non-decreasing");
	   }
	   
	   else
	   {
	       System.out.println("\nCan become non-decreasing");
	   }
	}
}








