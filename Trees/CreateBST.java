class createBST{
    //Creating class for each node in tree
    class Node{
        int data;
        Node left;
        Node right; 
        
        //Assigning data, left node and right node to each node
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Represent root node of tree
    public Node root = null;
}


