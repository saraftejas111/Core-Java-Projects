package dec_19_finalstatic;

public class StaticMethods {
	private String name ;
	private static String staticStr = "STATIC STRING";
	
	public StaticMethods(String n) {
		this.name=n;
	}
	
	public static void testStaticMethod() {
		System.out.println("Hey.. I am in Static Method...");
		System.out.println(StaticMethods.staticStr);
		
	}
	public void testObjectMethod() {
		System.out.println("Hey I am in Non-Static Method..");
		System.out.println(StaticMethods.staticStr);
		System.out.println("Name - "+this.name);
	}
	public static void main(String[] args) {
		StaticMethods.testStaticMethod();
		StaticMethods msm = new StaticMethods("jbk-best-one");
		msm.testObjectMethod();
	}

}
