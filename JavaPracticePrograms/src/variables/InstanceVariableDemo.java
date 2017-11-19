package variables;

public class InstanceVariableDemo {
	
	//instancevariabledemo or nonstaticvariabledemo
	//instance variable syntax
	//accessmodifier datatype variablename=value;
	private byte b=5;
	public short s=10;
	protected int i=15;
	
	//non static method with parameters
	//parameterised non static mthod
	//accessmodifier void methodname(datatypep1,datatypep2...){logic+statements}
	protected void multiplication(int a,int b){
		long m=a*b*this.b*s*i;
		System.out.println(m);
	}
	
	/*return type method
	//accessmodifier datatype methodname(){logic+statements
	return varaiable*/
	
	private int substraction(){
		int sub=i+s-b;
		return sub;
	}
	
	//static method
	/*static void m3(){
		int res=b*s-i;
		we cannot call non static variables under static method
	}*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling non static method with parameters
		InstanceVariableDemo iv=new InstanceVariableDemo();
		iv.multiplication(2, 3);
		
		//how to call return type nonstatic method under main method
		//datatypeofthemethod variablename=ref.nonstaticreturntypemethod();
		
int i=iv.substraction();
System.out.println("result is:"+i);
	}

}
