import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    private int capacity;
    private int size;
    private int[] heap;
    
    Solution(int q) {
        this.capacity = q;
        this.size = 0;
        this.heap = new int[capacity];
    }
   
    void swap(int pos1, int pos2) {
        System.out.println("Swaping...");
        int temp = heap[pos1];
        heap[pos1] = heap[pos2];
        heap[pos2] = temp;
    }
    
    int parent(int childIndex) {
        return (childIndex-1)/2;
    }
    
    boolean hasParent(int childIndex) {
        System.out.println("Checking parent..");
        return (childIndex-1)/2 >= 0;
    }
    
    boolean hasLeftChild(int pos) {
        return (pos*2+1) <= size;
    }
    
    boolean hasRightChild(int pos) {
        return (pos*2+2) <= size;
    }
    
    void configure(int pos) {
        System.out.println("Reconfiguring ...");
        
        while(hasParent(pos) && (heap[pos] < heap[parent(pos)])) {
            System.out.println("has parent and value smaller than parent");
            swap(pos, parent(pos));
            System.out.println("Swapping " + pos + " " + parent(pos));
            pos = parent(pos);
        }
    }
    
    void configureDown(int pos) {
        while(hasLeftChild(pos)) {
            int swapPos = pos*2 + 1;
            if(hasRightChild(pos)) {
                if(heap[pos*2 + 1] > heap[pos*2 + 2])
                    swapPos = pos*2 + 2;
            }
            swap(pos, swapPos);
            pos = swapPos;
        }        
    }
    
    void insert(int val) {
        System.out.println("Inserting " + val);
        heap[size] = val;
        System.out.println("Current configuration: ");
        display();
        configure(size);
        System.out.println("After re-configuration: ");
        display();
        size++;
    }
    
    void delete(int val) {
        System.out.println("deleting " + val);
        int pos = 0;
        for(int i = 0; i < size; i++) {
            if(heap[i] == val) {
                pos = i;
                break;
            }                
        }
        System.out.println("Found at: " + pos);
        swap(pos, size-1);
        size -= 2;
        System.out.println("Current configuration: ");
        display();
        configureDown(pos);
        System.out.println("After re-configuration: ");
        display();
        size++;
    }
    
    void display() {
        for(int i = 0; i <= size; i++)
            System.out.print(heap[i] + " ");
        System.out.println();
    }
    
    void displayMin() {
        System.out.println(heap[0]);
    }        
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();        
        Solution s = new Solution(q);
        while(q > 0) {
            int type = scan.nextInt();
            if(type == 1)
                s.insert(scan.nextInt());
            else if(type == 2)
                s.delete(scan.nextInt());
            else if(type == 3)
                s.displayMin();
                //s.display();
            q--;
        }
    }
}