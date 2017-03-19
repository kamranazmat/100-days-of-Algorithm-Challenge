import java.util.*;

class HashSetPractice {
   public static void main(String args[]) {
   
   HashSet<String> hset = new HashSet<String>();      
   
   hset.add("Learning"); 
   hset.add("Easy");
   hset.add("Simply");  
   
   System.out.println("Hash set values: "+ hset);
   Iterator it = hset.iterator();
   System.out.println("Hash set value: "+ it.next());
   }    
}