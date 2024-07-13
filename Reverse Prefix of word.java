/* Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and 
ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing. */




class Solution 
{
    public String reversePrefix(String word, char ch) 
    {
        int i;
        String result="";


        if(!word.contains(Character.toString(ch)))
        {
            return word;
        }

        for(i=word.indexOf(ch); i>=0; i--)
        {
            result += word.charAt(i);
        }
        
        result += word.substring(word.indexOf(ch)+1, word.length());


        return result;
    }
}
