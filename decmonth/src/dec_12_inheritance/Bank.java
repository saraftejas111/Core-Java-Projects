package dec_12_inheritance;

public class Bank {
	
	int acc;
	String name;
	protected double balance;


     public Bank() {
    	 
     }


	public Bank(int acc, String name, double balance) {
		super();
		this.acc = acc;
		this.name = name;
		this.balance = balance;
	}
      
}