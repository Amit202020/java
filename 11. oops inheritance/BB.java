package mm;

class AA {
	int x;
	int y;

	AA() {
	}

	AA(int a, int b) {
		this.x = a;
		this.y = b;
		System.out.println("x=" + x + "y=" + y);
	}
}

class BB extends AA {
	int x, y, z;

	BB() {
	}

	BB(int a, int b, int c) {
		super(a,b);
		//this.x = a;
		//this.y = b;
		this.z = c;
		System.out.println("a=" + a + "b=" + b + "c=" + c);
	}

	public static void main(String args[]) {
		BB obj = new BB(20, 30, 40);
	}
}
