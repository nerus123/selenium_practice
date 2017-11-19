package oops;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//interface refvar=new implementingclass();
		//ShapeInterface s=new Square(); 
		ShapeInterface s=new Rectangle();
		
            System.out.println(s.area());
            s.print();
            s.draw();
            s.perimeter();
            float f1=s.perimeter();
            System.out.println(f1);
	}

}
