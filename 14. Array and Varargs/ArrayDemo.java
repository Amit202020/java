package array.com;

public class ArrayDemo {

	public static void main(String[] args) {

		// int
		int a[] = new int[4];
		a[0] = 20;
		a[1] = 30;
		a[2] = 40;
		a[3] = 50;
		System.out.println(a[2]);

		// string
		String s[] = new String[3];
		s[0] = "india";
		s[1] = "UK";
		s[2] = "USA";
		System.out.println(s[2]);

		// User Defined Array

		Emp[] obj = new Emp[3];
		obj[0] = new Emp(20, "navin", "navin@gmail.com");
		obj[1] = new Emp(21, "max", "max@gmail.com");
		obj[2] = new Emp(22, "sonai", "sonai@gmail.com");
		
		System.out.println(obj[0].getEmpId() +"/"+ obj[0].getEmpName() +"/"+ obj[0].getEmpEmail());
		

	}

}
