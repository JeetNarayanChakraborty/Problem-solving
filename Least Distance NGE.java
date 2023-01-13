/* Given an Array find the NGE of a element at given index.
If there are multiple NGE then take the NGE which of least distance from the element. */







import java.util.*;





public class NGE 
{
	Scanner s = new Scanner(System.in);
	
	
	
	void nextGreaterElement()
	{
		ArrayList<Integer> elements = new ArrayList<Integer>();
		ArrayList<Integer> ngeIndexes = new ArrayList<Integer>();
		int i,si=0,minDifference=Integer.MAX_VALUE, minIndex=Integer.MAX_VALUE,e;
		
		
		
		for(i=0; i<8; i++)
		{
			System.out.print("Enter number :");
			elements.add(s.nextInt());
		}
		
		
		System.out.print("\nEnter index of element to consider :");
		e = elements.get(s.nextInt());
		
		
		
		for(i=0; i<elements.size(); i++)
		{
			if((elements.get(i) - e) > 0 && minDifference > (elements.get(i) - e))
			{
				minDifference = elements.get(i) - e;        //Finding NGE by searching the Minimum distance element  (NGE - Next Greater Element)
				si = i;
			}
		}
		
		ngeIndexes.add(si);
		
		
		for(i=si+1; i<elements.size(); i++)
		{
			if((elements.get(i) - e) > 0 && minDifference == (elements.get(i) - e))   //Checking for more NGEs
			{
				ngeIndexes.add(i);
			}
		}
		
		
		
		if(ngeIndexes.size() == 1)
		{
			System.out.print("\nLeast distance Next Greater Element Index :" + (ngeIndexes.get(0))); //If one is found that the answer
		}
		
		else
		{
			for(i=0; i<ngeIndexes.size(); i++)
			{
				if(minIndex > Math.abs(ngeIndexes.get(i) - elements.indexOf(e)))
				{
					minIndex = Math.abs(ngeIndexes.get(i) - elements.indexOf(e));   //Comparing NGE index with element index to find the one with least distance
					si = ngeIndexes.get(i);
				}
			}
			
			System.out.print("\nLeast distance Next Greater Element Index :" + (si));
			
		}
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		NGE a = new NGE();
		
		a.nextGreaterElement();
	}
	
}







