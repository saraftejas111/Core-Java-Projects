package dec_26_string_practice;

public class StringClass {
	public static void main(String[] args) {
       System.out.println("<<String Methods>>");
		String s1 = "java";
		String s2 = "bykiran";
		{
			System.out.println("s1.concat >> " + s1.concat(s2));

		}
      System.out.println("======================");
      System.out.println("<<StringBuffer methods>>");
		StringBuffer sb = new StringBuffer("javakiran");

		sb.insert(4, "by");
		System.out.println("sb.insert >> " + sb);
		
		sb.append(" karve nagar");
		System.out.println("sb.append >> "+sb);
		
		sb.append(" branch");
		System.out.println("sb.append 2 >> "+sb);
		
		sb.append(" call 9898989898");
		System.out.println("sb.append 3 >>"+sb);
		
		sb.insert(30, " java, python, selenium");
		System.out.println("sb.insert 4 >> "+sb);
		
		
		
		
	}

}
