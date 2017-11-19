package oops;

public class TestAbstract extends AbstractDemo {

	public static void main(String[] args) {
		sum();
		TestAbstract a=new TestAbstract();
		a.swap();
		a.run();
		a.msg();
		

	}

	@Override
	public void run() {
		System.out.println("executing run()..........."); 
		System.out.println("running is good for health"); 
		
		
		
	}

	@Override
	public void msg() {
		System.out.println("executing the msg()...........");
		System.out.println("send wishes to friend");
		
		
	}

}
