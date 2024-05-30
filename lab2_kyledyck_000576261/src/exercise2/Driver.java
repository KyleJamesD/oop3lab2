package exercise2;

import java.util.Random;
import java.util.Scanner;

public class Driver
{
        //Static means the variable belongs to a Class itself instead of instances of the class
        //final is the keyword that this variable is a constant (unchangeable)
	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 10;
        public static void print(String msg) {System.out.println(msg); }
        
	public static void main( String[] args )
	{

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		int randnum = rand.nextInt( UPPER_BOUND );
		nums[0] = randnum;
                System.out.println(nums[0]);
                //this for loop uses the last index value + uppbound (number between 1 and 10) to assign the next random number
                // it requires num[0] to be set before executing otherwise it will throw an error of index 0 = null
		for( int i = 1; i < SIZE; i++ )
		{
			randnum = rand.nextInt( UPPER_BOUND );
			nums[i] = nums[i - 1] + randnum;
			System.out.println( nums[i] );
		}

                
                Scanner userinput1 = new Scanner(System.in);
                
                
                print("Please input an integer Number, if it is in the Array I will return the index number. if it is not I will return -1");
                Integer indextofind = userinput1.nextInt();
                System.out.println(indextofind);
                
                IntFinder find = new IntFinder(nums);
                        
                        
                int index = find.binarySearch(indextofind);
                if (index != -1)
                    System.out.println("Value was found at  index " + index);
                else 
                System.out.println("Not Found.");
                
                
	}


      
        
}
