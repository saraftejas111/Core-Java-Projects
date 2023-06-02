package dec_12_inheritance;

public class Doctor extends Person{
      String speciality;
      double fees;
	public Doctor() {
			
	}
	public Doctor(int id, String name, String add, String speciality, double fees) {
		super(id, name, add);
		this.speciality=speciality;
		this.fees=fees;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", add=" + add + ", speciality=" + speciality + ", fees=" + fees
				+ "]";
	}
	
	
	
      
      
}
