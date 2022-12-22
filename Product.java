/* Product of all elements in a array except ith element 
(In O(n) time) */






import java.util.*;



public class product 
{
	Scanner s = new Scanner(System.in);
	
	
	
	void multiply()
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		int i,n,r=1;
		
		
		System.out.print("Number of elements :");
		n = s.nextInt();
		
		for(i=0; i<n; i++)
		{
			System.out.print("Enter number :");
			numbers.add(s.nextInt());
			
			r *= numbers.get(i);          ///Multiply all the numbers 
		}
		
		for(i=0; i<n; i++)
		{
			result.add(r / numbers.get(i));  //Divide by i th element to get desired result
		}
		
		System.out.print("\nResult :");
		
		
		for(i=0; i<result.size(); i++)
		{
			System.out.print(result.get(i) + " ");
		}	
	}
	
	
	
	public static void main(String[] args)
	{
		product p = new product();
		
		p.multiply();
	}

}










