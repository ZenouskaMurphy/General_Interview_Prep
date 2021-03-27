public class PreOrderTraversal {
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
    /*  1. Visit the root
        2. Traverse left subtree
        3. Traverse right subtree
    */

    void printPreOrder(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.data + "");

        printPreOrder(node.left);

        printPreOrder(node.right);
    }
}
