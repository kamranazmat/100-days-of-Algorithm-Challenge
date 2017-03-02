import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        BigInteger a = scan.nextBigInteger();
        BigInteger b = scan.nextBigInteger();
        
        BigInteger sum = new BigInteger("0");
        BigInteger product = new BigInteger("0");
        
        sum = a.add(b);
        product = a.multiply(b);
        System.out.println(sum);
        System.out.println(product);
    }
}