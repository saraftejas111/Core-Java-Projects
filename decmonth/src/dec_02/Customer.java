package dec_02;

public class Customer {
	int cusid;
	String cusname;
	String cusadd;
	int pincode;
	
	void cstmr(int a, String n, String add, int pc) {
		cusid=a;
		cusname=n;
		cusadd=add;
		pincode=pc;
		
	}
	
	void display () {
		System.out.println(cusid);
		System.out.println(cusname);
		System.out.println(cusadd);
		System.out.println(pincode);
		
		
	}
	
	

}
