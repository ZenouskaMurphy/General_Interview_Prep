public class CreateLinkedList {
    //Creating class for each node in a linkedlist 
    class Node{
        int data;
        Node next;

        //Assigning data and next pointer to each node
        public Node(int data){ 
            this.data = data;
            this.next = null; 
        }
    }

    //Represent head node and tail node of LinkedList
    public Node head = null;
    public Node tail = null;
}
