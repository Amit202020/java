package expdemo.com;


public class Throwsdemo {
	
	public static void show() throws Exception { // worker
		int a = 0;
		int b = 6;
		int c = b / a;
	}

	public static void main(String args[]) { // caller
		try {
			show();
		} catch (Exception e) {
		//	e.printStackTrace();
		}
	}
}
