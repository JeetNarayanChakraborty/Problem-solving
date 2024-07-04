/* Given an array of characters chars, compress it using the following algorithm:

Begin with an empty string s. For each group of consecutive repeating characters in chars:

If the group's length is 1, append the character to s.
Otherwise, append the character followed by the group's length. */





class Solution 
{
    public int compress(char[] chars) 
    {
        int c=1;
        StringBuilder sb=new StringBuilder();


        for(int i=0;i<chars.length;i++)
        {
            if(i+1<chars.length && chars[i]==chars[i+1])
            {
                c++;
            }
            else
            { 
                sb.append(chars[i]);

                if(c>1)
                {
                    sb.append(c);
                }

                c=1;
            }
        }

        char[] compressedChars = sb.toString().toCharArray();
        System.arraycopy(compressedChars, 0, chars, 0, compressedChars.length);

        
        return sb.length(); 
    }
}
