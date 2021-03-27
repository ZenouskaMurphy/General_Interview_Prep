class SearchTree { 
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
    
    public Node searchTree(Node root, int data){
        if(root == null || root.data == data){
            return root;
        }
        if(data < root.data){
            return searchTree(root.left, data);
        }
        else if(data > root.data){
            return searchTree(root.right, data);
        }
        return root;
    }
}