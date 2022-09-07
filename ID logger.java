/* You run an e-commerce website and want to record the last N order ids in a log. Implement a data structure to accomplish this, with the following API:

record(order_id): adds the order_id to the log
get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N. */




import java.util.*;



class logger
{
    Scanner s = new Scanner(System.in);
    
    
    
    private ArrayList<Integer> a = new ArrayList();
    
    
    public void record()
    {
        System.out.print("Enter number :");
        a.add(s.nextInt());
    }
    
    public void get_last(int i)
    {
        System.out.println(a.get(i-1));
    }
}





public class Main
{
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    
	    
	    logger l = new logger();
	    int i,t;
	    
	    
	    for(i=0; i<4; i++)
	    {
	        l.record();
	    }
	    
	    
	    System.out.print("\nOrder ID no. :");
	    t = s.nextInt();
	    
	    
	    l.get_last(t);
	}
}
