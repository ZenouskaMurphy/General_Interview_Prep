public class DeleteNodeFromLinkedList {
    
    void deleteNode(int position){
        // if linked list is empty, return
        if(head == null){
            return;
        }

        // create temp node to store head
        Node temp = head;

        // if node to be deleted is head node, point head to node after temp[head]
        if(position == 0){
            head = temp.next;
            return;
        }
        
        // iterate through linked list
        // temp = temp.next  
        // stop at 1 node before node to be deleted 
        for(int i=0; temp !=null && i<position-1; i++){
            temp = temp.next;
        }

        // if node to be deleted is out of bounds, return
        if(temp == null || temp.next == null){
            return;
        }

        // we are now at position of node to be deleted
        // we point pointer of previous node to node after node to be deleted[.next.next]
        // unlink deleted node from list
        Node next = temp.next.next;
        temp.next = next;
    }
}