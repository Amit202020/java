package pp;

class Outer {
	int a = 10;

	void show() {
		int b = 20;
		class Inner {
			int c = 30;

			void innerm1() {
				System.out.println("a=" + a + "b=" + b + "c=" + c);
			}
		}
		Inner obj = new Inner();
		obj.innerm1();
	}
}

class MLICDemo {
	public static void main(String args[]) {
		Outer obj = new Outer();
		obj.show();
	}
}
