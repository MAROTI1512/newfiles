package Excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File Myfile =new File("D:\\b.xlsx");
		
		Sheet sheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		int listrowNo = sheet.getLastRowNum();  //get total number of count
	    int totalRowNUM = listrowNo;
		System.out.println(totalRowNUM);
		
	    short LastcellNum = sheet.getRow(0).getLastCellNum();  //get total number of cell count
		int totalCellNum = LastcellNum-1;
	    System.out.println(totalCellNum);
		        
		for(int i=0; i<=totalRowNUM;i++)
		{
			 for(int k=0; k<=totalCellNum;k++) 
			 {
			String values = sheet.getRow(i).getCell(k).getStringCellValue();
			System.out.print(values+ " || ");
			 }
			 System.out.println( );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
