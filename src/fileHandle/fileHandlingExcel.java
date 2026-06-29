package fileHandle;

import java.io.FileInputStream;
import java.text.SimpleDateFormat;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;


public class fileHandlingExcel {
	
	public static void read_excel_data() throws Exception {
		
		
		FileInputStream fis = new FileInputStream("./testdata/Testdata.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheet("data"); //go to the sheet name
		
   
		XSSFRow row1 = sh1.getRow(0); //get first row information from the sheet named data
		XSSFCell col1 =row1.getCell(0); // get first col info from the sheet name data
		System.out.println(col1.getStringCellValue());
		System.out.println("-----------------");
		
		XSSFCell col2 =row1.getCell(1); // get second col info from the sheet name data
		System.out.println(col2.getNumericCellValue());
		System.out.println("-----------------");
		
		XSSFRow row2 = sh1.getRow(1); //get second row information from the sheet named data
		XSSFCell col3 =row2.getCell(0); // get first col info from the sheet name data
		System.out.println(col3.getStringCellValue());
		System.out.println("-----------------");
		
		XSSFCell col4 =row2.getCell(1); // get first col info from the sheet name data
		System.out.println(col4.getNumericCellValue());
		System.out.println("-----------------");
		
   XSSFSheet sh2 = wb.getSheet("login"); //go to the sheet name sheet2
		
		XSSFRow row8 = sh2.getRow(7); //get 9th row information from sheet2
		XSSFCell col1row8 =row8.getCell(0); // get colC info from sheet2
		System.out.println(col1row8.getStringCellValue());
		
		XSSFCell col2row8 =row8.getCell(1); // get colD row 9 from sheet2
		System.out.println(col2row8.getStringCellValue());
		System.out.println("-----------------");
	
	}
	
	public static void read_data() throws Exception{
		//for loop
		//for(int i=1;i<11; i++)
		//System.out.println(i);
		
          FileInputStream fis = new FileInputStream("./testdata/Testdata.xlsx");
          XSSFWorkbook wb = new XSSFWorkbook(fis);
          XSSFSheet sh1 = wb.getSheet("register"); //go to the sheet name

          int nr = sh1.getPhysicalNumberOfRows(); //4

          for(int i=1;i<nr; i++) //i=0, 0<4
        {
	       XSSFRow row = sh1.getRow(i); //i=0
	       int nc = row.getPhysicalNumberOfCells(); //i=0, nc=2, i=1, nc=3
	
	            for(int j=0; j<nc; j++)//0<2,1<2, 
	    {
		    XSSFCell col = row.getCell(j);  //i=0, j=0, j=1, j=2
		
		        if(col.getCellType() == CellType.STRING)
		        {
			      System.out.println(col.getStringCellValue());
		         }
		
		        else if(col.getCellType() == CellType.BOOLEAN)
		        {
			      System.out.println(col.getBooleanCellValue());
		         }
		        else if(col.getCellType() == CellType.NUMERIC)
		        {
			        if(DateUtil.isCellDateFormatted(col))
			       {
				   SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
				   System.out.println(sdf.format(col.getDateCellValue()));
			       }
			        else
			        {
			       System.out.println(col.getNumericCellValue());
		                }
		
	          System.out.println("---------------------");
		        }
	    }
		    }	
	}
	
	public static void main(String[] args) throws Exception {
		//read_excel_data();
		read_data();
		
	}


}

