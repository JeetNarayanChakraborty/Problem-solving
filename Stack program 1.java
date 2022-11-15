/* change the order of book represented by strings surrounded by Library wall '[' and ']'
in reverse without the walls */




import java.util.*;




public class Main
{
    private static ArrayList<String> a = new ArrayList<String>();
    private static int top = -1;
    
    
    
    static void push(String t)
    {
        a.add(t);
        top++;
    }
    
    
    static void pop()
    {
        System.out.println(a.get(top) + " ");
        
        a.remove(top);
        top--;
    }
    
    
    
    

	public static void main(String[] args) 
	{
	    Scanner s = new Scanner(System.in);
	    
	    
	    String b;
	    int i=1,j=1;
	    
	    
	    System.out.print("Enter String :");
	    b = s.nextLine();
	    
	    
	    
	    
	    while(j < b.length())
	    {
	       while(j < b.length() && (b.charAt(j) != '[' && b.charAt(j) != ']'))
	       {
	           j++;               //Find the Book names
	       }
	        

	       push(b.substring(i,j)); //Push to stack
	       
	       j++;
	       i = j;
	       
	    }
	    
	    
	    System.out.println("\n");
	    
	    
	    
	    while(!a.isEmpty())
	    {
	        pop();           //Pop stack to display in reversed order
	    }
	}
}
