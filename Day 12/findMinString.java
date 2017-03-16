import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class findMinString {
    private static String base = "int";
    private static String ans = "";
    
    private static void minString(int n) {
        if(n > 2)
            minString(n-1);
        ans = "min(int, " + base + ")";
        base = ans;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        minString(n);
        System.out.println(ans);
    }
}
