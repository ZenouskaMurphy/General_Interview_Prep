import java.util.LinkedList;

public class GraphBFS {
    /* without recursion*/
    public void GraphBFS(int start){
        /*  Begin at start node
            Enqueue this node to an empty queue
            Mark start node as visited
            Visit start node
            Get adjacent vertices of start node
            If adjacent verices are not visited, enqueue to queue and dequeue start node
            Repeat until queue is empty
        */
        LinkedList<Integer> queue = new LinkedList<Integer>();
        boolean[] isVisited = new boolean[adj_list.size()];
        queue.add(start);
        while(!queue.isEmpty()){
            int current = queue.poll();
            visit(current);
            isVisited[current] = true;
            for(int dest: adj_list.get(current)){
                if(!isVisited[dest]){
                    queue.add(dest);
                }
            }
        }
    }
}
