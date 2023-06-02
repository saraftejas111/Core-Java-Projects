package inheritance;

public class TestPerson {
	public static void main(String[] args) {
		
		Super sup = new Person();
		System.out.println("hiii i am in super >> "+sup.age);
		System.out.println("hiii i am in person >> "+sup.age);
	}

}
