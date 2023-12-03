public class ListSort{
    public Node head;

    /*
      Constructor takes array as a parameter and
      initializes a linked list using the array
     */
    public ListSort(int[] array){
        this.head = new Node(array[0], null);
        Node tail = this.head;
        for(int i = 1; i<array.length; i++){
            tail.next = new Node(array[i], null);
            tail = tail.next;
        }
    }

    /*
      Prints the initialized linked list
     */
    public void printList(){
        for(Node n = this.head; n!=null; n = n.next){
            if(n.next==null) System.out.print(n.element+".");
            else System.out.print(n.element+", ");
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
        Node n = this.head;
        Node temp = new Node(0, null);
        while(n!=null){
            for(Node m = n; m!=null; m = m.next){
                if(n.element>m.element){
                    temp.element = n.element;
                    n.element = m.element;
                    m.element = temp.element;
                }
            }
            n = n.next;
        }
    }

}
