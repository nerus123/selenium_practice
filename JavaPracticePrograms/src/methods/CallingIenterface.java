package methods;

import oops.Circle;
import oops.ShapeInterface;

public class CallingIenterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//interfacename refvar=new implementing class();
		ShapeInterface s=new Circle();
		System.out.println(s.area());
		s.print();
		s.draw();
		System.out.println(s.perimeter());
	}

}
