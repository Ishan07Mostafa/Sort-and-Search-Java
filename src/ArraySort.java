public class ArraySort{
    private int[] array;
    private int size;

    /*
      Constructor that takes array as a parameter and
      initializes both the array and the size of the array
     */
    public ArraySort(int[] array){
        this.array = array;
        this.size = this.array.length;
    }

    /*
      Prints the initialized array
     */
    public void printArray(){
        for(int i = 0; i<this.size; i++){
            if(i==this.array.length-1) System.out.print(this.array[i]+".");
            else System.out.print(this.array[i]+", ");
        }
        System.out.println();
    }

    /*
      The simplest of all sorting algorithms, Bubble sort
      uses two nested loops to sort elements.
      Time Complexity: O(n^2)
      Space Complexity: O(1)
      Is Bubble sort in-place? => Yes
      Is Bubble sort stable? => Yes
     */
    public void bubbleSort(){
        int temp;
        for(int i = 0; i<this.size; i++){
            for(int j = i; j<this.size; j++){
                if(this.array[i]>this.array[j]){
                    temp = this.array[i];
                    this.array[i] = this.array[j];
                    this.array[j] = temp;
                }
            }
        }
    }

    /*
      In Selection sort, a minimum index is selected initially
      which gets updated every time an element smaller than the current
      minimum index is found. The minimum index is then sorted into
      it's correct position.
      Time Complexity: O(n^2)
      Space Complexity: O(1)
      Is Selection sort in-place? => Yes
      Is Selection sort stable? => No
     */
    public void selectionSort(){
        int minIndex;
        int temp;
        for(int i = 0; i<this.size; i++){
            minIndex = i;
            for(int j = i+1; j<this.size; j++) if(this.array[j]<this.array[minIndex]) minIndex = j;
            temp = this.array[minIndex];
            this.array[minIndex] = this.array[i];
            this.array[i] = temp;
        }
    }

    /*
      In Insertion sort, a key element is selected and compared
      with its preceding elements to sort it accordingly.
      Time Complexity: O(n^2)
      Space Complexity: O(1)
      Is Insertion sort in-place? => Yes
      Is Insertion sort stable? => Yes
     */
    public void insertionSort(){
        for(int i = 1; i<this.size; i++){
            int temp = this.array[i];
            int j = i-1;
            while(j>=0 && this.array[j]>temp){
                this.array[j+1] = this.array[j];
                j--;
            }
            this.array[j+1] = temp;
        }
    }

    /*
      Merge sort is one of the most efficient sorting algorithms.
      It relies on the divide-and-conquer strategy, where an array is
      divided into multiple sub-arrays till the very last element,
      when all the elements are merged into their right place. A merge
      method is used to merge all the sub-arrays. It is implemented as
      a recursive algorithm.
      Time Complexity: O(n*log(n))
      Space Complexity: O(1)
      Is Merge sort in-place? => No
      Is Merge sort stable? => Yes
     */
    public void mergeSort(int[] array){
        int middle = array.length/2;
        if(middle<1) return;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[array.length-middle];
        int j = 0;
        for(int i = 0; i<array.length; i++){
            if(i<middle) leftArray[i] = array[i];
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(array, leftArray, rightArray);
    }
    private void merge(int[] array, int[] leftArray, int[] rightArray){
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i = 0, left = 0, right = 0;
        while(left<leftSize && right<rightSize){
            if(leftArray[left]<rightArray[right]){
                array[i] = leftArray[left];
                i++;
                left++;
            }
            else{
                array[i] = rightArray[right];
                i++;
                right++;
            }
        }
        while(left<leftSize){
            array[i] = leftArray[left];
            i++;
            left++;
        }
        while(right<rightSize){
            array[i] = rightArray[right];
            i++;
            right++;
        }
    }

    /*
      Quick sort is one of the fastest sorting algorithms. By
      implementing a divide-and-conquer strategy, the algorithm
      takes an element as a pivot and partitions the array in such
      a way that the pivot element falls in the right place. The
      partition method is used to sort the elements of the array
      with respect to the position of the pivot. It is implemented
      as a recursive algorithm.
      Time Complexity: O(n*log(n))
      Space Complexity: O(1)
      Is Quick sort in-place? => Yes
      Is Quick sort stable? => No
     */
    public void quickSort(int[] array, int start, int end){
        if(end<=start) return;
        int pivot = partition(array, start, end);
        quickSort(array, start,pivot-1);
        quickSort(array, pivot+1, end);
    }
    private int partition(int[] array, int start, int end){
        int pivot = array[end];
        int i = start-1;
        int temp;
        for(int j = start; j<end; j++){
            if(array[j]<pivot){
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        temp = array[i];
        array[i] = array[end];
        array[end] = temp;
        return i;
    }

    /*
      This is the recursive implementation of Insertion sort.
      Time Complexity: O(n^2)
      Space Complexity: O(n)
      Is recursive Insertion sort in-place? => No
      Is recursive Insertion sort stable? => Yes
     */
    public void insertionSortRecursive(int[] array, int n){
        if(n<=1) return;
        insertionSortRecursive(array, n-1);
        int temp = array[n-1];
        int j = n-2;
        while(j>=0 && array[j]>temp){
            array[j+1] = array[j];
            j--;
        }
        array[j+1] = temp;
    }
}
