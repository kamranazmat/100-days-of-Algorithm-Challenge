import java.util.*;

class Priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(5);
        System.out.println(pq);

        PriorityQueue p = new PriorityQueue(5);
        p.add(6);
        p.add(4);
        System.out.println(p);
    }
}