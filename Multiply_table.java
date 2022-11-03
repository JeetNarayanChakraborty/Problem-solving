/* Given integers N and X, write a function that returns the number of times X appears as a value in an N by N multiplication table.
where a[i][j] contains i*j */







import java.util.Scanner;



public class Multiply_table 
{
	Scanner s = new Scanner(System.in);
	
	
	
	int m[][],n;
	
	
	
	
	void fill()
	{
		int i,j;
		
		System.out.print("Enter Table size :");
		n = s.nextInt();
		
		m = new int[n][n];
		
		
		for(i=0; i<n; i++)
		{
			for(j=0; j<n; j++)
			{
				m[i][j] = (i+1) * (j+1);
			}
		}
	}
	
	
	void count()
	{
		int c=0,i=0,x=0;
		
		System.out.print("Enter number to find :");
		x = s.nextInt();
		
		
		for(i=1; i<=n; i++)
		{
			if((x % i == 0) && (x/i <= n))
			{
				c++;
			}
		}
		
		
		if(c >= 1)
		{
			System.out.println("\nFound :" + c + " times");
		}
		else
		{
			System.out.println("Not found");
		}
	}
	
	

	
	
	public static void main(String[] args)
	{
		Multiply_table t = new Multiply_table();
		
		t.fill();
		t.count();
	}
}
