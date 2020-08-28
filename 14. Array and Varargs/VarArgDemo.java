package pp;

import java.util.Arrays;
import java.util.List;

class VarArgDemo {
	
	@SafeVarargs
	static void display(List<String> ... j) {
		for (List<String> a : j) {
			System.out.println(a);
		}
	}

	public static void main(String args[]) {
		
		
		  List<String>  ls1=Arrays.asList("amit","sumit","arun");
		  display(ls1);
		
	}
}
