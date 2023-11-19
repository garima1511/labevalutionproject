package javaCollection;

import java.util.Vector;

public class day21 {

	public static void main(String[] args) {
	
		
		
	//Vector<String> v= new Vector<String>();//default capcity =10
	
		
	Vector  v= new Vector (2);//set capacity to 2
    v.add(0,"neha");
	v.add(3,"abc");
	
	 
	System.out.println(v);
	System.out.println(v.size());
	System.out.println(v.capacity());
	//System.out.println(v.get(3));
	}

}
