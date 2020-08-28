package pp;



class AA  {
	int a = 7;
}

class BB extends AA {
	int a = 9;

	void show() {
		System.out.println("a=" + a +"    super.a="+super.a);
	}

}

class SuperDemo {
	public static void main(String args[]) {
		BB obj = new BB();
		obj.show();
	}
}