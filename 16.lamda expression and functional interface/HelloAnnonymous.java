package pp;

interface HelloWorld {
	void hello();
}

class HelloAnnonymous {
	public static void main(String args[]) {
		HelloWorld hw = new HelloWorld() {
			public void hello() {
				System.out.println("Annonymous Class Object");
			}
		};
		
		hw.hello();
	}
}


