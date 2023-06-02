package dec_07;

public class Bank {
	int acc;
	String name;
	String add;
	float amount;
	
	Bank (){
		
	}
	
	Bank (int ac, String nm, String add, float amt){
		acc=ac;
		name=nm;
		this.add=add;
		amount=amt;
	}
    
	void display() {
		System.out.println(acc);
		System.out.println(name);
		System.out.println(add);
		System.out.println(amount+"\n");
	}
}
