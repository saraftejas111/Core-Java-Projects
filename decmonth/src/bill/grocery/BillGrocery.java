package bill.grocery;

public class BillGrocery {
	public static void main(String[] args) {
		
		Grocery g1= new Grocery();
		g1.id=23; 
		g1.name= "sugar";
		g1.price=120;
		Grocery g2= new Grocery();
		g2.id=23;
		g2.name="Oil";
		g2.price=230;
		Grocery g3= new Grocery();
		g3.id=24; 
		g3.name="Tea";
		g3.price=160;
		
		
	
       Bill bill=new Bill();
       
       Order t= bill.calBill(g1, g2, g3);
       System.out.println("<<**GROCERY MART**>>\n\n");
       System.out.println("Bill no= "+t.billno+"\n");
       System.out.println("Items= \n"+t.items+"\n");
       System.out.println("Total Bill= "+t.total+"\n");
       System.out.println("Discount= "+t.discount+"\n");
       System.out.println("Final Bill= "+t.final_bill+"\n\n<<Please Visit Again>>\n<<<Thank You>>>");
       
   
       	
  }
}