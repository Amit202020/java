package set.com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

        Set<String>   sh = new HashSet<String>();// faster storage and retrieval
              sh.add("D");
              sh.add("A");
              sh.add("A");
              sh.add("E");
              sh.add("B");
              sh.add("C");
        System.out.println(sh);

       Set<String>   sh1 = new TreeSet<String>();  // Retrieve the object based on sorted order
              sh1.add("D");
              sh1.add("A");
              sh1.add("A");
              sh1.add("E");
              sh1.add("B");
              sh1.add("C");
        System.out.println(sh1);

      Set<String>   sh2 = new LinkedHashSet<String>();  // Retrieve based on insertion order
              sh2.add("D");
              sh2.add("A");
              sh2.add("A");
              sh2.add("E");
              sh2.add("B");
              sh2.add("C");
        System.out.println(sh2);

	}

}
