/* Given a expression as a string determine whether it's Parenthesis is Balanced or not */

import java.util.*;





public class Main
{
    static Scanner s = new Scanner(System.in);
    
    
    static int n;
    static char[] a;
    
     
    
    static void fill()
    {
        int i;
        
        System.out.print("Enter expression size :");
        n = s.nextInt();
        
        a = new char[n];
        
        
        for(i=0; i<n; i++)
        {
            System.out.print("Enter Character :");
            a[i] = s.next().charAt(0);   
        }
    }
    
    
    
    static void is_or_isnot()
    {
        int i,balanced = 1;
        int b[] = new int[3];
        
        
        
        for(i=0; i<n; i++)
        {
            if(a[i] == '(')
            {
                b[0]++;
            }
            
            else if(a[i] == '{')
            {
                b[1]++;
            }
            
            else if(a[i] == '[')
            {
                b[2]++;
            }
            
            else if(a[i] == ')')
            {
                b[0]--;
            }
            
            else if(a[i] == '}')
            {
                b[1]--;
            }
            
            else if(a[i] == ']')
            {
                b[2]--;
            }
            
            else {}
        }
        
        
        for(i=0; i<3; i++)
        {
            if(b[i] != 0)
            {
                balanced = 0;
                
                break;
            }
        }
        
    
        
        if(balanced == 1)
        {
            System.out.println("\nParenthesis balanced");
        }
        
        else
        {
            System.out.println("\nParenthesis not balanced");
        }
    }
    
    
    
	public static void main(String[] args) 
	{
		fill();
		
		is_or_isnot();
	}
	
}
