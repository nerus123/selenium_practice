package oops;

public class Deveolper extends  Employee{
	
	int bonus=1000;
	public void PrepareCodeDoc(){
		System.out.println("prepare the code functional documnetation");
	}
	
	private static void  compileCode(){
		System.out.println("create a jar by compilation");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deveolper d=new Deveolper();
		System.out.println("bonus for the developer is:"+d.bonus);
		System.out.println("******************************************");
		compileCode();
		System.out.println("******************************************");
		d.setEmpId(370);
		d.setEmpName("kumar");
		d.setEmpSalry(3000);
		System.out.println("id is:"+d.getEmpId());
		System.out.println("******************************************");
		System.out.println("name is:"+d.getEmpName());
		System.out.println("******************************************");
		System.out.println("salary is:"+d.getEmpSalry());
		System.out.println("******************************************");
		d.sendNotification();

	}

}
