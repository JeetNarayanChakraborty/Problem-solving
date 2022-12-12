/* The are n different toys in store , with n different costs.
determine the minumum number of toys that can be bought with 'x' amount */






import java.util.*;




public class toys 
{
	Scanner s = new Scanner(System.in);
	
	
	void minToys()
	{
		ArrayList<Integer> costs = new ArrayList<Integer>();
		int i,n,money=0,remaining=0,no_of_toys=0,tempCost=0;
		
		
		System.out.print("Enter number of toys :");
		n = s.nextInt();
		
		for(i=0; i<n; i++)
		{
			System.out.print("Enter cost :");
			costs.add(s.nextInt());
		}
		
		System.out.print("Balance :");
		money = s.nextInt();
		
		Collections.sort(costs);    //Sort in ascending order
		
		remaining = money;
		
		
		if(remaining % costs.get(n-1) == 0)
		{
			no_of_toys += remaining / costs.get(n-1);    //If balance becomes 0 , break
			remaining = 0;
		}
		
		else
		{
			no_of_toys += remaining / costs.get(n-1);
			remaining -= costs.get(n-1) * (remaining / costs.get(n-1));    //else reduce the balance and add toys that can be purchased with that value
			
			
			
			for(i=n-2; i>=0; i--)
			{
				tempCost = costs.get(i);
				
				if(remaining % tempCost == 0)                       //Loop through the costs and repeat - reducing balance , adding toys
				{
					no_of_toys += remaining / tempCost;
					remaining = 0;
					break;
				}
				
				else
				{
					no_of_toys += remaining / tempCost;
					remaining -= tempCost * (remaining / tempCost);
				}
			}
			
			
			System.out.print("\nMinimum toys :" + no_of_toys);
		}
	}
	
	
	
	
	public static void main(String[] args)
	{
		toys t = new toys();
		
		t.minToys();
	}
	
}
