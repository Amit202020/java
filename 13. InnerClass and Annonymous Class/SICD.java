package mm;

class Outer {
	int a = 10;

	class Inner {
		int b = 20;

		void innershow() {
			int c = 30;
			System.out.println("a=" + a + "b=" + b + "c=" + c);
		}
	}

	void outershow() {
		Inner obj = new Inner();
		obj.innershow();
	}
}

class SICD {
	public static void main(String args[]) {
		Outer obj = new Outer();
		obj.outershow();
	}
}
