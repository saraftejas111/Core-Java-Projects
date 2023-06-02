package datasecured_dec_09;

public class EncapBank {
	int acc;
	String name;
	private double balance;

	EncapBank(int acc, String name, double balance) {
		this.acc = acc;
		this.name = name;
		this.balance = balance;
		this.SetAcc(acc);
	}
	
	void SetAcc(int acc) {
		 if(acc>1000)
        this.acc=acc;
		 else
       	 System.out.println(balance+" Balance is Invalid");
	 }

	void SetBalance(double balance) {
		 if(balance>1000)
         this.balance=balance;
		 else
        	 System.out.println(balance+" Balance is Invalid");
	 }

	@Override
	public String toString() {
		return "EncapBank [acc=" + acc + ", name=" + name + ", balance=" + balance + "]";
	}

}
