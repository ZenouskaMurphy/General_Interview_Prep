public class LeafNodes {
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

    // A leaf node is a node which does not have a left child node or right child node // 

    /////////////////////////// Print Leaf Nodes /////////////////////////////////////////

    public static void PrintLeafNodes(Node root){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            System.out.println(root.data + " ");
        }
        
        PrintLeafNodes(root.left);
        PrintLeafNodes(root.right);
    }

    /////////////////////////// Count Leaf Nodes /////////////////////////////////////////

    public static int CountLeafNodes(Node root){
        if(root == null){
            return 0 ;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        else{
            return CountLeafNodes(root.left) + CountLeafNodes(root.right);
        }
    }
}
