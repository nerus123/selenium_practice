package exception;
public class ArthmeticExceptionDemo {
	private static int x=10;
	static int y;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		int res=x/y;
		System.out.println("output of x/y is:"+res);
		}catch(Exception e){
		e.printStackTrace();
		}
		
		System.out.println("after expression first line");
		System.out.println("after expression first line");
		System.out.println("after expression first line");
		System.out.println("after expression first line");

	}

}
