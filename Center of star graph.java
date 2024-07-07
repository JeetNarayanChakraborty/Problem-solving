/* There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where 
there is one center node and exactly n - 1 edges that connect the center node with every other node.

A 2D integer array edges are given where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. 
Return the center of the given star graph. */





class Solution 
{
    public int findCenter(int[][] edges) 
    {
        int a = edges[0][0];
        int b = edges[0][1];
        int c = edges[1][0];
        int d = edges[1][1];
        

        if(a == c || a == d) 
        {
            return a;
        }
        else
        {
            return b;
        }   
    }
}
