/* Given an array of strings of digits, find the occurrence of a given pattern of digits. */





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

    /*
     * Complete the 'gridSearch' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING_ARRAY G
     *  2. STRING_ARRAY P
     */

    public static String gridSearch(List<String> G, List<String> P) 
    {
        int i,j,k,si=0,n=0,sk=0,t_or_f=1,bol=0,bol2=0,sj=0;
        String t1,t2;
        
        
        t1 = P.get(0);             //Getting first and last row of search matrix
        t2 = P.get(P.size()-1);
        
        
        
        for(i=0; i<G.size(); i++)
        {
            k = 0;
            j = P.get(0).length()-1;            //Length of search matrix
            
            
            while(j < G.get(0).length())
            {
                if(G.get(i).substring(k, j+1).equals(t1) &&            //Finding the exact position of search matrix
                   G.get(i+P.size()-1).substring(k, j+1).equals(t2))
                {
                    si = i;
                    sk = k;   //Storing indices
                    sj = j;
                    
                    bol = 1;
                    
                    System.out.println("Selected");
                    
                     
                    break;
                }
                 
                 
                 
                if(bol == 1)
                {
                    bol2 = 1;
                    break;
                }
                else
                {
                    k++;
                    j++; 
                }    
            }
            
            
            
            if(bol2 == 1)
            {
                break;
            }  
        }
        
        
     
     
     
        for(i=si; i<si + P.size(); i++)
        {
            t1 = G.get(i).substring(sk, sj+1);   //Determining the whole search matrix is there or not 
            
            
            System.out.println(t1);
            
            
            if(t1.equals(P.get(n)))
            {
                t_or_f = 1;
            }
            else
            {
                t_or_f = 0;
                
                break;
            }
            
            n++;
        }
        
        
        
        if(t_or_f == 1)
        {
            return "YES";
        }
        else
        {
            return "NO";
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int R = Integer.parseInt(firstMultipleInput[0]);

                int C = Integer.parseInt(firstMultipleInput[1]);

                List<String> G = IntStream.range(0, R).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());

                String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int r = Integer.parseInt(secondMultipleInput[0]);

                int c = Integer.parseInt(secondMultipleInput[1]);

                List<String> P = IntStream.range(0, r).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());

                String result = Result.gridSearch(G, P);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
