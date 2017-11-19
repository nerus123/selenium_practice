package arraydemo;

public class Arrays {
	public void arraDemo(){
		System.out.println("executing the single dimensional array...");
	//single dimensional array
	//datatype[] arrayname=new datatype[size];
	char[] vow=new char[5];
	//insert the value sinto array
	vow[0]='a';
	vow[1]='e';
	vow[2]='i';
	vow[3]='o';
	vow[4]='u';
	
	//to get particular index value
	System.out.println("get the particular element:"+vow[2]);
	//to get the last index
	int li=vow.length-1;
	System.out.println(li);
	
	//print the values in array
	for(char v:vow){
		
		System.out.print(v+"\t");
	}
	
	System.out.println("");
	System.out.println("end of for each loop");
	
	//iterate by using for loop
	for(int i=0;i<=vow.length-1;i++){
		System.out.print(vow[i]+"\t");
	}
	System.out.println("");
	System.out.println("end of for loop");
	System.out.println("print array in reverse order");
	for(int j=vow.length-1;j>=0;j--){
		System.out.print(vow[j]+"\t");
	}
	System.out.println("");
	}
	
	//two dimensional arry
	private void printTwoDimensionalArray(){
		System.out.println("executing two dimensional array");
		//datatype[][] arrayname=new datatype[rows][cloumns]
		String[][] lang= new String[3][2];
		//no of rows
		int r=lang.length;
		//no of clumns
		int c=lang[0].length;
		//insert the elements
		lang[0][0]="java";
		lang[0][1]="ruby";
		
		//2nd row
		lang[1][0]="phyton";
		lang[1][1]="perl";
		//3rd row
		lang[2][0]="c++";
		lang[2][1]="php";
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(lang[i][j]+"\t");
				
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays a=new Arrays ();
		a.arraDemo();
		a.printTwoDimensionalArray();
		

	}

}
