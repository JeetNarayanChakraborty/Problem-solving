/*  Find maximum sum of elements where the sums are equal in both stack */







import java.util.Scanner;



public class Msum 
{
	Scanner s = new Scanner(System.in);
	
	private int Stack1[] = new int[4];
	private int top1 = -1;
	private int Stack2[] = new int[4];
	private int top2 = -1;
	
	
	void push(int v1, int v2)
	{
		top1++;
		Stack1[top1] = v1;
		
		top2++;
		Stack2[top2] = v2;
	}
	
	void pop()
	{
		Stack1[top1] = 0;
		top1--;
	}
	
	
	
	void fill()
	{
		int i,v1=0,v2=0;
		
		for(i=0; i<4; i++)
		{
			System.out.print("Enter Number stack1 :");
			v1 = s.nextInt();
			System.out.print("Enter number stack2 :");
			v2 = s.nextInt();
			
			push(v1,v2);
		}	
	}
	
	
	boolean is_Empty()
	{
		int i,k=0;
		
		for(i=0; i<4; i++)
		{
			if(Stack1[i] == 0)
			{
				k = 1;
			}
			
			else
			{
				k = 0;
				break;
			}
		}
		
		if(k == 1)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	
	
	void maxSum()
	{
		int i,sum1=0,sum2=0;
		
		while(!is_Empty())
		{
			for(i=0; i<Stack1.length; i++)
			{
				sum1 += Stack1[i];
			}
			
			i = 0;
			
			while(sum2 != sum1 && i < Stack2.length)
			{
				sum2 += Stack2[i];
				i++;
			}
			
			
			if(sum2 == sum1)
			{
				System.out.println("The maximum sum is " + sum1);
				break;
			}

			pop();
			
			
			sum1 = 0;
			sum2 = 0;
		}
		
		if(is_Empty())
		{
			System.out.println("-1");
		}
	}
	
	
	
	public static void main(String[] args)
	{
		Msum m = new Msum();
		
		m.fill();
		m.maxSum();
	}
	
}




