package expdemo.com;

public class ExceptionDemo {

	public static void main(String[] args) {


		try {

			int x[] = { 45, 67, 32, 65, 87 };
			System.out.println(x[7]);
			

		} catch (Exception e) {
			//e.getMessage();
			e.printStackTrace();
		}finally {
			
			System.out.println("this will never be printed");
		}

	}

}
