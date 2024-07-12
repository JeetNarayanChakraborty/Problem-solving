/*A sentence s​​​​​​ and an integer k​ is given​​​​​. Truncate s​​​​​​ such that it contains 
only the first k​​​​​​ words. Return s​​​​​​ after truncating it. */



class Solution 
{
    public String truncateSentence(String s, int k) 
    {
        int i, words=1;
        ArrayList<Integer> indices = new ArrayList<Integer>();


        for(i=0; i<s.length(); i++)
        {
            if(s.charAt(i) == ' ')
            {
                indices.add(i);
                words++;
            }
        }

        if(words == k)
        {
            return s;
        }

        else
        {
            return s.substring(0, indices.get(k-1));
        }
    }
}
