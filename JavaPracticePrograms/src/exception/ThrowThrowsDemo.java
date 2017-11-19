package exception;

public class ThrowThrowsDemo {
public static void validate(int age) throws InterruptedException{
	if(age<18){
		throw new ArithmeticException("not eligible to vote");
	
	}else{
		System.out.println("eligible to vote");
		Thread.sleep(3000);
	}
}

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		validate(12);
	}

}
