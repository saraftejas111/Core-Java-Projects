package dec_07;

public class TestEmployee {
     public static void main(String[] args) {
		
       Employee e1= new Employee();
       e1.id=567;
       e1.name= "Osama Bin Laden";
       e1.position= "Structural Engineer";
       e1.salary= 80000.00;
       e1.display();
       
       Employee e2= new Employee(128, "Dawood Ibrahim", "Execution Engineer", 65000.00);
       e2.display();
       
       Employee e3= new Employee(345, "Chhota Rajan", "Plannig Engineer", 52000.00);
       e3.display();
       
	}
}
