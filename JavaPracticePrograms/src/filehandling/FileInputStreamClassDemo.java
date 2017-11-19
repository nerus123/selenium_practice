package filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamClassDemo {
	private static FileInputStream fis=null;
	private static String fath="C:\\Users\\Surender\\Desktop\\neeraja.txt";
	private static BufferedInputStream bis=null;
	public static void main(String[]args) throws IOException{
		//create object for file inputstream class
		try {
			fis=new FileInputStream(fath);
			//create object for bufferedinputstream
			bis=new BufferedInputStream(fis);
			int i=0;
			while((i=fis.read())!=-1){
				char c=(char) i;
				System.out.print(c);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally{
			if(fis!=null){
				fis.close();
				bis.close();
			}
		}
	}

}
