import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node {
    Node next;
    long data;
    
    Node(long d) {
        this.data = d;
        next = null;
    }
}

class Solution {
    private static long max = 0;
    
    public static long findMax(Node head) {
        long max = 0;
        while (head != null) {
            if (head.data >= max)
                max = head.data;
            head = head.next;
        }
        return max;
    }
        
    public static Node insert(Node head, Long data) {
        if (head == null)
            return new Node(data);        
        else {
            Node newNode = new Node(0);
            newNode.data = data;
            newNode.next = head;
            head = newNode;
            return head;
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        Node head = null;
        
        while (n > 0) {
            Long q = scan.nextLong();
            if (q == 1) {
                long data = scan.nextLong();
                head = insert(head, data);
            }
            else if (q == 2)
                head = head.next;
            else
                System.out.println(findMax(head));
            n--;
        }
    }
}