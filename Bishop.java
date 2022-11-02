/* Given N bishops, represented as (row, column) tuples on a M by M chessboard. 
Write a function to count the number of pairs of bishops that attack each other. */



import java.util.*;



public class Main
{
  public static void main (String[] args)
  {
    Scanner s = new Scanner (System.in);



    int a[][], i, j, n, nb, x = 0, y = 0, t1, t2;
    int no_of_pairs = 0;
    
    ArrayList < Integer > b = new ArrayList < Integer > ();


    System.out.print ("Enter board size :");
    n = s.nextInt ();

    a = new int[n][n];

    System.out.print ("No. of Bishops :");
    nb = s.nextInt ();



      for (i = 0; i < nb; i++)
      {
	      System.out.print ("Enter co-ordinate of Bishop :");
	      t1 = s.nextInt ();
	      t2 = s.nextInt ();

	      b.add (t1);
	      b.add (t2);

	      a[t1][t2] = 1;
      }



      i = 0;
      j = i + 1;


    while (j <= b.size () - 1)
    {

	      x = b.get (i);
	      y = b.get (j);
	


	      while (x > 0 && y < n - 1)
	      {
	          x--;
	          y++;


	          if (a[x][y] == 1)
	          {
		            no_of_pairs++;
	          }
	        }


          x = b.get (i);
	        y = b.get (j);


	    while (x < n - 1 && y > 0)
	    {
	         x++;
	         y--;


	        if (a[x][y] == 1)
	        {
		        no_of_pairs++;
	        }
	    }


        x = b.get (i);
	      y = b.get (j);



	    while (x > 0 && y > 0)
	    {
	        x--;
	        y--;


	        if (a[x][y] == 1)
	        {
		        no_of_pairs++;
	        }
      }


        x = b.get(i);
	      y = b.get(j);

    
    

	    while (x < n - 1 && y < n - 1)
      {
	        x++;
	        y++;


	        if (a[x][y] == 1)
	        {
		        no_of_pairs++;
	        }
	    }
	  
	  
	     x = b.get(i);
	     y = b.get (j);



	    i+=2;
	    j+=2;

    }



    System.out.println ("\nNumber of pairs :" + no_of_pairs/2);

  }
}

