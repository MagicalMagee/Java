
public class Graph {
    //Adjaceny lists (using Bag data type)
    private final int V;
    private Bag<Integer>[] adj;
    
    //Create empty graph with V vertices
    public Graph(int V) {
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }
    // Add edge v-w (Parallel edges and self-loops allowed)
    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
    //Iterator for vertices adjacent to v
    public Iterable<Integer> adj(int v) {
        return adj[v];
    }
}
