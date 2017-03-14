import java.util.*;
public class quickSort {    
    int partition(int[] a, int start, int end) {
        int pivot = end;
        int wall = start;

        for (int i = start; i < end; i++) {
            if(a[i] < a[pivot]) {
                int temp = a[wall];
                a[wall] = a[i];
                a[i] = temp;
                wall++;
            }
            //printArray(a);
        }
        int temp = a[wall];
        a[wall] = a[pivot];
        a[pivot] = temp;
        // printArray(a);
        /*int pivot = end;
        int wall = start; // start + 1

        for (int i = start+1; i <= end; i++) { // i = start to end-1
            if(a[i] < a[pivot]) {
                int temp = a[wall];
                a[wall] = a[i];
                a[i] = temp;
                wall++;
            }
        }
        
        int temp = a[wall-1];
        a[wall-1] = a[pivot];
        a[pivot] = temp;  */
        return wall;
    }  

    void quickSort(int[] ar, int start, int end) {
        if(start < end) {
            int wall = partition(ar, start, end);
            printArray(ar);
            quickSort(ar, start, wall-1);         
            quickSort(ar, wall+1, end);            
        }
    }   
 
    void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt(); 
        }
        
        quickSort q = new quickSort();
        q.quickSort(ar, 0, n-1);
    }    
}