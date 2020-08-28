import java.util.*;
class ScannerDemo{
		public static void main(String args[]){
			System.out.println("Enter your name");
			Scanner sc=new Scanner(System.in);
			String name=sc.next();
			System.out.println("Enter your marks");
			int marks=sc.nextInt();
			System.out.println(name +"/"+marks);
		}
}