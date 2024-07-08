/* A binary string s is given such that it contains at least one '1'.
Rearrange the bits in such a way that the resulting binary number is the maximum odd binary number 
that can be created from this combination.
  
Return a string representing the maximum odd binary number that can be created from the given combination.
Note that the resulting string can have leading zeros. */




class Solution 
{
    public String maximumOddBinaryNumber(String s) 
    {
        int i, oneCount=0, zeroCount=0;
        String res="";


        for(i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == '1')
            {
                oneCount++;
            }

            else
            {
                zeroCount++;
            }
        }


        for(i=0; i<oneCount-1; i++)
        {
            res += '1';
        }

        for(i=0; i<zeroCount; i++)
        {
            res += '0';
        }

        res += '1';



        return res;
    }
}
