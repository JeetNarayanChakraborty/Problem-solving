/* Find celebrity in a group a of people by asking minimum number of questions */






public class Celebrity 
{
	
	public void Find_Celeb()
	{
		int know[][] = {{0, 1, 0, 0, 1},
			             {0, 0, 0, 0, 1},
			             {0, 0, 0, 0, 1},
			             {0, 0, 1, 0, 1},
			             {0, 0, 0, 0, 0}};
		
		int[] out_degree = new int[know.length];
		int[] in_degree = new int[know.length];
		
		
		int i,j;
		
		
		for(i=0; i<know.length; i++)
		{
			for(j=0; j<know[i].length; j++)
			{
				if(know[i][j] == 1)
				{
					out_degree[i]++;
					in_degree[j]++;
				}
			}
		}
		
		
		for(i=0; i<know.length; i++)
		{
			if(out_degree[i] == 0 && in_degree[i] == (know.length-1))
			{
				System.out.println("Person " + (i+1) + " is Celebrity");	
			}
		}
	}
	
	
	
	public static void main(String args[])
	{
		Celebrity c = new Celebrity();
		
		c.Find_Celeb();
	}

}
