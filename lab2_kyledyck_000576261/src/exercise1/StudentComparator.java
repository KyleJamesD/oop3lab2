/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1;

import java.util.Comparator;

/**
 *
 * @author kyled
 */
public class StudentComparator implements Comparator<Student>
{
        @Override
        // takes parameter two objects of the student class and compares there ages. if the age is equal compares name lexigraphically
        public int compare(Student s1, Student s2)
        {
            if (s1.getAge()-s2.getAge() >= 1)
                {return 1;}
            
            else if (s1.getAge() < s2.getAge())
                {return -1;}
            
            else
                {return s1.getName().compareTo(s2.getName());}
        
        
        }
}
