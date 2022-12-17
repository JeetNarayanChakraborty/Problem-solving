/* Given a list of rules, check if the sum of the rules validate */






import java.util.*;




public class Directions 
{
	Scanner s = new Scanner(System.in);
	
	
	
	public ArrayList<Integer> located_At(int x, int y, String direction,Boolean revert)
	{
		ArrayList<Integer> temp = new ArrayList<Integer>();
		
		
			if(direction.equals("N"))
			{
				if(!revert)
				{
					temp.add(x - 1);
					temp.add(y);
				}
				
				else
				{
					temp.add(x + 1);
					temp.add(y);
				}
				
			}
			
			else if(direction.equals("S"))
			{
				if(!revert)
				{
					temp.add(x + 1);
					temp.add(y);
				}
				
				else
				{
					temp.add(x - 1);
					temp.add(y);
				}
			}
			
			else if(direction.equals("W"))
			{
				if(!revert)
				{
					temp.add(x);
					temp.add(y - 1);
				}
				
				else
				{
					temp.add(x);
					temp.add(y + 1);
				}
				
			}
			
			else if(direction.equals("E"))
			{
				if(!revert)
				{
					temp.add(x);
					temp.add(y + 1);
				}
				
				else
				{
					temp.add(x);
					temp.add(y - 1);
				}
				
			}
			
			else if(direction.equals("NE"))
			{
				if(!revert)
				{
					temp.add(x - 1);
					temp.add(y + 1);
				}
				
				else
				{
					temp.add(x + 1);
					temp.add(y - 1);
				}
			}
			
			else if(direction.equals("NW"))
			{
				if(!revert)
				{
					temp.add(x - 1);
					temp.add(y - 1);
				}
				
				else
				{
					temp.add(x + 1);
					temp.add(y + 1);
				}
			}
			
			else if(direction.equals("SE"))
			{
				if(!revert)
				{
					temp.add(x + 1);
					temp.add(y + 1);
				}
				
				else
				{
					temp.add(x - 1);
					temp.add(y - 1);
				}
			}
			
			else
			{
				if(!revert)
				{
					temp.add(x + 1);
					temp.add(y - 1);
				}
				
				else
				{
					temp.add(x - 1);
					temp.add(y + 1);
				}
			}
		
		
		return temp;
		
	}
	
	
	
	
	public void is_Valid()
	{	
		Scanner s2 = new Scanner(System.in);
		
		ArrayList<ArrayList<String>> rule = new ArrayList<ArrayList<String>>();
		ArrayList<Integer> location = new ArrayList<Integer>();
		ArrayList<String> places = new ArrayList<String>();
		ArrayList<String> tempListString = new ArrayList<String>();
		ArrayList<Integer> tempCoordinate = new ArrayList<Integer>();
		int i=0,j=0,r,x=0,y=1,t=0,x1=0,y1=0,x2=0,y2=0,si=0;
		String temp1="",temp2="",res;
		
		
		
		System.out.print("No. of rules :");
		r = s2.nextInt();
		
		
		for(i=0; i<r; i++)
		{
			rule.add(new ArrayList<String>());
			
			
			for(j=0; j<3; j++)
			{
				System.out.print("Enter rule :");         //Taking rules input from user
				tempListString.add(s.nextLine());
				
			}
			
			rule.get(i).addAll(tempListString);
			System.out.println(rule);
			tempListString.clear();
		}
		
		
		
		
		places.add(rule.get(0).get(2));        //Adding a place from rule 1 , in place list 
	
		
		visited.add(1);                          //Marking the place as visited
		location.add(2); location.add(2);      //Adding the location of the place
		
		
		
		for(i=0; i<rule.size(); i++)
		{
		
			temp1  = rule.get(i).get(0);        //Taking a rule, adding the place, determining the position of a place 
			                                      //with ref to another already added place 
			temp2 = rule.get(i).get(2);
			
			
			if(places.indexOf(temp1) != -1 && places.indexOf(temp2) != -1)
			{
				t=1;
				si = i;			 //If two places of a rule are already pointed , break
				
				break;
			}
			
			if(places.indexOf(temp1) != -1)
			{
				for(j=0; j<places.indexOf(temp1); j++)    
				{
					x += 2;        //Determining the coordinates of ref place by its position in the places array 
					y += 2;
				}
				
				places.add(temp2);
							
				tempCoordinate = located_At(location.get(x), location.get(y), rule.get(i).get(1), false); //getting the location of new place
				
				
				location.add(tempCoordinate.get(0));   // adding the location , and its coordinates
				location.add(tempCoordinate.get(1));    
			}
			
			else
			{
				for(j=0; j<places.indexOf(temp2); j++)   
				{
					x += 2;
					y += 2;
				}
				
				places.add(temp1);
				
							
				tempCoordinate = located_At(location.get(x), location.get(y), rule.get(i).get(1), true);
				
				
				location.add(tempCoordinate.get(0));
				location.add(tempCoordinate.get(1));   
			}

			x = 0;
			y = 1;
		}
		
		
		x = 0;
		y = 1;
		
		
		
		
		for(i=0; i<places.indexOf(temp1); i++)
		{
			x += 2;        
			y += 2;
		}
		
		x1 = location.get(x);                         //set coordinates of two places which are already visited
		y1 = location.get(y);
		
		x = 0;
		y = 1;
		
		for(i=0; i<places.indexOf(temp2); i++)
		{
			x += 2;        
			y += 2;
		}
		
		x2 = location.get(x);
		y2 = location.get(y);
		
		
		
		
		if(x2 < x1 && y2 == y1)                  //Determine the actual position of other w.r.t other position
		{
			res = "N";                        
		}
		
		else if(x2 > x1 && y2 == y1)
		{
			res = "S";
		}
		
		else if(x2 == x1 && y2 < y1)
		{
			res = "W";
		}
		
		else if(x2 == x1 && y2 > y1)
		{
			res = "E";
		}
		
		else if(x2 < x1 && y2 < y1)
		{
			res = "NW";
		}
		
		else if(x2 > x1 && y2 > y1)
		{
			res = "SE";
		}
		
		else if(x2 < x1 && y2 > y1)
		{
			res = "NE";
		}
		
		else 
		{
			res = "SW";
		}
		
		
		i = 0; 
		
		
		while(rule.get(i).get(0) != temp1 && rule.get(i).get(2) != temp2)
		{
			i++;              //take the given direction for those two places in rule 
		}
		
		
		
		if(res.equals(rule.get(i).get(1)))
		{
			System.out.println("\n\nDirections are valid");   // If both matches , direction is valid , else not valid
		}
		
		else 
		{
			System.out.println("\n\nDirections are invalid");
		}
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		Directions d = new Directions();
		
		d.is_Valid();
	}
	
}
