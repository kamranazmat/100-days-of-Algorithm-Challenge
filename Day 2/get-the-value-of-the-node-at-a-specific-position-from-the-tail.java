/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int count = 0, ans = -999999;
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    if (head.next != null)
        ans = GetNode(head.next, n);
    
    if (count == n) {
        ans = head.data;
    }
    count ++;
    return ans;
}

