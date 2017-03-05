// { } ( ) [ ]
import java.util.*;
class Solution {   
   static boolean check(Stack st, char input) {
       if(input == '}') {
           if(st.peek() == '{')
               return true;
       }
       else if(input == ')') {
           if(st.peek() == '(')
               return true;
       }
       else if(input == ']') {
           if(st.peek() == '[')
               return true;
       }       
       return false;       
   }
    
   public static void main(String []argh) {
      Scanner sc = new Scanner(System.in);      
      
      while (sc.hasNext()) {
          String ipt = sc.next();
          boolean ans = true;
          Stack<Character> st = new Stack<Character>();
          for (int i = 0; i < ipt.length(); i++)
          {
              char input = ipt.charAt(i);
              if(!st.empty()) {
                  char top = st.peek();
                  if(check(st, input)) {
                      char removed = st.pop();
                  }
                  else {
                      st.push(input);
                  }
              }
              else
                  st.push(input);
          }
          if(!st.empty())
              ans = false;
          System.out.println(ans);
      }      
   }
}
