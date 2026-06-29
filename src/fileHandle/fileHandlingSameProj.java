package fileHandle;


import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class fileHandlingSameProj {
	
     public static void read_prop_file() throws Exception {
		
		FileReader fr = new FileReader("./testdata/config.properties");
		
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.get("browsername"));
		System.out.println(prop.get("url"));
		System.out.println(prop.get("username"));
		System.out.println(prop.get("password"));
		
		System.out.println("------------");
		
		File f = new File("./testdata/data.txt");
		FileReader fr1 = new FileReader(f);
		
		int r = fr1.read();
		
		while(r != -1)
		{
		System.out.print((char)r);
		r= fr1.read();
		}
	}

	public static void main(String[] args) throws Exception{
		read_prop_file();

	}

}
