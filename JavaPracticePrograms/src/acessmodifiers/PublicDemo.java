package acessmodifiers;

public class PublicDemo {
public static int x=10,y=5;
public int z=20;

public PublicDemo(){
	System.out.println("default constructor");
	
}

public static void sum(){
	int sum=x+y;
	System.out.println(sum);
}

public void result(){
	int r=x+y+z;
	System.out.println(r);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();
		System.out.println("x value is:"+x+"y value is:"+y);
		PublicDemo p=new PublicDemo ();
		System.out.println(p.z);
		p.result();
		
	}

}
