package dec_12_inheritance;

public class Account {
	public static void main(String[] args) {
		
	SavingAcc s1= new SavingAcc(2121212, "Elon Musk", 5000, 2000.00);
	System.out.println(s1);
	
	CurrentAcc c1= new CurrentAcc(343434, "Jeff Bezos", 80000, 5000.00);
     System.out.println(c1);
	}

}
