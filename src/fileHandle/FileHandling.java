package fileHandle;

import java.io.File;
import java.io.FileReader;

public class FileHandling {
	
	
	public static void read_text_data() throws Exception {
		
		File f = new File("/Users/abhilasharana/Desktop/powerbi_assignment_summary.txt");
		FileReader fr = new FileReader(f);
		
		int r = fr.read();
		
		while(r != -1)
		{
		System.out.print((char)r);
		r= fr.read();
		}
	}

     public static void main(String[] args) throws Exception {

	read_text_data();
     }
	
}
