import java.io.*;
import java.util.*;

class ArrayListPractice {
    static class Node {
        int data;
        Node next;

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list_int = new ArrayList<Integer>();

        list_int.add(10);
        list_int.add(20);

        list_int.add(0, 30);
        list_int.set(0, 15);
        System.out.println(list_int);
        System.out.println(list_int.get(0));

        ArrayList<ArrayList<Integer>> list_list = new ArrayList<ArrayList<Integer>>();

        list_list.add(list_int);
        list_int.set(1, 25);

        list_int = new ArrayList<Integer>();
        list_int.add(20);
        list_list.add(list_int);
        System.out.println(list_list);

        System.out.println(list_list.get(0).get(1));

        ArrayList<Node> list_node = new ArrayList<Node>();

        Node a = new Node(51);
        Node b = new Node(34);
        
        list_node.add(a);
        a.next = b;
        System.out.println(list_node);
        System.out.println(list_node.get(0).next.data);

        ArrayList<LinkedList> list_linked = new ArrayList<LinkedList>();
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();

        list_linked.add(list1);
        list_linked.add(list2);

        list_linked.get(0).add(29);
        list2.add(25);
        list2.add(24);

        System.out.println(list_linked.get(0));
        System.out.println(list_linked);
    }
}