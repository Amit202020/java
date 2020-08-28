package gcc.com;

public class GccDemo {

	public static void main(String[] args) {
		Runtime rs = Runtime.getRuntime();
		System.out.println("Free memory in JVM before Garbag Collection = " + rs.totalMemory());
		System.out.println("Free memory in JVM after Garbage Collection = " + rs.freeMemory());
        rs.gc();
        System.out.println("Free memory in JVM after Garbage Collection = " + rs.freeMemory());
        

	}

}
