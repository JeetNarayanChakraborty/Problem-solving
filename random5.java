/* Using a function rand7() that returns an integer from 1 to 7 (inclusive) with uniform probability, 
implement a function rand5() that returns an integer from 1 to 5 (inclusive). */





import java.util.Random;



public class Random_generator 
{
  int rand7()
	{
		int v;
		
		Random r = new Random();
		
		v = r.nextInt(8);
		
		if(v == 0)
		{
			v = 1;
		}
		
		return v;
	}
	
	void rand5()
	{
		int v;
		
		v = rand7();
		
		if(v>= 1 && v<=5)
		{
			System.out.println("Random number :" + v);
		}
		
		else
		{
			rand5();
		}	
	}
	
	
	
	public static void main(String[] args)
	{
		Random_generator g = new Random_generator();
		
		g.rand5();
	}
}
