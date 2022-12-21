/* Given a string, return whether it represents a number. */
  
  
  
  import java.util.*;



public class num 
{
	Scanner s = new Scanner(System.in);
	
	
	void numOrNot()
	{
		String str;
		int i,b=0;
		
		
		System.out.print("Enter something :");
		str = s.nextLine();
		
		
		for(i=0; i<str.length(); i++)
		{
			if((int)str.charAt(i) == 45 || (int)str.charAt(i) == 46 || str.charAt(i) == 'e'
			  || ((int)str.charAt(i) >= 48 && (int)str.charAt(i) <= 57))
			{
				if(str.length() == 1 && ((int)str.charAt(i) == 45 || 
				(int)str.charAt(i) == 46 || str.charAt(i) == 'e'))
				{
					b = 1;
					break;
				}
				
				else
				{
				}
			}
			
			else
			{
				b = 1;
				break;
			}
		}
		
		if(b == 1)
		{
			System.out.println("\nNot a number");
		}
		
		else
		{
			System.out.println("\nValue :" + str);
		}
	}
	
	
	
	
	public static void main(String[] args)
	{
		num n = new num();
		
		n.numOrNot();
	}
	
}

