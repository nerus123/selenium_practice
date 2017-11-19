package exception;

public class NullPointerEceptionDemo {
private static String s=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		String s1="selenium";
		String s3="222";
		try{
		String s2=s.concat(s1);
		System.out.println(s2);
		System.out.println(s.length());
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("do somering operations");
		System.out.println(s1.length());
		//convert string into integer
		int i=Integer.parseInt(s3);
		System.out.println(i);

		
	}

}
