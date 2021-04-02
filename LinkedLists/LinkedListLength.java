public class LinkListLength{
    
    public int countNodes(){
        int length = 0;
        Node current = head;
        while (current != null){
            length++;
            current = current.next;
        }
        return length;
    }
}