package exercise1;

//must declare the datatype the comparable interface will use (this is called a genereic when left as T or E?)
public class Student implements Comparable<Student>
{
        //property getter
        public String getName() {
            return name;
        }
        //property getter
        public int getAge() {
            return age;
        }


        
        //these are fields not properties (properties are getters and setters)
	private String name;
	private int age;
	
        //constructor for Student Class
	public Student( String name, int age ) 
	{
		this.name = name;
		this.age = age;
        }
        
        //Override compareTo method from Comparable class put in our own implementation
        //Uses the compareTo method from the string class (two different methods same name) to lexigraphically comapre the string names of two objects.
        //returns positive integer if bigger
        //returns negative integer if smaller
        //returns 0 if lexigraphically equal
        //can be used by Collections.Sort? yes
        @Override
        public int compareTo(Student s) 
        {
        return this.name.compareTo(s.name);
        }    
	
        
        
        @Override
        public String toString() 
        {
        return "Name:" + this.name + " Age:" + this.age;
        }
        
        
        
        
}
