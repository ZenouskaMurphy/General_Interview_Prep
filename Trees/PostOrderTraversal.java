public class PostOrderTraversal {
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

    
    // METHOD - DFS //
    /*  1. Traverse left subtree
        2. Traverse right subtree
        3. Visit root node
    */

    void printPostOrder(Node node){
        if(node == null){
            return;
        }

        printPostOrder(node.left);

        printPostOrder(node.right);

        System.out.println(node.data + "");
    }
}
