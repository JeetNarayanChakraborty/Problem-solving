
/* Given an array of integers, every element appears twice except for one. Find that single one.
Implement a solution with a linear runtime complexity and use only constant extra space. */




import java.util.ArrayList;





public class Main
{
	public static void main(String[] args) 
	{
	    int Result = 0;
	    ArrayList<Integer> nums = new ArrayList<Integer>();
	    
	    nums.add(1);
	    nums.add(1);
	    nums.add(2);
	    nums.add(2);
	    nums.add(3);
	    
	    
        for(int i=0; i<nums.size(); i++) 
        {
            
            Result = Result ^ nums.get(i); // All duplicates elements will be cancelled out by 0 = 0 XOR A, A = A XOR A
        }
	    
	    System.out.println("Result :" + Result);
	}
}




