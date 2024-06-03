package exercise1;

import java.util.ArrayList;
import java.util.Collections;
/**
@author  Kyle
*/
public class Driver
{

    /**
     * 
     * @param args 
     * This function is the entry point 
     */
	public static void main( String[] args )
	{

		ArrayList<Student> studs = new ArrayList<>();
		studs.add( new Student( "Smith", 34 ) );
		studs.add( new Student( "Johnson", 21 ) );
		studs.add( new Student( "Williams", 67 ) );
		studs.add( new Student( "Brown", 53 ) );
		studs.add( new Student( "Jones", 48 ) );
		studs.add( new Student( "Miller", 36 ) );
		studs.add( new Student( "Davis", 44 ) );
		studs.add( new Student( "Wilson", 52 ) );
		studs.add( new Student( "Anderson", 34 ) );
		studs.add( new Student( "Moore", 33 ) );

                
                
                
                
                System.out.println("Unsorted Student List:");
                for (int i=0; i < studs.size(); i++)
                {
                    System.out.println("Student at index:"+ i + " " +studs.get(i).toString());
                }
                
                
                
               System.out.println("\nSorted Student List using Comparable Interface and compareTo() method Alphabetically (lexigraphically).");
               Collections.sort(studs);
               for (int i=0; i < studs.size(); i++)
               {
                    System.out.println("Student at index:"+ i + " " +studs.get(i).toString());
               }
               
               
          
                
               System.out.println("\nSorted Student List using Comparator Interface and compare() method first by Age then by name Alphabetically (lexigraphically).");
                
                Collections.sort(studs, new StudentComparator());
                
                for (int i=0; i < studs.size(); i++)
                {
                    System.out.println("Student at index:"+ i + " " +studs.get(i).toString());
                }
                
                
	}

}
