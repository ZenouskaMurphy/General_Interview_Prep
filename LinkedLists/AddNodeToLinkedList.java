public class AddNodeToLinkedList {
    public void addNode(int data){
        Node newNode = new Node(data);

        // if linked list is empty, new Node is now the head and tail of the linked list
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        // if linked list is not empty, the existing tail will point to the new Node
        // new Node is now the new tail
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
}
