/* Given a list of words, find all pairs of unique indices such that 
the concatenation of the two words is a palindrome. */






import java.util.*;





public class pal 
{
	Scanner s = new Scanner(System.in);
	
	
	boolean isPalindrome(String s1, String s2)
	{
		String str = s1 + s2;
		StringBuilder sb = new StringBuilder(str);
		String strReverse = sb.reverse().toString();
		
		if(str.contentEquals(strReverse))            //Reverse string and then compare to determine it's palindrome or not
		{
			return true;                    
		}
		
		else
		{
			return false;
		}
	}
	
	
	void pairs()
	{
		ArrayList<String> words = new ArrayList<String>();
		ArrayList<ArrayList<Integer>> indexPairs = new ArrayList<ArrayList<Integer>>();
		
		int i,j,k=0;
		
		
		for(i=0; i<6; i++)
		{
			System.out.print("Enter word :");
			words.add(s.nextLine());
		}
		
		
		for(i=0; i<words.size(); i++)
		{
			for(j=i+1; j<words.size(); j++)
			{
				if(isPalindrome(words.get(i), words.get(j)) == true)    // compare stiring at index i and index j
				{
					indexPairs.add(new ArrayList<Integer>());    //If resultant string is palindrome add pairs of indices
					
					indexPairs.get(k).add(i);
					indexPairs.get(k).add(j);
					
					k++;
				}
			}
		}
		
		
		
		System.out.print("\nMatching pairs :");
		
		
		for(i=0; i<indexPairs.size(); i++)
		{
			System.out.print(indexPairs.get(i) + " ");   //Print output
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args)
	{
		pal p = new pal();
		
		p.pairs();
	}
	
}






