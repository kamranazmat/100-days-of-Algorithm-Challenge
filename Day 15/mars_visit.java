import java.io.*;
import java.util.*;

class BFS_graph {
    ArrayList<LinkedList<Integer>> graph = new ArrayList<LinkedList<Integer>>();
    boolean[] visited;
    boolean[] hasAccess;
    long count = 0;
    long sum = 0;
    long ans = 0;
    Queue<Integer> adjacent = new LinkedList<Integer>();

    BFS_graph(int v) {                
        visited = new boolean[v];
        hasAccess = new boolean[v];
        for (int i = 0; i < v; i++) {
            LinkedList temp = new LinkedList();
            graph.add(temp);
            visited[i] = false;
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
                count ++;
                visited[ad] = true;
                hasAccess[ad] = true;
            }
        }
        
        if(adjacent.peek() != null)
            bfs(adjacent.poll());
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        BFS_graph g = new BFS_graph(n);
        while (m > 0) {
            int person_1 = scan.nextInt();
            int person_2 = scan.nextInt();
            g.addEdge(person_1, person_2);
            m--;
        }

        for(int i = 0; i < n; i++) {            
            g.count = 1;
            if(!g.hasAccess[i]) {
                for(int j=0; j < n; j++)
                    g.visited[j] = false;
                g.visited[i] = true;
                g.bfs(i);                
                g.ans += (g.sum * g.count);
                g.sum += g.count;
            }            
        }  
        System.out.println(g.ans);
    }
}