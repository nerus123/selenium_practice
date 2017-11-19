package oops;

public class Dog extends Animal {
public String colour="black";
public Dog(){
	super();
	System.out.println("dog constructor is created...");
}

public void eat(){
	System.out.println("executing Dog class eat()....");
	System.out.println("dog is eating bread.....");
}
public void printDetails(){
	System.out.println("executing the print details()...");
System.out.println("Dog class colour is:"+this.colour);
System.out.println("Animal class colour is:"+super.colour);
this.eat();
super.eat();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		d.printDetails();

	}

}
