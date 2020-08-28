package pp;

class Emp {

	int empId;
	String empName;
	String empEmail;

	Emp(){ 
       System.out.println("default const"+empId+"/"+empName+"/"+empEmail);
    }

	Emp(int eid) {
		this();
		this.empId = eid;
		System.out.println("parameterized const with one arg  "+empId+"/"+empName+"/"+empEmail);
	}
	
	Emp(int eid,String ename) {
		this(eid);
		this.empName = ename;
		System.out.println("parameterized const with two arg  "+empId+"/"+empName+"/"+empEmail);
	}

	Emp(int eid, String ename, String email) {
		this(eid,email);
		this.empEmail = email;
		System.out.println("parameterized const with three arg  "+empId+"/"+empName+"/"+empEmail);
	}

	void display() {
	}

	public static void main(String args[]) {
		//Emp obj = new Emp();
		//Emp obj1 = new Emp(201);
		//Emp obj2 = new Emp(201,"Navin");
		
		Emp obj2 = new Emp(201,"Navin","navin@gmail.com");

	}
}
