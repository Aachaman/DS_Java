import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfsisfun { // Ensure the filename is bfsisfun.java
    int V;
    ArrayList<Integer>[] adjacencyList;

    @SuppressWarnings("unchecked")
    public bfsisfun(int noOfVertex) {
        V = noOfVertex;
        adjacencyList = (ArrayList<Integer>[]) new ArrayList[noOfVertex]; // Type cast to avoid unchecked warning
        for (int i = 0; i < noOfVertex; i++) {
            adjacencyList[i] = new ArrayList<>();
        }
    }

    void addEdge(int x, int y) {
        adjacencyList[x].add(y);
    }

    void bfs(int sourceVertex) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        
        visited[sourceVertex] = true;
        queue.add(sourceVertex);

        while (!queue.isEmpty()) {
            sourceVertex = queue.poll();
            System.out.print(sourceVertex + " ");

            for (int n : adjacencyList[sourceVertex]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        bfsisfun g1 = new bfsisfun(6);
        g1.addEdge(0, 1);
        g1.addEdge(0, 5);
        g1.addEdge(0, 2);
        g1.addEdge(1, 2);
        g1.addEdge(1, 0);
        g1.addEdge(2, 0);
        g1.addEdge(2, 1);
        g1.addEdge(2, 3);
        g1.addEdge(2, 4);
        g1.addEdge(3, 2);
        g1.addEdge(4, 2);
        g1.addEdge(4, 5);
        g1.addEdge(5, 0);
        g1.addEdge(5, 4);
        g1.bfs(0);
    }
}
