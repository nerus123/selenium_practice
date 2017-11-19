package arraydemo;

public class ArraysPractice {
	
	public static void array(){
		//single dimensional aarray
				//datatype arrayname=new datatype[size];
				String[] str=new String[3];
				//insert valuesinto array
				str[0]="neelima";
				str[1]="neeraja";
				str[2]="surender";
				
				//print the array
				for(int i=0;i<=str.length-1;i++){
					System.out.println(str[i]);
				}
				System.out.println("*********************************");
				//iterate the array by using foreach loop
				for(String s:str){
					System.out.println(s);
				}
				System.out.println("************************************");
System.out.println(str.length);
System.out.println("***************************************************");
System.out.println(str[1]);
		
	}
	public static void twoDimensionalArray(){
		

	//two dimensional array
	//datatype[][] arrayname=new datatype[rows][columns];
	String[][] names=new String[3][2];
	//fetch no of rows
	int r=names.length;
	System.out.println("number of rows:"+r);
	int c=names[0].length;
	System.out.println("number of columns:"+c);
	
	//insert values into 2dimensional array
	names[0][0]="swathi";
	names[0][1]="swetha";
	names[1][0]="sunitha";
	names[1][1]="sujatha";
	names[2][0]="surender";
	names[2][1]="srinivas";
	
	System.out.println(names[2][1]);
	
	//print the two dimensional array
	for(int i=0;i<r;i++){
		for(int j=0;j<c;j++){
			System.out.print(names[i][j]+"\t");
		}
		System.out.println(" ");
	}
	System.out.println("****************************");
	}
	public static void duplicateElement(){
		//declare single dimensional array
		String[] str=new String[6];
		str[0]="neeraja";
		str[1]="neelima";
		str[2]="surender";
		str[3]="neeraja";
		str[4]="neelima";
		str[5]="anusha";
		for(int i=0;i<=str.length-1;i++){
			for(int j=i+1;j<=str.length-1;j++){
				if(str[i].equals(str[j])){
					System.out.println(str[j]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array();
		twoDimensionalArray();
		duplicateElement();
		
		
	}

}
