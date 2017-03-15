import java.util.*;

public class mergeSort {
    public void mSort(int[] a) {
        int l = a.length;
        if (l < 2)
            return;

        int mid = l/2;

        int[] left = new int[mid];
        int[] right = new int[l-mid];

        for(int i = 0; i < l; i++) {
            if(i < mid)
                left[i] = a[i];
            else
                right[i-mid] = a[i];
        }
        mSort(left);
        mSort(right);
        merge(left, right, a);
    }

    void merge(int[] left, int[] right, int[] a) {
        System.out.print("Full array(before): ");
        printArray(a);
        System.out.print("Left: ");
        printArray(left);
        System.out.print("Right: ");
        printArray(right);
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length) {
            if(left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            }
            else {
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < left.length) {
            a[k] = left[i];
            k++;
            i++;
        }
        while(j < right.length) {
            a[k] = right[j];
            k++;
            j++;
        }
        System.out.print("Full array(after): ");
        printArray(a);
    }

    void printArray(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }

        mergeSort ms = new mergeSort();
        ms.mSort(a);
        ms.printArray(a);
    }
}