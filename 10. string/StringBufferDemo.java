package string.com;

public class StringBufferDemo {

	public static void main(String[] args) {

        StringBuffer   sb = new  StringBuffer();
        System.out.println(sb.length());                 
        System.out.println(sb.capacity());              
        StringBuffer   sb1 = new  StringBuffer(10); 
        System.out.println(sb1.length());                
        System.out.println(sb1.capacity());             
        StringBuffer   sb2 = new  StringBuffer("Hello");
        System.out.println(sb2.length());                 
        System.out.println(sb2.capacity());              

	}

}
