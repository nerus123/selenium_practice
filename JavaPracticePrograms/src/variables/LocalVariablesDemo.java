package variables;

public class LocalVariablesDemo {

	//static method
	//accessmodifier static void methodname(){logic+statements}
	public static void m1(){
		//local variables
		//datatype varaiblename=value;
		boolean b=true;
		char c='a';
		String s="java";
		System.out.println("boolean value:"+b);
		String s1=s+c;
		System.out.println("s1(s+c) value is:"+s1);
	}
	//non static method
	private void m2(){
		int x=5,y=10;
		float f=2.5F;
		float sum=x+y+f;
		System.out.println("sum of x,y f is:"+sum);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//how to static method under main method
		//just methodname
		m1();
		
		//how to call nonstatic methods under main methods
		LocalVariablesDemo lvd=new LocalVariablesDemo();
		lvd.m2();
		
		
		

	}

}
