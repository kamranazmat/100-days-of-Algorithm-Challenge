import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> master = new ArrayList<ArrayList<Integer>>();
        int n = scan.nextInt();
        while (n > 0) {            
            ArrayList<Integer> list = new ArrayList<Integer>();
            int l = scan.nextInt();
            while (l > 0) {
                list.add(scan.nextInt());
                l--;
            }
            master.add(list);
            n--;
        }
        int q = scan.nextInt();
        
        while (q > 0) {
            int a = scan.nextInt() - 1;
            int b = scan.nextInt() - 1;
            // can use isEmpty()
            try {
                int val = master.get(a).get(b);
                System.out.println(val);
            }
            catch (Exception e) {
                System.out.println("ERROR!");
            }
            q--;
        }
    }
}