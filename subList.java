/* Given a list of integers S and a target number k, write a function that returns a subset of S that adds up to k. 
If such a subset cannot be made, then return null.

Integers can appear more than once in the list. You may assume all numbers in the list are positive. */





import java.util.*;




public class Main 
{
    
    static Scanner scanner = new Scanner(System.in);



    public static List<Integer> findSum(List<Integer> Group, int k) 
    {
        if (k == 0) 
        {
            return new ArrayList<>();
        }

        // Base case: If the subgroup is null, empty, or the target value is negative, no subset can be made
        
        if (Group == null || Group.isEmpty() || k < 0) 
        {
            return null;
        }

        // Select the first element of the subgroup
        
        int first = Group.get(0);

        // Recursively try including the first element in the subset
        
        List<Integer> subGroup = findSum(Group.subList(1, Group.size()), k - first);

        // If a subset is found, include the first element
        
        if (subGroup != null) 
        {
            subGroup.add(first);
            
            return subGroup;
        }

        // If no subset is found with the first element, try excluding it from the subset
        
        List<Integer> groupWithoutFirst = findSum(Group.subList(1, Group.size()), k);
        return groupWithoutFirst;
    }





    public static void main(String[] args) 
    {

        int i, targetValue = 0;
        List<Integer> numbers = new ArrayList<>();
        List<Integer> result;


        for (i = 0; i < 4; i++) 
        {
            System.out.print("Enter number: ");
            numbers.add(scanner.nextInt());
        }

        System.out.print("\nEnter target value: ");
        targetValue = scanner.nextInt();


        result = findSum(numbers, targetValue);



        if (result == null) 
        {
            System.out.println("No subset found");
        } 
        
        else 
        {
            System.out.println("\nSubset that adds up to target value: " + result);
        }
    }
}
