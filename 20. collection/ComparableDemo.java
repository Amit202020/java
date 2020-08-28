package set.com;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
	
		  TreeSet<Student>    ts = new TreeSet<Student>();
		  ts.add(new Student(30,"mac",80));
		  ts.add(new Student(40,"srini",85));
		  ts.add( new Student (15,"sonai",50));
		  ts.add(new Student (25,"nikhil",70));
		  Iterator<Student> it = ts.iterator();
		  while(it.hasNext()){
			  
			  Student   obj=it.next();
			  System.out.println(obj.getRollNo()+"/"+obj.getName()+"/"+obj.getMarks());
		  }
		  
		  

	}

}
