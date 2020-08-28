package map.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		  Map     mp = new HashMap();
		mp.put("1234", new Double(20000.00));
		mp.put("1235",new Double(30000.00));
          mp.put("1236",new Double(15000.00));
       Set   set = mp.entrySet();
       Iterator   it = set.iterator();
       while(it.hasNext()){
                     
                         Map.Entry me = (Map.Entry)it.next();
                         System.out.println(me.getKey() + ": "+ me.getValue()); }

        }

	}
