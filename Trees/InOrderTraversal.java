public class InOrderTraversal {
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
        2. Visit the root
        3. Traverse right subtree
    */

    void printInOrder(Node node){
        if(node == null){
            return;
        }

        printInOrder(node.left);

        System.out.println(node.data + " ");

        printInOrder(node.right);
    }
}
