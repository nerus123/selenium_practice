package exception;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declare single dimensional array
		//datatype[] arryname=new datatype[size];
	
		try {
			int[] arr=new int[5];
			arr[0]=10;
			arr[1]=20;
			arr[2]=60;
			arr[3]=40;
			arr[4]=100;
			//arr[5]=120;
			System.out.println("length of array:"+arr.length);
			//iterate the collection by using for each loop
			for(int a :arr){
				System.out.println(a);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("fianlly block always executed even exception occurs");
		}

	}

}
