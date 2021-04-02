public class CreateGraph {

    //class to store edges of weighted graph
    class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    //graph class
    class Graph{
        //class to store nodes of adjacency list
        static class Node{
            int value;
            int weight;

            public Node(int value, int weight){
                this.value = value;
                this.weight = weight;
            }
        }
        //defintion of adjacency list
        List <List<Node>> adj_list = new ArrayList<>();

        public Graph(List<Edge> edges){
            //adjacency list memory allocation
            for(int i=0; i<edges.size(); i++){
                adj_list.add(i, new ArrayList<>()); //key + value       
            }
            //add edges to the graph
            for(Edge e: edges){
                //allocation of new vertice in adjacency list from src to dest
                adj_list.get(e.src).add(newNode(e.dest, e.weight));
            }
        }
    }
}
