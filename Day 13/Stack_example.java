import java.util.*;

class Stack_example {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.add(5);
        s.add(4);
        s.add(2);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.push(9);
        System.out.println(s);

        Stack<LinkedList> sl = new Stack<LinkedList>();
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();

        list1.add(91);
        list1.add(43);
        list2.add(10);
        list3.add(12);
        list3.add(11);
        list3.add(18);

        sl.push(list1);
        sl.push(list2);
        sl.push(list3);
    }
}