public class LinkListLength{
    
    public int countNodes(){
        int number = 0;
        Node current = head;
        while (current != null){
            number++;
            current = current.next;
        }
        return number;
    }
}