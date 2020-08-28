package list.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListDemo1 {

	public static void main(String[] args) {
	    Vector<Emp>     arr = new  Vector<Emp>();
        arr.add(new Emp(20,"navin","navin@gmail.com"));
        arr.add(new Emp(21,"max","max@gmail.com"));
        arr.add(new Emp(22,"srini","srini@gmail.com"));
        System.out.println(arr);
        
        Iterator<Emp>   it = arr.iterator();
        while(it.hasNext()) {
      	  System.out.println(it.next());
        }

	}

}
