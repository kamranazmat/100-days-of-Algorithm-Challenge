import java.util.*;

class findPair {
   public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
       HashSet<Integer> hset = new HashSet<Integer>();      
       String ans = "No";

       System.out.print("Enter the number of elements: ");
       int n = scan.nextInt();
       System.out.print("Enter Sum: ");
       int sum = scan.nextInt();
       System.out.print("Enter the elements: ");
       for(int i = 0; i < n; i++) {
           int e = scan.nextInt();
           if(hset.contains(e)) {
               ans = "Yes";
           }        
           hset.add(sum-e);
       }
       
       System.out.println(ans);
   }    
}