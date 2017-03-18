import java.io.*;
import java.util.*;

class DFS_graph {
    ArrayList<LinkedList<Integer>> graph = new ArrayList<LinkedList<Integer>>();
    boolean[] visited;
    Stack<Integer> adjacent = new Stack<Integer>();

    DFS_graph(int v) {                
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

    void dfs(int start) {
        if(!adjacent.empty()) {
            LinkedList temp = graph.get(start);
            Iterator it = temp.listIterator();
            while (it.hasNext()) {
                Integer ad = (Integer) it.next();
                if (!visited[ad]) {
                    adjacent.push(ad);
                    System.out.print(ad + " ");
                    visited[ad] = true;
                    dfs(adjacent.peek());
                }
            }
            adjacent.pop();
        }
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Enter number of vertices: ");
        int vertices = scan.nextInt();
        DFS_graph g = new DFS_graph(vertices);
        boolean continue_add = true;

        System.out.println("Enter edge start and end vertices: eg.. 0 5");

        while(continue_add) {
            g.addEdge(scan.nextInt(), scan.nextInt());
            System.out.print("Continue ? (y/n) ");
            String continue_option = scan.next();
            if(continue_option.equalsIgnoreCase("n"))
                continue_add = false;
        }

        System.out.print("DFS Starting from: ");
        int start = scan.nextInt(); 
        /* dfs operation */
        g.adjacent.push(start);
        System.out.print(start + " ");
        g.visited[start] = true;

        g.dfs(g.adjacent.peek());
        System.out.println();
    }
}