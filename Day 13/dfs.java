import java.io.*;
import java.util.*;

// import com.sun.org.apache.xml.internal.serializer.ElemDesc;

class Graph {
    private LinkedList<Integer> adjacent[];
    private int V;

    Graph(int v) {
        V = v;
        adjacent = new LinkedList[v];
        for (int i = 0; i < v; i++)
            adjacent[i] = new LinkedList();
    }

    void addEdge(int v1, int v2) {
        adjacent[v1].add(v2);
    }

    void display() {
        System.out.println(adjacent);
    }

    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);        
        Graph g = new Graph(scan.nextInt());
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        // while(true) {
        //     System.out.println("Options: ");
        //     System.out.println("1. DFS");
        //     System.out.println("2. Add Edge");
        //     System.out.println("3. Display List");
        //     System.out.println("4. Exit");
        //     System.out.print(": ");

        //     int option = scan.nextInt();
        //     if(option == 1) {
        //         System.out.print("Start vertex: ");
        //         g.dfs(scan.nextInt());
        //     }
        //     else if(option == 2) {
        //         g.addEdge(scan.nextInt(), scan.nextInt());
        //     }
        //     else if(option == 3) {
        //         g.display();
        //     }
        //     else if(option == 4) {
        //         System.out.println("Thank You");
        //         break;
        //     }
        //     else
        //         continue;
        // }
    }
}