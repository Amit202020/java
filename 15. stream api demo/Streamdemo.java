package qq;

import java.util.ArrayList;

class Emp {

	private String empId;
	private String empEmail;
	private String empName;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Emp(String empId, String empEmail, String empName) {
		super();
		this.empId = empId;
		this.empEmail = empEmail;
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empEmail=" + empEmail + ", empName=" + empName + "]";
	}

	public Emp() {
		super();
	}
}
public class Streamdemo {
	public static void main(String[] args) {
		ArrayList<Emp> arr = new ArrayList<Emp>();
		arr.add(new Emp("11", "arun@gmail.com", "arun"));
		arr.add(new Emp("12", "paro@gmail.com", "sonai"));
		arr.add(new Emp("13", "sumit@gmail.com", "sumit"));
		
		arr.stream().
		filter(p -> p.getEmpEmail().startsWith("p")).forEach(p -> System.out.println(p.getEmpName()));
	}

}
