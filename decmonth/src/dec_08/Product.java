package dec_08;

public class Product {
	int pid;
	String pname;
	float qty;
	double cost;
	double final_cost;
	
	
	Product(){
		
	}
    Product (int pid, String pname, float qty, double cost){
    
    this.pid=pid;
    this.pname=pname;
    this.qty=qty;
    this.cost=cost;
    
    
    }
    
    void Calculate (){
    	System.out.println("final_cost = "+qty*cost+"\n");
    }
    
    void display() {
    	System.out.println(pid);
    	System.out.println(pname);
    	
    }
    
}
