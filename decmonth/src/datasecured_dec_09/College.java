package datasecured_dec_09;

public class College {
	private int id;
	private String name;
	private double fees;

	public void CollegeStu(int id, String name, double fees) {
		this.id = id;
		this.name = name;
		this.fees = fees;

	}

	void setId(int id) {
		if (id > 101)
			this.id = id;

		else 
			System.out.println("PLEASE ENTER CORRECT ID");
	}

	void setName(String name) {

		this.name = name;

	}

	void setFees(double fees) {
		if (fees > 5000)
			this.fees = fees;
		else
			System.out.println("PLEASE ENTER CORRECT FEES");
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}

}
