public class LevelOrderTraversal {
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

    // METHOD - BFS //
    /*  1. Get level order of tree (number of levels in tree)
        2. Get given level of tree (number of nodes at each level)
    */

    void printLevelOrder(Node root){
        int h = height(root);
        int i;
        for(i=1; i<=h; i++){
            printGivenLevel(root, i);
        }
    }

    int height(Node root){
        if(root == null){
            return 0;
        }
        else{
            int lheight = height(root.left);
            int rheight = height(root.right);

            if(lheight > rheight){
                return lheight + 1;
            }
            else{
                return rheight + 1;
            }
        }
    }

    void printGivenLevel(Node root, int level){
        if(root == null){
            return;
        }
        if(level == 1){
            System.out.println(root.data);
        }
        else if(level > 1){
            printGivenLevel(root.left, level-1);
            printGivenLevel(root.right, level-1);
        }
    }
}
