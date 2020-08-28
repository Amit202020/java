package qq;

interface HelloWorld {
	void hello();
}

class HelloFuncInterface {
	public static void main(String args[]) {
		HelloWorld hw = () -> System.out.println("Annonymous Class Object");
		hw.hello();
	}
}

