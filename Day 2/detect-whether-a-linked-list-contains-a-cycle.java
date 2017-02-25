// import java.util.*;
/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if (head == null || head.next == null) {
        return false;        
    }
    else {
        ArrayList<Node> visited = new ArrayList<Node>();
        Node current = new Node();
         
        current = head.next;
        visited.add(head);
                
        while (current.next != null) {
            if (visited.contains(current.next)) 
                return true;
            else {
                visited.add(current);
                current = current.next;                
            }                
        }
        return false;
    }
}
