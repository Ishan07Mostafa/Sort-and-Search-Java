import java.util.Arrays;

public class ArraySearch{
    private int[] array;
    private int size;

    /*
      The constructor takes an array as the parameter
      and initializes the array and the size of the array
     */
    public ArraySearch(int[] array){
        this.array = array;
        this.size = this.array.length;
    }

    /*
      Prints the initialized array
     */
    public void printArray(){
        int count = 0;
        for(int element: this.array){
            if(count==this.array.length-1) System.out.print(element+".");
            else{
                System.out.print(element+", ");
                count++;
            }
        }
        System.out.println();
    }

    /*
      Returns the size of the initialized array
     */
    public int countElement(){
        return this.size;
    }

    /*
      The simplest approach to search for an element in the
      given array. The linear search algorithm starts from
      the beginning of the array and works till the end, until
      the given element is found, where it returns the index of
      the specified element. Otherwise, it returns -1.
      Time Complexity: O(n)
      Space Complexity: O(1)
     */
    public int linearSearch(int element){
        for(int i = 0; i<this.size; i++){
            if(this.array[i]==element) return i;
        }
        return -1;
    }

    /*
      The binary search algorithm is used on a sorted array,
      and it repeatedly divides the search interval into half.
      It returns the index of the specified element once the
      element is discovered in the array. Otherwise, it
      returns -1.
      Time Complexity: O(log n)
      Space Complexity: O(1)
     */
    public int binarySearch(int element){
        if(this.array[0]>this.array[1]) Arrays.sort(this.array);
        int low = 0, high = this.array.length-1;
        while(low<=high){
            int middle = low + (high - low)/2;
            if(element>this.array[middle]) low = middle + 1;
            else if(element<this.array[middle]) high = middle - 1;
            else return middle;
        }
        return -1;
    }

    /*
      The simplest approach to search for an element in the
      given array. The linear search algorithm starts from the
      end of the array and works till the start, until the given
      element is found, where it returns the index of the specified
      element. Otherwise, it returns -1. A recursive approach
      is taken for this method.
      Time Complexity: O(n)
      Space Complexity: O(1)
     */
    public int linearSearch(int element, int index){
        if(index<0) return -1;
        else if(this.array[index]==element) return index;
        return linearSearch(element, index-1);
    }

    /*
      The binary search algorithm is used on a sorted array,
      and it repeatedly divides the search interval into half.
      It returns the index of the specified element once the
      element is discovered in the array. Otherwise, it
      returns -1. A recursive approach is taken for this method.
      Time Complexity: O(log n)
      Space Complexity: O(1)
     */
    public int binarySearch(int element, int low, int high){
        Arrays.sort(this.array);
        if(low<=high){
            int middle = low + (high - low)/2;
            if(this.array[middle]<element) return binarySearch(element, middle+1, high);
            else if(this.array[middle]>element) return binarySearch(element, low, middle-1);
            else return middle;
        }
        return -1;
    }
}
