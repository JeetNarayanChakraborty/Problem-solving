/* Madison is a little girl who is fond of toys. Her friend Mason works in a toy manufacturing factory . 
Mason has a 2D board A of size H*W with  rows H and W columns. The board is divided into cells of size 1*1 with each cell indicated by its coordinate (i,j). 
The cell (i,j) has an integer Aij written on it. To create the toy Mason stacks Aij number of cubes of size 1*1*1  on the cell (i,j).

Given the description of the board showing the values of Aij and that the price of the toy is equal to the 3d surface area find the price of the toy. */




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
     * Complete the 'surfaceArea' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY A as parameter.
     */

    public static int surfaceArea(List<List<Integer>> A) 
    {
        int i=0,j=0,total = 0,temp1 = 0,temp2 = 0;
        
        
        
        
        for(i=0; i<A.size(); i++)
        {
            for(j=0; j<A.get(0).size(); j++)     //Calcualting total no. of sides of cubes by taking 6 sides each  
            {
                total += (6 * A.get(i).get(j)); 
            }  
        }
        
        
        
        for(i=0; i<A.get(0).size(); i++)
        {
            for(j=0; j<A.size()-1; j++)
            {   
                if(A.get(j+1).get(i) != 0)
                {
                    if(A.get(j+1).get(i) > A.get(j).get(i))
                    {
                        temp1 = A.get(j+1).get(i) - A.get(j).get(i);  //Removing the common sides along x axis
                        temp2 = A.get(j+1).get(i) - temp1;
                        
                        total -= 2 * temp2;
                    }
                    else
                    {
                        temp1 = A.get(j).get(i) - A.get(j+1).get(i);
                        temp2 = A.get(j).get(i) - temp1;
                        
                        total -= 2 * temp2;
                    }
                }
                else
                {
                    total = total;
                }
            }
        }
        
        
        
        for(i=0; i<A.size(); i++)
        {
            for(j=0; j<A.get(0).size()-1; j++)
            {   
                if(A.get(i).get(j+1) != 0)
                {
                    if(A.get(i).get(j) > A.get(i).get(j+1))
                    {
                        temp1 = A.get(i).get(j) - A.get(i).get(j+1);  //Removing Common sides along Y axis
                        temp2 = A.get(i).get(j) - temp1;
                        
                        total -= 2 * temp2;
                    }
                    
                    else
                    {
                        temp1 = A.get(i).get(j+1) - A.get(i).get(j);
                        temp2 = A.get(i).get(j+1) - temp1;
                        
                        total -= 2 * temp2;
                    }
                }
                else
                {
                    total = total;
                }
            }
        }
        
        
        
        for(i=0; i<A.size(); i++)
        {
            for(j=0; j<A.get(0).size(); j++)
            {
               total -= 2 * (A.get(i).get(j) - 1);   // Removing Common sides along z axis
            }  
        }
        
        
        
        
        
        
        return total;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int H = Integer.parseInt(firstMultipleInput[0]);

        int W = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> A = new ArrayList<>();

        IntStream.range(0, H).forEach(i -> {
            try {
                A.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.surfaceArea(A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
 
