package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
private static FileReader fr=null;
private static BufferedReader br=null;
private static String fpath="C:\\Users\\Surender\\Desktop\\neeraja.txt";
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//create an object for FileReader class
		try {
			fr=new FileReader(fpath);
			//create object for BufferReader
			br=new BufferedReader(fr);
			int c;
			while((c=fr.read())!=-1){
				System.out.print((char)c);
			}
			System.out.println(" ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			fr.close();
			br.close();
		}
		

	}

}
