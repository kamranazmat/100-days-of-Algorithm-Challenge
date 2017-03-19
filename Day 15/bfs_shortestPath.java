import java.io.*;
import java.util.*;

class BFS_graph {
    ArrayList<LinkedList<Integer>> graph = new ArrayList<LinkedList<Integer>>();
    boolean[] visited;
    int[] shortest_distance;
    int Size = 0;
    int[] hop;
    Queue<Integer> adjacent = new LinkedList<Integer>();

    BFS_graph(int v) {                
        visited = new boolean[v];
        hop = new int[v];
        shortest_distance = new int[v];
        for (int i = 0; i < v; i++) {
            LinkedList temp = new LinkedList();
            graph.add(temp);
            visited[i] = false;
            shortest_distance[i] = -1;
            hop[i] = 1;
        }        
    }

    void addEdge(int v1, int v2) {
        graph.get(v1).add(v2);
        graph.get(v2).add(v1);
    }

    void display() {
        System.out.println(graph);
    }

    void bfs(int start) {
        LinkedList temp = graph.get(start);
        Iterator it = temp.listIterator();
        while (it.hasNext()) {
            Integer ad = (Integer) it.next();
            if (!visited[ad]) {
                adjacent.add(ad);
                shortest_distance[ad] = hop[start] * 6;
                hop[ad] = hop[start] + 1;
                visited[ad] = true;
            }
        }
        
        if(adjacent.peek() != null) {
            bfs(adjacent.poll());
        }
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int q = scan.nextInt();
        // int n = scan.nextInt();
        // int m = scan.nextInt();
        while (q > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            BFS_graph g = new BFS_graph(n+1);        
            while (m > 0) {
                int v_1 = scan.nextInt();
                int v_2 = scan.nextInt();
                g.addEdge(v_1, v_2);
                m--;
            }
            int s = scan.nextInt();
            g.visited[s] = true;
            g.bfs(s);
            for(int i = 1; i <= n; i++) {
                if(i != s)
                    System.out.print(g.shortest_distance[i] + " ");
            }
            System.out.println();            
            q--;
        }
    }
}