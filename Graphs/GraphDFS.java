public class GraphDFS {
    /* without recursion*/ 
    public void GraphDFS(int start){
        /*  Begin at start node
            Push this node to an empty stack
            Mark start node as visited
            Visit start node
            Get adjacent vertices of start node
            If adjacent verices are not visited, push to stack and pop start node
            Repeat until stack is empty
        */

        Stack<Integer> stack = new Stack<Integer>(); 
        boolean[] isVisited = new boolean[adj_list.size()];
        stack.push(start);
        while (!stack.isEmpty()){
            int current = stack.pop();
            isVisited[current] = true;
            visit(current);
            for(int dest: adj_list.get(current)){
                if(!isVisited[dest]){
                    stack.push(dest);
                }
            }
        }
    }
}
