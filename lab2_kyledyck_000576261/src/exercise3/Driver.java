package exercise3;

import java.util.Random;
import java.util.Scanner;

public class Driver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 1000;

	public static void main( String[] args )
	{

            Integer[] nums = new Integer[SIZE];
            Random rand = new Random();

            for( int i = 0; i < SIZE; i++ )
            {
                    nums[i] = rand.nextInt( UPPER_BOUND );
                    System.out.println( nums[i] );
            }

            System.out.println("\n");





            Scanner scanner1 = new Scanner(System.in);


            System.out.println("Please Choose a Algorithmn Method for Sorting the Above numbers:");
            System.out.println("*** HINT you should choose 'b' *** ");


            System.out.println(" 'b' = bubble Sort Algorithm ");
            System.out.println(" 'i' = Insertion Sort");
            System.out.println(" 's' = Selection Sort");
            System.out.println(" 'q' = Quick Sort");

            System.out.print(" Enter:");
            String userinput1 = scanner1.nextLine();



            //Incorrect implementation  of the bubble sort Algo
            //first try
            /*
            if (userinput1.equals("b"))    
            {
            Integer x;

            for( int j=0; j < SIZE; j++)
            {
                for (int y=0; y < SIZE; y++)
                {
                    if (nums[j]<nums[y])
                    {
                        x = nums[j];
                        nums[j]=nums[y];
                        nums[y] = x;
                    }
                }
            }


*/
            //Correect Implementation of the Bubble sort 
            if (userinput1.equals("b"))    
            {
                System.out.println("\n"); 
                
                for (int j=0; j <SIZE; j++)
                {
                    for (int y=1; y < SIZE; y++)
                        
                    {
                        if (nums[y-1] > nums[y])
                        {
                           int x = nums[y];
                           nums[y] = nums[y-1];
                           nums[y-1] = x;
                            
                        }
                    
                    }
                
                
                }
                
                
                for(int j = 0; j < SIZE; j++)
                {
                    System.out.println(nums[j]);
                }

            }

            else
            System.out.println("Thank you! you choose " + userinput1 );

            //end
	}

}
