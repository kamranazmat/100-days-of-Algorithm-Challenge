import java.io.*;

class binarySearch {
    int bSearch(int[] a, int start, int end, int val) {
        if (start < end) {
            int mid = (start+end) / 2;
            if (val == a[mid])
                return mid;            
            else if(val < a[mid])
                return bSearch(a, start, mid, val);
            else if(val > a[mid])
                return bSearch(a, mid+1, end, val);
        }
        return -1;
    }

    public static void main(String args[]) {
        int[] a = {5, 7, 8, 9, 10, 17};
        int len = a.length;
        int val = 9;

        binarySearch bs = new binarySearch();
        int pos = bs.bSearch(a, 0, len, val);

        if(pos == -1)
            System.out.println("Not Found!!!");
        else
            System.out.println("Found @: " + pos);
    }
}