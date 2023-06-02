package dec_15_interface;

public class Custmr extends Dealer {
	
     public void brand() {
    	 super.brand();
    	 System.out.println("Pulsar");
     }

	@Override
	public void model() {
		System.out.println("150cc");
		
	}

	@Override
	public void price() {
		System.out.println("90,000/-");
	}
	
	

	

}
