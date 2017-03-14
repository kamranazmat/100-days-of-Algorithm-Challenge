import java.util.*;
public class insertionSort {

    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    static void iSort(int[] a) {
        int len = a.length;
        for (int i = 1; i < len; i++) {
            int point = a[i];
            int j = i-1;

            while (j >= 0 && point < a[j]) {
                a[j+1] = a[j];
                j --;
            }

            a[j+1] = point;
        }
        printArray(a);
    }                

   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] ar = new int[len];

        for(int i=0; i<len; i++) {
            ar[i] = in.nextInt();
        }
        
        iSort(ar);
    }
}