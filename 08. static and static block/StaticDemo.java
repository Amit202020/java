package ll;

class StaticDemo {

	int a = 90;
	static  int b  = 200;
	
    StaticDemo(){   
            System.out.println("Default constructor called");
     }

	static {
    	b++;
		System.out.println("This is static block");
	}
	
	{
		System.out.println("This is instance initializer");
	}

	public static void main(String args[]) {
		StaticDemo obj1 = new StaticDemo();
		StaticDemo obj2 = new StaticDemo();
		StaticDemo obj3 = new StaticDemo();
	}
	
	
}