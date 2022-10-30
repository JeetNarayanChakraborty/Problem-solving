/*Given a list of integers, return the largest product that can be made by multiplying any three integers. */





import java.util.*;


public class Main
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		
		
		int a[];
		int i=0,n=0;
		
		
		
		
		System.out.print("No. of elements :");
		n = s.nextInt();
		
		
		a = new int[n];
		
		
		System.out.print("Enter number :");
		
		for(i=0; i<n; i++)
		{
		    a[i] = s.nextInt();
		}
		
		
        Arrays.sort(a);
        
        
        
        
        System.out.println("\n\nLargest product :" + a[n-3] * a[n-2] * a[n-1]);
	}
}
