class    Order{
	int orderId; // instance variable
	String orderName; 
	String orderDesc;
	
	void  orderPending(){
		int b= 40; // local variable
		System.out.println("The order status is pending");
	}
	
	public static void main(String args[]){
		Order  rr   =   new  Order();
        System.out.println(rr.orderId+"/"+rr.orderName+"/"+rr.orderDesc);
        rr.orderPending();
    }
}