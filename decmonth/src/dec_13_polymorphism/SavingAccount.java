package dec_13_polymorphism;

public class SavingAccount extends Account {

	double min_bal;
	double with_amnt;

	public SavingAccount() {
	}

	public SavingAccount(int acc, String name, double balance, double min_bal) {
		super(acc, name, balance);
		this.min_bal = min_bal;

	}

	void withdraw(double with_amnt) {
		this.with_amnt = with_amnt;
		if (balance > with_amnt && (balance-with_amnt)>= min_bal) {
			balance = balance - with_amnt;
			System.out.println("Withdraw= " + with_amnt);
			System.out.println("Remaining= " + balance);

		} else
			System.out.println("INVALID INPUT Please try again");

	}

	@Override
	public String toString() {
		return "SavingAccount [acc=" + acc + ", name=" + name + ", balance=" + balance + ", min_bal=" + min_bal + "]";
	}

}
