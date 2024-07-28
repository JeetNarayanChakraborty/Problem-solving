/* Given an integer array arr[]. Find the contiguous sub-array(containing at least one number) that has the maximum sum and return its sum. */




class Solution
{
    long maxSubarraySum(int arr[], int n)
    {
       int i;
       long max_so_far = Long.MIN_VALUE, max_ending_here=0;
       
       
       for(i=0; i<n; i++)
       {
           max_ending_here = max_ending_here + arr[i];
           
           if(max_so_far < max_ending_here)
           {
               max_so_far = max_ending_here;
           }
           
           if(max_ending_here < 0)
           {
               max_ending_here = 0;
           }
       }
       
       
       
       return max_so_far;
    }
    
}
