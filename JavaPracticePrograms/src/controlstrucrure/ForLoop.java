package controlstrucrure;

public class ForLoop {
	
	//print 1 to 10 numbers using for loop
	public static void print1To10UsingForLoop(){
		for(int i=1;i<=10;i++){
			System.out.print(i+" ");
		}
		System.out.println(" ");
		System.out.println("******************************");
	}
	
	//print 1 to 10 nubers using while loop
	public static void print1To10UsingWhileLoop(){
		int i=1;
		while(i<=10){
			System.out.print(i+" ");
			
			
			i++;
		}
		System.out.println(" ");
		System.out.println("******************************");
	}
	
	//program for n numbers
	public static int sum(){
		int s=0;
		for(int i=1;i<=3;i++){
			s=s+i;
		}
		return s;
	}
public static int factorial(){
	int f=1;
	for(int i=1;i<=3;i++){
		f=f*i;
	}
	return f;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print1To10UsingForLoop();
		print1To10UsingWhileLoop();
		int s1=sum();
		System.out.println("sum of numbers:"+s1);
int f=factorial();
System.out.println(f);
	}
	
	
	}


