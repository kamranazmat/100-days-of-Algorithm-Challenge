import java.util.*;
public class HashTablePractice {
   public static void main(String args[]) {
       Hashtable htable = new Hashtable(4);
            
       htable.put(1, "A");
       htable.put(2, "B");
       htable.put(3, "C");
       htable.put(4, "D");
       htable.put(5, "E");

       boolean isavailable = htable.containsKey(3);
       System.out.println(htable); 
       System.out.println(htable.toString());
       System.out.println(htable.size());
       System.out.println("Hash table contains key '3': " + isavailable);   
       System.out.println("Hash code value is :" + htable.hashCode());    
   }    
}