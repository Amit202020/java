package mm;

public class ConstructorOverloadDemo {

	private int prodId;
	private String prodName;
	private String prodDesc;

	public ConstructorOverloadDemo(int prodId, String prodName, String prodDesc) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
	}

	public ConstructorOverloadDemo(int prodId, String prodName) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
	}

	public ConstructorOverloadDemo(int prodId) {
		super();
		this.prodId = prodId;
	}

	public ConstructorOverloadDemo() {
		super();
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public static void main(String[] args) {
		ConstructorOverloadDemo   obj1=new ConstructorOverloadDemo();
		ConstructorOverloadDemo   obj2=new ConstructorOverloadDemo(101);
		ConstructorOverloadDemo   obj3=new ConstructorOverloadDemo(102,"ipod");
		ConstructorOverloadDemo   obj4=new ConstructorOverloadDemo(103,"mob","price is 12000");
	}

}
