package pp;

interface  Shape {
	 void area();
		
}

class Circle implements Shape {
	public void area() {
		System.out.println("Circle Area");
	}
}

class FuncOverrideDemo {
	public static void main(String args[]) {

		Shape sh = new Circle();
		sh.area();
	}
}