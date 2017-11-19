package oops;

public class Circle implements ShapeInterface  {
private float r=4.5F;
	@Override
	public float area() {
		float area=(float) (3.143*r*r);
		return area;
	}

	@Override
	public void print() {
		System.out.println("print the circle");
	}

	@Override
	public void draw() {
		System.out.println("draw the circle");
		
	}

	@Override
	public float perimeter() {
		float perimeter =(float) (2*3.143*r);
		return perimeter;
	}

}
