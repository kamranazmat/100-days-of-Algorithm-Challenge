import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static int swapCount_iSort(int[] a, int len) {
        int count = 0;
        for (int i = 1; i < len; i++) {
            int point = a[i];
            int j = i-1;
            while (j >= 0 && point < a[j]) {
                a[j+1] = a[j];
                count++;
                j--;
            }
            a[j+1] = point;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] a = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = scan.nextInt();
        }
        int count = swapCount_iSort(a, len);
        System.out.println(count);
    }
}