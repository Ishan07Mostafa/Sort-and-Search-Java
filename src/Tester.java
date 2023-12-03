public class Tester{
    public static void main(String[] args){

        System.out.println("\n/////  Test 01  /////");
        int[] array1 = {7, 2, 9, 1, 3, 0, 5, 4, 8, 6};
        ArraySort sort1 = new ArraySort(array1);
        System.out.println("Array before Bubble sort(iterative): ");
        sort1.printArray();
        sort1.bubbleSort();
        System.out.println("Array after Bubble sort(iterative): ");
        sort1.printArray();

        System.out.println("\n/////  Test 02  /////");
        int[] array2 = {7, 2, 9, 1, 3, 0, 5, 4, 8, 6};
        ArraySort sort2 = new ArraySort(array2);
        System.out.println("Array before Selection sort(iterative): ");
        sort2.printArray();
        sort2.selectionSort();
        System.out.println("Array after Selection sort(iterative): ");
        sort2.printArray();

        System.out.println("\n/////  Test 03  /////");
        int[] array3 = {7, 2, 9, 1, 3, 0, 5, 4, 8, 6};
        ArraySort sort3 = new ArraySort(array3);
        System.out.println("Array before Insertion sort(iterative): ");
        sort3.printArray();
        sort3.insertionSort();
        System.out.println("Array after Insertion sort(iterative): ");
        sort3.printArray();

        System.out.println("\n/////  Test 04  /////");
        int[] array4 = {7, 2, 9, 1, 3, 0, 5, 4, 8, 6};
        ArraySort sort4 = new ArraySort(array4);
        System.out.println("Array before Merge sort: ");
        sort4.printArray();
        sort4.mergeSort(array4);
        System.out.println("Array after Merge sort: ");
        sort4.printArray();

        System.out.println("\n/////  Test 05  /////");
        int[] array5 = {7, 2, 9, 1, 3, 0, 5, 4, 8, 6};
        ArraySort sort5 = new ArraySort(array5);
        System.out.println("Array before Quick sort: ");
        sort5.printArray();
        sort5.quickSort(array5,0,array5.length-1);
        System.out.println("Array after Quick sort: ");
        sort5.printArray();

        System.out.println("\n/////  Test 06  /////");
        int[] array6 = {7, 2, 9, 1, 3, 0, 5, 4, 8, 6};
        ArraySort sort6 = new ArraySort(array6);
        System.out.println("Array before recursive Insertion sort: ");
        sort6.printArray();
        sort6.insertionSortRecursive(array6, array6.length);
        System.out.println("Array after recursive Insertion sort: ");
        sort6.printArray();

        System.out.println("\n/////  Test 07  /////");
        System.out.println("Linear Search-Array");
        int[] array7 = {7, 2, 9, 1, 3, 0, 5, 4, 8, 6};
        ArraySearch search1 = new ArraySearch(array7);
        search1.printArray();
        System.out.println("Number of elements in the array: "+search1.countElement());
        System.out.println("Element found at index: "+search1.linearSearch(1));

        System.out.println("\n/////  Test 08  /////");
        System.out.println("Binary Search-Array");
        int[] array8 = {7, 2, 9, 1, 3, 0, 5, 4, 8, 6};
        ArraySearch search2 = new ArraySearch(array8);
        search2.printArray();
        System.out.println("Number of elements in the array: "+search2.countElement());
        System.out.println("Element found at index: "+search2.binarySearch(4));
        search2.printArray();

        System.out.println("\n/////  Test 09  /////");
        System.out.println("Linear Search-Array(Recursive)");
        int[] array9 = {7, 2, 9, 1, 3, 0, 5, 4, 8, 6};
        ArraySearch search3 = new ArraySearch(array9);
        search3.printArray();
        System.out.println("Number of elements in the array: "+search3.countElement());
        System.out.println("Element found at index: "+search3.linearSearch(7, array9.length-1));

        System.out.println("\n/////  Test 10  /////");
        System.out.println("Binary Search-Array(Recursive)");
        int[] array10 = {7, 2, 9, 1, 3, 0, 5, 4, 8, 6};
        ArraySearch search4 = new ArraySearch(array10);
        search4.printArray();
        System.out.println("Number of elements in the array: "+search4.countElement());
        System.out.println("Element found at index: "+search4.binarySearch(9, 0, array10.length-1));
        search4.printArray();

        System.out.println("\n/////  Test 11  /////");
        System.out.println("Linear Search-Linked List");
        int[] array11 = {7, 2, 9, 1, 3, 0, 5, 4, 8, 6};
        ListSearch search5 = new ListSearch(array11);
        search5.printList();
        System.out.println("Number of elements in the list: "+search5.countNode());
        System.out.println("Element found at index: "+search5.linearSearch(1));

        System.out.println("\n/////  Test 12  /////");
        System.out.println("Linear Search-Linked List(Recursive)");
        int[] array12 = {7, 2, 9, 1, 3, 0, 5, 4, 8, 6};
        ListSearch search6 = new ListSearch(array12);
        search6.printList();
        System.out.println("Number of elements in the list: "+search6.countNode());
        System.out.println("Element found at index: "+search6.linearSearch(9, search6.head));

        System.out.println("\n/////  Test 13  /////");
        int[] array13 = {7, 2, 9, 1, 3, 0, 5, 4, 8, 6};
        ListSort sort7 = new ListSort(array13);
        System.out.println("List before Bubble sort: ");
        sort7.printList();
        sort7.bubbleSort();
        System.out.println("List after Bubble sort: ");
        sort7.printList();
    }
}
