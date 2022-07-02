package Action2;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TableReadingCell {
   // if you a particular cell/column in the excel sheet 
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		File Myfile =new File("D:\\b.xlsx");
		
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
		
		for( int i=0; i<=6; i++)
		{
			System.out.print(Mysheet.getRow(i).getCell(0).getStringCellValue()+ " ");
		}
		System.out.println();
		
		int totalRow = Mysheet.getLastRowNum();
		
		System.out.println(totalRow);
		
		short totalcell = Mysheet.getRow(0).getLastCellNum();
		
		System.out.println(totalcell);
		int totalcolumn = totalcell-1;
		System.out.println(totalcolumn);
		for(int i=0;i<=totalRow;i++)
		{
			Mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
