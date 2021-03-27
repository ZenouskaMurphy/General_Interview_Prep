public class InsertIntoTree {
    /* Tree Declaration*/
    class Node{
        int data;
        Node left;
        Node right; 
    
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    /* Tree Declaration */

    public Node insert(Node root, int data){
        if(root == null){
            return root;
        }
        if(data < root.data){
            root.left = insert(root.left, data);
        }
        else if(data > root.data){ 
            root.right = insert(root.right, data);
        }
        return root;
    }
}
