/* Given a mapping of digits to letters (as in a phone number), and a digit string, 
return all possible letters the number could represent. */



import java.util.*;



public class Main
{
    
    private static ArrayList make()
    {
        
        Scanner s = new Scanner(System.in);
        
        
        ArrayList<Character> c = new ArrayList<Character>();
        
        
        
        int i,n;
        
        
        System.out.print("Number of elements :");
        n = s.nextInt();
        
        
        
        for(i=0; i<n; i++)
        {
            System.out.print("Enter Character :");  //Make Character List
            c.add(s.next().charAt(0));
        }
        
        
        return c;  //Return list
    }
    
    
    
    
    
    
    
    
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		
		
		
		Map<Integer,ArrayList> m = new HashMap<Integer,ArrayList>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		int i,j,n;
		
		
		
		System.out.print("How many :");
		n = s.nextInt();
		
		
		
		for(i=0; i<n; i++)
		{
		    System.out.print("\nEnter number :");
		    m.put(s.nextInt() , make());           //Number , Character list pairs
		}
		
		
		for(i=0; i<2; i++)
		{
		    System.out.print("\nEnter number to combine:");   //Pairs to combine by giving keys
		    a.add(s.nextInt());
		}
		
		
		System.out.print("\nPossible combinations :");
		
		
		
		
		for(i=0; i<m.get(a.get(0)).size(); i++)
		{
		    for(j=0; j<m.get(a.get(1)).size(); j++)
		    {
		        System.out.print(m.get(a.get(0)).get(i));      //Each character of first list with second list
		        System.out.print(m.get(a.get(1)).get(j) + " ");
		    }
		}
	}
}
