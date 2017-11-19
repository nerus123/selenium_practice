package datatypeexamples;

public class StringDemo {

	public static String s="java";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="selenium";
		String s2=s+s1;
		System.out.println("s2 is:"+s2);
		String s3=s+2+3;
		System.out.println("s3 is:"+s3);
		String s4=s+(2+3);
		System.out.println("s4 is:"+s4);
		String s5=2+s+3;
		System.out.println("s5 is:"+s5);
		String s6=s+23;
		System.out.println("s6 is:"+s6);
		String s7="2"+3+s;
		System.out.println("s7 is:"+s7);
		String s8="2"+3+5;
		System.out.println("s8 is :"+s8);

	}

}
