/* Spare matrix representation of normal matrix */




import java.util.Scanner;



public class Sparse 
{
	Scanner s = new Scanner(System.in);
	
	private int matrix[][] = new int[5][5];	
	
	
	void makeSparse()
	{
		int i,j,n,x,y,v;
		
		System.out.print("Number of non zero elements :");
		n = s.nextInt();
		
		int sparseMatrix[][] = new int[3][n];
		
		
		for(i=0; i<n; i++)
		{
			System.out.print("x :");
			x = s.nextInt();
			System.out.print("y :");
			y = s.nextInt();
			
			System.out.print("value :");
			v = s.nextInt();
			matrix[x][y] = v;
			
			sparseMatrix[0][i] = x;
			sparseMatrix[1][i] = y;
			sparseMatrix[2][i] = v;
		}
		
		
		System.out.println("Normal matrix : ");
		
		
		for(i=0; i<5; i++)
		{
			for(j=0; j<5; j++)
			{
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("\n\nSpare Matrix :");
		
		
		for(i=0; i<3; i++)
		{
			for(j=0; j<n; j++)
			{
				System.out.print(sparseMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	
	public static void main(String[] args)
	{
		Sparse s = new Sparse();
		
		s.makeSparse();
	}
	
	
	
  
}




