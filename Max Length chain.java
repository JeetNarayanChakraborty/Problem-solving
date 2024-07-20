/* You are given N pairs of numbers. In every pair, the first number is always smaller than the second number. 
A pair (c, d) can follow another pair (a, b) if b < c. Chain of pairs can be formed in this fashion. 
You have to find the longest chain which can be formed from the given set of pairs. */


class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
        Arrays.sort(arr, (a, b) -> a.y - b.y);

        int maxLength = 1;
        int lastEnd = arr[0].y;


        for (int i = 1; i < n; i++) 
        {
            if (arr[i].x > lastEnd) 
            {
                maxLength++;
                lastEnd = arr[i].y;
            }
        }
        
        

        return maxLength;
    }
}
