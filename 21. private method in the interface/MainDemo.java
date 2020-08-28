package pp;

@FunctionalInterface
interface Shape {
	
	public abstract void method1();
	
	public default void method2() {
		 System.out.println("default method");
		 method4();
		
	}
	public static void method3() {
		System.out.println("static method");
		method5();
		
	}
	private void method4() {
		System.out.println("private method");
		
	}
	private static void method5() {
		System.out.println("private static method");
	}
}

class Circle implements Shape {
	
	private void method9() {
		System.out.println("private method");
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
	
	
}

public class MainDemo {

	public static void main(String[] args) {

		Shape sh = new Circle();
		sh.method2();
		
		Shape.method3();

	}

}
