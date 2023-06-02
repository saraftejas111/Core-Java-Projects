package dec_06.assignments;

public class Problem2{
	public static void main(String[] args) {
		
		String model= "Activa";
		int cost= 56000;
		int selling= 70000;
		
		
		System.out.println(model);
		System.out.println(cost+" = cost price");
		System.out.println(selling+" = selling price");
		
		
		if(selling>cost) {
			System.out.println(selling-cost+" is the profit of the dealer");
		}
		else if(cost>selling) {
			System.out.println(cost-selling+" is the loss of the dealer");
			
		}

	
	}
		
	
}


