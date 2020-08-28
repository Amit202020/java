package list.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		  Vector<String>     arr = new  Vector<String>();
          arr.add("A");
          arr.add("B");
          System.out.println(arr);
          arr.add("C");
          arr.add("A");
          System.out.println(arr);
          arr.add("E");
          arr.add("D");
          arr.add(4, "M");
          System.out.println(arr);
          arr.remove("D");
          arr.remove("B");
          System.out.println(arr);
          
          Iterator<String>   it = arr.iterator();
          while(it.hasNext()) {
        	  System.out.println(it.next());
          }

	}

}
