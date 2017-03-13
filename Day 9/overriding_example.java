class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}

public class overriding_example {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and object
      Animal b = new Dog();   // Animal reference but Dog object
      Dog c = new Dog();
      // Dog d = new Animal(); error

      a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class
      c.move();
      // d.move();
   }
}