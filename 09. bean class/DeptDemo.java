package pp;

class Dept {
	private int deptId;
	private String deptName;

	Dept() {
	}

	public int getDeptId() { // getters
		return deptId;
	}

	public void setDeptId(int did) {// setters
		deptId = did;
	}

	public String getDeptName() { // getters
		return deptName;
	}

	public void setDeptName(String dname) {// setters
		deptName = dname;
	}

}

class DeptDemo {
	public static void main(String args[]) {
		Dept obj = new Dept();// deptId = 0 , deptName=null
		obj.setDeptId(3454); // deptId =3454 , deptName=null
		obj.setDeptName("Admin"); // deptId =3454 , deptName=Admin
		System.out.println(obj.getDeptId() + "/" + obj.getDeptName());
	}

}