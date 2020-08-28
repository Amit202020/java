package aa;

class PP {
	void display() {
		System.out.println("This is PP class");
	}
}

class AnnoDemo {

	PP p = new PP() {
		void display() {
			System.out.println("This is Anno class object");
		}
	};

	void demo() {
		p.display();
	}

	public static void main(String args[]) {
		AnnoDemo obj = new AnnoDemo();
		obj.demo();
	}
}
