package javaCollection;
import java.util.*;

//wap to ask emp details from user and display them .
//store 5 employee details into a linkedlist 
//all classes inherits Object 

//TreeSet | TreeMap |PriorityQueue

class Emp implements Comparable<Emp>
{
	int empid;
	String name;
	
	public Emp(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + "]";
	}
	@Override
	 
	public int compareTo (Emp o) 
	{   
		if(this.empid> o.empid)   
			return 1;
		else if(this.empid<o.empid)
			return -1;
		else 
			return 0;
	}
}
 
public class CustomCollection {

	public static void main(String[] args) {
		
	Emp e= new Emp(1,"ashu");
	Emp e1= new Emp(2,"umesh");
	Emp e2= new Emp(3,"renu");
	Emp e3= new Emp(4,"gagan");
	Emp e4= new Emp(5,"kamal");
	
	//System.out.println(e);// calls toString method of its own class
	
	//LinkedList <Emp>  l = new LinkedList<Emp>();
	HashSet<Emp> l= new HashSet<Emp>();
	l.add(e);
	l.add(e1);
	l.add(e2);
	l.add(e3);
	l.add(e4);
	l.add(e4);
	l.add(new Emp(6,"priyanka"));
	
	System.out.println(l);
	}

}
