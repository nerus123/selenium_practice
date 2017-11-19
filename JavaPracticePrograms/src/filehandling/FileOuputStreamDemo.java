package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOuputStreamDemo {

	private static FileInputStream fis=null;
	private static FileOutputStream fos=null;
	private static File f=null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//create object for File class
		f=new File("C:\\Users\\Surender\\Desktop\\neeraja.txt");
		
		//create object for FileInputStream class
		try {
			fis=new FileInputStream(f);
			//create object for FileOutput Stream class
			fos=new FileOutputStream("C:\\Users\\Surender\\Desktop\\output.txt");
			int i=0;
			while((i=fis.read())!=-1){
				fos.write(i);
				fos.flush();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			fis.close();
			fos.close();
		}

	}

}
