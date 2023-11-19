package javaCollection;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
    
		 Stack<Integer> s= new Stack<Integer>(); //LIFO - last in firstout 

		 s.push(10);//push is used to add 
		 s.push(20);
		 

		 s.push(30);
		 s.push(40);
		 s.push(50);
		 System.out.println(s.pop());
		 s.pop(); //used to remove element
		 s.pop();
		 s.pop();
		 s.pop();
		 //s.pop();//java.util.EmptyStackException
		 s.remove(0);//java ArrayIndexOutOfBoundsException if stack is empty
		 System.out.println(s);
		 
		 
	
		 System.out.println(s);
	}

}
