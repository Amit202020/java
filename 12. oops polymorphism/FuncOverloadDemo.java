package mm;

class FuncOverloadDemo {
	public static void sum(int num1, int num2) {
		System.out.println( num1 + num2);
	}

	public static float sum(float num1, float num2) {
		return num1 + num2;
	}

	public static double sum(double num1, double num2) {
		return num1 + num2;
	}

	public static void main(String args[]) {
		sum(23, 45);
		System.out.println("double sum="+sum(20.00, 40.00));
		System.out.println("float sum="+sum(12.00f, 14.00f));
	}
}