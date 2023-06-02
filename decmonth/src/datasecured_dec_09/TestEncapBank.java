package datasecured_dec_09;

public class TestEncapBank {
	public static void main(String[] args) {
		
		EncapBank b1= new EncapBank(23, "Rajpal Yadav",500.00 );
		b1.SetAcc(0);
		System.out.println(b1);
		b1.SetBalance(30000.00);
		System.out.println(b1);
		b1.SetBalance(-10000);
		System.out.println(b1);
		
}

}
