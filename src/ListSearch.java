public class ListSearch{
    public Node head;
    private int index;

    /*
      Constructor takes array as a parameter and
      initializes a linked list using the array
     */
    public ListSearch(int[] array){
        this.index = 0;
        this.head = new Node(array[0], null);
        Node tail = this.head;
        for (int i = 1; i < array.length; i++) {
            tail.next = new Node(array[i], null);
            tail = tail.next;
        }
    }

    /*
      Prints the initialized linked list
     */
    public void printList(){
        for(Node node = this.head; node!=null; node = node.next){
            if(node.next==null) System.out.print(node.element+".");
            else System.out.print(node.element+", ");
        }
        System.out.println();
    }

    /*
      Returns the number of nodes on a linked list
     */
    public int countNode(){
        int count = 0;
        for(Node node = this.head; node!=null; node = node.next)  count++;
        return count;
    }

    /*
      The simplest approach to search for an element in the
      given array. The linear search algorithm starts from
      the beginning of the list and works till the end, until
      the given element is found, where it returns the index
      node of the specified element. Otherwise, it returns -1.
      Time Complexity: O(n)
      Space Complexity: O(1)
     */
    public int linearSearch(int element){
        Node node = this.head;
        while(node!=null){
            if(node.element==element) return this.index;
            else this.index++;
            node = node.next;
        }
        return -1;
    }

    /*
      The simplest approach to search for an element in the
      given array. The linear search algorithm starts from
      the end of the list and works till the start, until the
      given element is found, where it returns the index node
      of the specified  element. Otherwise, it returns -1.
      A recursive approach is taken for this method.
      Time Complexity: O(n)
      Space Complexity: O(1)
     */
    public int linearSearch(int element, Node node){
        if(node.next==null) return -1;
        if (node.element==element) return this.index;
        else{
            this.index++;
            return linearSearch(element, node.next);
        }
    }
}

