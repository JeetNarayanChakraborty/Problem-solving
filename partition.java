/* Given a pivot make 3 partitions of list - of elements lesser than, equal to and more than
pivot */





import java.util.*;




public class listPartition 
{
	Scanner s = new Scanner(System.in);
	
	ArrayList<Integer> p = new ArrayList<Integer>();
	ArrayList<Integer> p1 = new ArrayList<Integer>();
	ArrayList<Integer> p2 = new ArrayList<Integer>();
	ArrayList<Integer> p3 = new ArrayList<Integer>();
	
	void makePartition()
	{
		int i,pivot;
		
		
		for(i=0; i<8; i++)
		{
			System.out.print("Enter number :");
			p.add(s.nextInt());
		}
		
		System.out.print("\nEnter pivot :");
		pivot = s.nextInt();
		
		
		
		
		for(i=0; i<p.size(); i++)
		{
			if(p.get(i) < pivot)
			{
				p1.add(p.get(i));            //Less than then add in a less than list 
			}
			
			else if(p.get(i) == pivot)
			{
				p2.add(p.get(i));            //Equal then add in another list
			}
			
			else
			{
				p3.add(p.get(i));          //for greater elements another list
			}
		}
		
		
		p1.addAll(p2);
		p1.addAll(p3);              //Merge three lists
		
		
		System.out.print("\nAfter arranging :");
		
		for(i=0; i<p1.size(); i++)
		{
			System.out.print(p1.get(i) + " ");
		}
		
	}
	

  
  
  
	
	
	public static void main(String[] args)
	{
		listPartition l = new listPartition();
		
		l.makePartition();
	}	

}







