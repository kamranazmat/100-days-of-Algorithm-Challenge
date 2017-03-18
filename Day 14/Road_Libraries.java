import java.io.*;
import java.util.*;

class BFS_graph {
    ArrayList<LinkedList<Integer>> graph = new ArrayList<LinkedList<Integer>>();
    boolean[] visited;
    boolean[] hasAccess;
    long count = 0;
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
        int q = scan.nextInt();
        
        while (q > 0) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int lib = scan.nextInt();
            int road = scan.nextInt();
            BFS_graph g = new BFS_graph(n+1);
            while (m > 0) {
                int city_1 = scan.nextInt();
                int city_2 = scan.nextInt();
                g.addEdge(city_1, city_2);
                m--;
            }

            if(lib <= road)
                System.out.println((long)lib * n);
            else {
                long sum = 0;
                for(int i = 1; i < n+1; i++) {            
                    g.count = 0;
                    if(!g.hasAccess[i]) {
                        sum += lib;  
                        for(int j=1; j < n+1; j++)
                            g.visited[j] = false;
                        g.visited[i] = true;
                        g.bfs(i);
                        sum += g.count * road;
                    }
                }
                System.out.println(sum);
            }
            q--;
        }
    }
}