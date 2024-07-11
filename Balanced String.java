/* Given a balanced string s, split it into some number of substrings such that:
Each substring is balanced.
  
Return the maximum number of balanced strings you can obtain. */



class Solution 
{
    public int balancedStringSplit(String s) 
    {
        int i, balance=0, balancedStrings=0;


        for(i=0; i<s.length(); i++)
        {
            balance = (s.charAt(i) == 'R') ? (balance - 1) : (balance + 1);

            if(balance == 0)
            {
                balancedStrings++;
            }
        }


        return balancedStrings;
    }
}
