/*
If you try to create an instance of this class like the following line you will get an error:
Book new_novel=new Book(); 
You have to create another class that extends the abstract class. 
Then you can create an instance of the new class. 
*/

import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
}

class MyBook extends Book {
    void setTitle(String s) {
        title = s;
    }
}

public class java_abstract_class {
	
	public static void main(String []args){
		//Book new_novel=new Book(); error: Book is abstract; cannot be instantiated
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		MyBook new_novel = new MyBook();
		new_novel.setTitle(title);
		System.out.println("The title is: " + new_novel.getTitle());
      	sc.close();
		
	}
}
