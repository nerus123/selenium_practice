package variables;

public class StaticVariableDemo {
	//declare static variables
	//accessmodifier static dattaype variablename=value;
	public static String fname="java";
	private static String name;
	protected static int a=10;
	/*returntype static method
	//accessmodifier static datatype methodname(datatype p1,datatypep2,){logic+staements
	return variable;*/
	
 public static String getName(String lname){
	 name=lname+fname;
	 return name;
	 
 }
 //non static returntype method
 private boolean isTrue(int b){
	boolean b2=a>b;
	return b2;
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling returntype static method under main method
		//datatypeofthemethod variablename=staticmethodname();
		String s=getName("goli");
		System.out.println(s);
		
		//how to call nonstaticreturntype method
		//create object for non static methods
		StaticVariableDemo sd=new StaticVariableDemo();
		boolean bi=sd.isTrue(20);
		System.out.println(bi);
		
		

	}

}
