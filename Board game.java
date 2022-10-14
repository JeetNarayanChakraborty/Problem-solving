/* Conway's Game of Life takes place on an infinite two-dimensional board of square cells. Each cell is either dead or alive, and at each tick, the following rules apply:

Any live cell with less than two live neighbours dies.
Any live cell with two or three live neighbours remains living.
Any live cell with more than three live neighbours dies.
Any dead cell with exactly three live neighbours becomes a live cell.
A cell neighbours another cell if it is horizontally, vertically, or diagonally adjacent.


Implement Conway's Game of Life. It should be able to be initialized with a starting list of live cell coordinates and the number of steps it should run for. 
Once initialized, it should print out the board state at each step.

*/




import java.util.*;



public class Main
{
    static Scanner s = new Scanner(System.in);
    
    
    
    public int a[][];
    public int n1,n2,x,y,steps;
    static ArrayList<Integer> b = new ArrayList<Integer>();
    
    
    
    
    
    public void fill()
    {
        int i = 0;
        
        System.out.print("Enter board size :");
        n1 = s.nextInt();
        
        a = new int[n1][n1];
        
        System.out.print("No. of Live cells :");
        n2 = s.nextInt();
        
        
        while(i < n2)
        {
            System.out.print("Live cell location :");
            x = s.nextInt();
            y = s.nextInt();
            
            a[x][y] = 1;
            b.add(x);
            b.add(y);
            
            i++;
        }
        
        System.out.print("Number of steps :");
        steps = s.nextInt();
        System.out.println();
    }
    
    
    
    
    public void change()
    {
        int i = 0,j = 0,k = 0,count = 0,s = 0;
        
        
        while(s < steps)
        {
            while(j < b.size() - 1)
            {
                if((b.get(j) - 1) >= 0 && a[b.get(j) - 1][b.get(j+1)] == 1)
                {
                    count++;
                }
                
                if((b.get(j) + 1) < n1 && a[b.get(j) + 1][b.get(j+1)] == 1)
                {
                    count++;
                }
                
                if((b.get(j+1) - 1) >= 0 && a[b.get(j)][b.get(j+1) - 1] == 1)
                {
                    count++;
                }
                
                if((b.get(j+1) + 1) < n1 && a[b.get(j)][b.get(j+1) + 1] == 1)
                {
                    count++;
                }
                
                if((b.get(j) - 1) >= 0 && (b.get(j+1) - 1) >= 0 &&        
                a[b.get(j) - 1][b.get(j+1) - 1] == 1)
                {
                    count++;
                }
                
                if((b.get(j) + 1) < n1 && (b.get(j+1) + 1) < n1 &&
                   a[b.get(j) + 1][b.get(j+1) + 1] == 1)
                {
                    count++;
                }
                
                if((b.get(j) - 1) >= 0 && (b.get(j+1) + 1) < n1 &&
                        a[b.get(j) - 1][b.get(j+1) + 1] == 1)
                {
                    count++;
                }
                
                if((b.get(j) + 1) < n1 && (b.get(j+1) - 1) >= 0 &&
                        a[b.get(j) + 1][b.get(j+1) - 1] == 1)
                {
                    count++;
                }
                
                
                
                
                if(count >=2 && count <=3)
                {
                    a[ b.get(j) ][ b.get(j+1) ] = 1;
                }
                else
                {
                    a[ b.get(j) ][ b.get(j+1) ] = 0;
                }
                
                
                
                count = 0;
                j+=2;
            }
            
            
            
        
            for(i=0; i<n1; i++)
            {
                for(k=0; k<n1; k++)
                {
                    System.out.print(a[i][k]);
                }
                
                System.out.print("\n");
            }
            
            
            s++;
            j = 0;
            
            System.out.println("\n");
        }
    }
    
    
    

	public static void main(String[] args) 
	{
	    
	    Main m = new Main();
	    
	    
	    m.fill();
	    m.change();
	}
}
