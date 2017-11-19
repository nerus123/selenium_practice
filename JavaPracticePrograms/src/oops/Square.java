package oops;

public class Square implements ShapeInterface{
public float a=5.5F;
	@Override
	public float area() {
		
		float area=a*a;
		return area;
	}

	@Override
	public void print() {
		System.out.println("print the square");
		
		
	}

	@Override
	public void draw() {
		
	System.out.println("draw the square");	
	}

	@Override
	public float perimeter() {
		float per=4*a;
		return per;
	}

	

}
