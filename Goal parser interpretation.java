/* You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. 
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". 
The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command. */




class Solution 
{
    public String interpret(String command) 
    {
        String res="";

        for(int i=0; i<command.length(); i++)
        {
            if(command.charAt(i) == 'G')
            {
                res += command.charAt(i);
            }

            else if(command.charAt(i) == '(' && command.charAt(i+1) == ')')
            {
                res += 'o';
            }

            else if(command.charAt(i) == '(' && command.charAt(i+3) == ')')
            {
                res += command.charAt(i+1);
                res += command.charAt(i+2);
            }
        }


        return res;
    }
}
