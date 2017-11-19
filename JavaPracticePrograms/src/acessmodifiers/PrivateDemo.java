package acessmodifiers;

public class PrivateDemo {
	
	//sataic variable syntax
	//accessmodifier static dattaype variablename =value;
	private static String s="java";
	
	//non static vriable
	private char c='A';
	
private PrivateDemo(){
	System.out.println("private default constructor");
		
	}
	
	//non static method
	private void joinString(String s1){
		String res=s+c+s1;
		System.out.println("result of the string is:"+res);
	}
	
	//static method
	//swap 2 numbers
	private static void swap(int x,int y){
		System.out.println("before swapping x is:"+x+"y value is:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("afterswapping x is:"+x+"y value is:"+y);
	}
	
	

	public static void main(String[] args) {
		swap(10,20);
		//calling static variable
		System.out.println("calling static variable"+s);
		//create object for the class to call nonstaticvariables and nonstatic methods
		PrivateDemo p=new PrivateDemo();
		p.joinString("ruby");
		System.out.println("non static variable is:"+p.c);

	}

}
