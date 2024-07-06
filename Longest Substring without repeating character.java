
/* Given a string s, find the length of the longest substring without repeating characters. */




import java.util.HashSet;
import java.util.Set;




class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int left=0, right=0, maxLength=0;
        Set<Character> charSet = new HashSet<>();


        for(right=0; right< s.length(); right++)
        {
            while(charSet.contains(s.charAt(right)))
            {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, (right - left + 1));
        }



       return maxLength;
    }
}
