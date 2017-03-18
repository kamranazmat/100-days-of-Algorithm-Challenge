import java.io.*;
import java.util.*;

class BFS_graph {
    ArrayList<LinkedList<Integer>> graph = new ArrayList<LinkedList<Integer>>();
    boolean[] visited;
    Queue<Integer> adjacent = new LinkedList<Integer>();

    BFS_graph(int v) {                
        visited = new boolean[v];
        for (int i = 0; i < v; i++) {
            LinkedList temp = new LinkedList();
            graph.add(temp);
            visited[i] = false;
        }
    }

    void addEdge(int v1, int v2) {
        graph.get(v1).add(v2);
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
                System.out.print(ad + " ");
                visited[ad] = true;
            }
        }
        
        if(adjacent.peek() != null)
            bfs(adjacent.poll());
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter number of vertices: ");
        int vertices = scan.nextInt();
        BFS_graph g = new BFS_graph(vertices);
        boolean continue_add = true;

        System.out.println("Enter edge start and end vertices: eg.. 0 5");

        while(continue_add) {
            g.addEdge(scan.nextInt(), scan.nextInt());
            System.out.print("Continue ? (y/n) ");
            String continue_option = scan.next();
            if(continue_option.equalsIgnoreCase("n"))
                continue_add = false;
        }

        System.out.print("BFS Starting from: ");
        int start = scan.nextInt(); 
        System.out.print(start + " ");
        g.visited[start] = true;
        g.bfs(start);
        System.out.println();
    }
}