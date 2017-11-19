package oops;

public class Rectangle implements ShapeInterface  {
	private float l=2.5F,w=6.5F;

	@Override
	public float area() {
		float area=(l*w);
		return area;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print the rectangle");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw the rectangle with length and breadth");
		
	}

	@Override
	public float perimeter() {
		// TODO Auto-generated method stub
		float per=2*(l+w);
		return per;
	}

}
