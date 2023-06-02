package dec_12_inheritance;

public class CurrentAcc extends Bank {
	  double min_bal;
	     

		public CurrentAcc() {
		}
		
		public CurrentAcc(int acc, String name, double balance, double min_bal) {
			super(acc, name, balance);
			this.min_bal=min_bal;
			
		}

		@Override
		public String toString() {
			return "CurrentAcc [acc=" + acc + ", name=" + name + ", balance=" + balance + ", min_bal=" + min_bal +"]";
		}

}
