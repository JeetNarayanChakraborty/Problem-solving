

/*Given a list of numbers and a number k, return whether any two numbers from the list add up to k. */





import java.util.*;




public class Main
{
    public static boolean hasSumPair(ArrayList<Integer> nums, int target)
    {
        int i;
        Set<Integer> visited = new HashSet<Integer>();
        
        
        
        for(i=0; i<nums.size(); i++)
        {
            if(visited.contains(target - nums.get(i)))  // if compliment of the current number is present in visited index then pair found, 
                                                        // else add the number to visited list
            {
                return true;
            }
            
            
            visited.add(nums.get(i));
        }
        
        
        return false;
    }
    
    
    
    
    
	public static void main(String[] args) 
	{
	    int k=7;
		ArrayList<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		
		
		if(hasSumPair(nums, k))
		{
		    System.out.println("Pair found");
		}
		
		else
		{
		    System.out.println("Pair not found");
		}
	}
}
