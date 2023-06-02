package dec_07;

public class Grocery {
	int id;
	String name;
    String items;
	float bill;

  Grocery (){
	  
  }
  Grocery (int i, String nm, String it, float bill){
	 id=i;
	 name=nm;
	 items=it;
	 this.bill=bill;
  }
   void display() {
	   System.out.println(id);
	   System.out.println(name);
	   System.out.println(items);
	   System.out.println(bill+"\n");
   }
}
