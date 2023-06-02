package dec_13_polymorphism;

public class TestAccounts {
	 public static void main(String[] args) {
		
		 SavingAccount a1= new SavingAccount(232323, "tejas saraf", 5000, 2000);
		 System.out.println(a1);
		 a1.withdraw(1500);
		 System.out.println(a1);
		 }

}
