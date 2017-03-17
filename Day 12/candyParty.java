import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class candyParty {
    private int currentCount;
    private int candyAdded;
    
    candyParty (int count) {
        this.currentCount = count;
        this.candyAdded = 0;
    }
    
    void refil(int n) {
        currentCount = n;
    }
    
    void beginParty(int[] c, int n, int t) {
        for(int i = 0; i < t; i++) {
            // System.out.println("Current count: " + currentCount);
            if(currentCount < 5) {
                candyAdded += (n-currentCount);
                refil(n);                
                // System.out.println(i + " " + candyAdded);
            }
            currentCount -= c[i];
        }        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
        
        candyParty s = new candyParty(n);
        s.beginParty(c, n, t);
        System.out.println(s.candyAdded);
    }
}