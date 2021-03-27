public class DeleteFromTree {
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

    public Node delete(Node root, int data){
        if(root == null){
            return root;
        }

        if(data < root.data){
            root.left = delete(root.left, data);
        }
        else if(data > root.data){
            root.right = delete(root.right, data);
        }

        else{
            /* Node has one child */
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }

            /* Node has two or more children
               Find smallest value in right subtree
               Delete this value
            */
            root.data = minValue(root.right);
            root.right = delete(root.right, data);
        }
        return root;   
    }

    int minValue(Node root){
       int minValue = root.data;
       while(root.left != null){
           minValue = root.left.data;
           root = root.left;
       }
       return minValue;
    }
}
