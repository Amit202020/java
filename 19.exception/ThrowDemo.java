package expdemo.com;

class ThrowDemo {
	static void calculate(int age) throws Exception {
		if (age < 12) {
			throw new AgeOutOfRangeException("wrong age input");
		} else {
			System.out.println("Correct input");
		}
	}

	public static void main(String args[]) {
		try {
			calculate(20);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
