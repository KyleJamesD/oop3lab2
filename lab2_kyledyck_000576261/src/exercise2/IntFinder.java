/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2;

/**
 *
 * @author kyled
 */
public class IntFinder<E extends Comparable> {
    private int size;
    private E[] data;

    public int getSize() {
        return size;
    }

    public E [] getData() {
        return data;
    }

    public void setData(E[] data) {
        this.data = data;
    }

    public IntFinder(E[] data) {
        this.data = data;
        this.size = data.length;
    }
    
    
    
    
    public int binarySearch(E value)
    {
        //must minus 1 because size returns 1 to n
        //arrays starrt at 0
        int end  = this.size -1;
        int start = 0;
        int x = (end - start) / 2;
        
        while (start <= end)
        {
            //use comparable compareTo method to compar the int number in array list data at index [x] to the paramter value passed.
            //compareTo returns a positive integer if data[x] is larger then value, or negative integer if it is smaller, or zero if it is equal.
            if (data[x].compareTo(value) == 0 )
                return x;
            //if value is a larger integer then the int at data [x] else if will trigger and we eliminate the first half of the array.
            else if (value.compareTo(data[x])>0)
            {
             //at the first iteration of the loop start is equal to zero
             //start gets set to x+1 (the middle of the loop + one more index as we have already tested the middle index and it is not equal)
             start = x + 1;
             //x our testing component gets set to the middle of our new shortened loop (we have eliminated the first half of the sorted loop) 
             //as we know that value was greater then data at [x] so it cannot be in the first half of the sorted array. 
             //key note here is we must subtract the new start from end otherwise x will be set to the middle of the array again.
             x = start + (end - start)/2;
            }
            else 
            {
            // if the else statement gets triggered  it is because value was less than the int number at data[x], which means we know
            //that value is not in the last half of the sorted array. 
            //set end to x which is the middle of the array - 1 becuase we have already tested the middle of the array and know it is not equizalent to value
            end = x-1;
            // on the first iteration of the loop if value is smaller then data[x],  x gets set to the middle of the first half of the sorted array 
            x = start + (end - start)/2;
            
            }

            
        }    
        return -1;
    }
    
    
    
    
    
    
}
