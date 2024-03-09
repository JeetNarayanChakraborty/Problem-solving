
/* Given an array of integers, return a new array where each element in the new array is the number of smaller elements 
to the right of that element in the original input array. */




import java.util.*;






public class Main 
{
    static Scanner s = new Scanner(System.in);



    public static void main(String args[])
    {
        int i, j, temp=0;
        ArrayList<Integer> originalArray = new ArrayList<Integer>();
        ArrayList<Integer> resultantArray = new ArrayList<Integer>();
        
        
        
        for(i=0; i<5; i++)
        {
            System.out.print("Enter number :");
            originalArray.add(s.nextInt());
        }
        
        
        
        
        for(i=0; i<5; i++) 
        {
            for(j=i+1; j<5; j++)
            {
                if(originalArray.get(j) < originalArray.get(i)) //check each element j after element at i, if smaller, count, add it to the resultant array.
                {
                    temp++;
                }
            }
            
            
            resultantArray.add(temp);
            
            temp = 0;
        }
        
        
        
        System.out.println("Originial Array " + originalArray);
        System.out.println("Resultant Array" + resultantArray);
    }
}
    
    
    
