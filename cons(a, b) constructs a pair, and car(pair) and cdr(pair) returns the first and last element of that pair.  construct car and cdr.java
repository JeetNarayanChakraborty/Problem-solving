

import java.util.*;





public class Main
{
    
    public static ArrayList<Integer> cons(int a,int b)
    {
        ArrayList<Integer> l = new ArrayList();
        
        l.add(a);
        l.add(b);
        
        return l;
    }
    
    
    public static int car(int a,int b)
    {
        ArrayList<Integer> hold = cons(a,b);
        
        
        return hold.get(0);
    }
    
    
    public static int cdr(int a,int b)
    {
        ArrayList<Integer> hold = cons(a,b);
        
        
        return hold.get(1);
    }
    
    



    
    
	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    
	    
	    Main m = new Main();
	    
	    int a,b,h1,h2;
	    
	    
	    System.out.print("Enter number :");
	    a = s.nextInt();
	    
	    System.out.print("Enter number :");
	    b = s.nextInt();
	    
	    
        h1 = m.car(a,b);
        h2 = m.cdr(a,b);
        
        System.out.println("\nFirst :" + h1);
        System.out.println("Last :" + h2);
	}
}

















