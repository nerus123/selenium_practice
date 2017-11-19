package datatypeexamples;

import org.apache.xpath.operations.String;

class Booleandemo {
	//static varaiables
	//accessmodifier static datatype variablename=value;
	private static boolean b=true;
	public static int x=10;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //declaring local variable
		//datatype variablename=value;
		int y=25;
		System.out.println("static varaible b value is:"+b);
		boolean b1=x>y;
		System.out.println("local variable b1 value is:"+b1);
		boolean b2=x<y;
		System.out.println("local variable b2 is:"+b2);
		int res=x+y;
		System.out.println("result of x and y is:"+res);
	}

}
