

/* Implement run-length encoding and decoding. Implement run-length encoding and decoding.  */






import java.util.Scanner;



public class Main
{
    static Scanner s = new Scanner(System.in);
    
    
    
    
    public static String encode(String text)
    {
        int i, count = 0;
        String cypherText="";
        
        
        
        for(i=0; i<text.length()-1; i++)
        {
            if(text.charAt(i) == text.charAt(i+1))
            {
                count++;                             //Count the occurrance of each character
                
                
                if((i+2) == text.length())
                {
                    cypherText += Character.forDigit((count+1), 10); //Edge case: if single occurance of last char, add it.
                    cypherText += text.charAt(i);
                }
            }
            
            else
            {
                cypherText += Character.forDigit((count+1), 10); //if change in char, add the previous char and its count.
                cypherText += text.charAt(i);
                
                count = 0;
                
                
                if((i+2) == text.length())
                {
                    cypherText += Character.forDigit(1, 10); //Edge case: if string ending, before char change, then add count and char
                    cypherText += text.charAt(i+1);
                }
            }
        }
        
        
        
        return cypherText;
    }
    
    
    
    public static String decode(String cypherText)
    {
        int i,j;
        String decodedText = "";
        
        
        
        for(i=0; i<cypherText.length(); i++)
        {
            if((int)cypherText.charAt(i) >= 49 && (int)cypherText.charAt(i) <= 57)
            {
                int t = Character.getNumericValue(cypherText.charAt(i)); //get count of char
                
                
                for(j=0; j<t; j++)
                {
                    decodedText += cypherText.charAt(i+1); //add char to the resulting string
                }
            }
        }
        
        
        
        return decodedText;
    }
    
    
    
    
    
	public static void main(String[] args) 
	{
	    String text;
	    
	    System.out.print("Enter text to encode :");
	    text = s.nextLine();
	    
	    
	    System.out.println("\nEncoded text :" + encode(text));
	    System.out.println("Decoded text :" + decode(encode(text)));
	}
}



