/* Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, 
count the number of ways it can be decoded. */




import java.util.*;




public class Main
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		
		int i,p = 1,k = 0,l = 0,m = 2;
		ArrayList<Integer> a = new ArrayList();
		
		
		for(i=0; i<7; i++)
		{
		   System.out.print("Enter number :");
		   a.add(s.nextInt());
		}
		
		
		
		while(m <= 5)
		{
		    for (i = l; i < m; i++)
		    {
                k = 10 * k + a.get(i);
		    }
		    
		    
		    if(k <= 26)
		    {
		        p++;
		    }
		    
		    l++;
		    m++;
		    k = 0;
		}
		
		System.out.println("\n" + p + " posiblities");
	}
}
