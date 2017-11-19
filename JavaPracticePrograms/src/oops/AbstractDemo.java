package oops;

public abstract class AbstractDemo {
	//static variables
	public static int x=10;
	
	//non static variables
	public int y=25;
	
	//constructor
	public AbstractDemo(){
		System.out.println("abstarctdemoclass..default constructor is created");
	}

	public abstract void run();
	public abstract void msg();
	
	public void swap(){
		System.out.println("executing the swap().....");
		System.out.println("before swapping x value is:"+x+"y value is:"+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("after swapping x value is:"+x+"yvalue is:"+y);
	}
	static void sum(){
		float f=5.5F;
		double sum=(x*f)+f;
		System.out.println("sum of x,f is:"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		
	}

}
