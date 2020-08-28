package staticdemo;


class AA {
	static int a = 20;

	static void show() {
		System.out.println("a=" + a);
	}

	
}


public class StaticVarDemo1 {
	
	void  demo() {
		System.out.println(AA.a);
		AA.show();
	}

	public static void main(String args[]) {
		StaticVarDemo1  obj=new StaticVarDemo1();
		obj.demo();
	}
}
