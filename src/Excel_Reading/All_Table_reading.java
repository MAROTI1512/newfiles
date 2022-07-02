package Excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class All_Table_reading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		// all table read in the excel sheet

		File Myfile =new File("D:\\b.xlsx");
		
		for(int i=0; i<=6;i++) 
		{
			
			for(int l=0; l<=3; l++) 
			{
				String value = WorkbookFactory.create(Myfile).getSheet("Sheet2").getRow(i).getCell(l).getStringCellValue();
				
				System.out.print(value + " || ");
				
			}
			       System.out.println();
		}
			
			
		
		
	}

}
