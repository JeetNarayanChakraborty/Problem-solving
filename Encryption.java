/*A message is to be encrypted by finding the length of string without spaces then finding the sqaure root.
The string have to be rearranged in row * column where row = floor(root value) , column = ceil(root value) */





import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

   

    public static String encryption(String s) 
    {
        int i,j,k,count = 0,temp2 = 0,temp3 = 0;
        double temp1 = 0.0;
        ArrayList<Character> c = new ArrayList();
        String result = new String();
        
        
        
        for(i=0; i<s.length(); i++)
        {
            if(s.charAt(i) != ' ')
            {
                count++;
            }
        }
        
        temp1 = Math.sqrt(count);
        
        temp2 = (int)Math.floor(temp1);
        temp3 = (int)Math.ceil(temp1);
        
        
        if(temp2 * temp3 < s.length())
        {
            temp2++;
        }
        
        
        for(i=0 ;i<s.length(); i++)
        {
            if(s.charAt(i) != ' ')
            {
                c.add(s.charAt(i));
            }
        }
        
        
        for(i=0; i<temp3; i++)
        {
            k = i;
            
            for(j=0; j<temp2; j++)
            {
                result += c.get(k);
                
                if(k + temp3 <= c.size() - 1)
                {
                    k = k + temp3;
                }
                else if(k < temp3 - 1)
                {
                    continue;
                }
                else
                {
                    break;
                }
            }
            
            
            result += ' ';   
        }
        
     
              
        return result;  
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
