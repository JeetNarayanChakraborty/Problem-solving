/* The cost of stock on each day is given in an array A[] of size N. Find all the segments of days on which you buy and 
sell the stock such that the sum of difference between sell and buy prices is maximized. 
Each segment consists of indexes of two elements, first is index of day on which you buy stock and 
second is index of day on which you sell stock. */



class Solution
{
    ArrayList<ArrayList<Integer>> stockBuySell(int A[], int n) 
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int buying_day=0, selling_day=0;
        
        int i = 0;
        
        
        while(i < n-1)
        {
            while(i < n-1 && A[i+1] <= A[i]) 
            {
                i++;
            }
            
            if(i == n-1) 
            {
                break;
            }
            
            buying_day = i;
            i++;
            
            while(i < n && A[i] >= A[i-1]) 
            {
                i++;
            }
            
            selling_day = i-1;
            
            ArrayList<Integer> segment = new ArrayList<>();
            segment.add(buying_day);
            segment.add(selling_day);
            result.add(segment);
        }
        
        
        
        return result;
    }
