import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String play(int[] list, int l, int hop) {
        int current_pos = 0;
        boolean still_checking = true;
        
        while(still_checking) {
            if((current_pos + hop) >= l) {
                current_pos += hop;
                still_checking = false;
            }
            else if(list[current_pos + hop] == 0)
                current_pos += hop;
            else if(list[current_pos + 1] == 0)
                current_pos += 1;
            else
                still_checking = false;
        }

        if (current_pos >= l)
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t>0) {
            int l = scan.nextInt();
            int hop = scan.nextInt();
            int[] list = new int[l];
            for (int i=0; i<l; i++)
                list[i] = scan.nextInt();
            String ans = play(list, l, hop);
            System.out.println(ans);            
            t--;
        }
    }
}