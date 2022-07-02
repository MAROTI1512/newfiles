package Excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetUse {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	File Myfile =new File("D:\\b.xlsx");
		
		String name = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		        System.out.println(name);
		
		String name1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
				System.out.println(name1);
		
		double name2 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(2).getCell(0).getNumericCellValue();
				System.out.println(name2);
		
		double number3 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
		         System.out.println(number3);
		
	boolean name4 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(3).getCell(0).getBooleanCellValue();
				System.out.println(name4);
		
    boolean name5 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(3).getCell(1).getBooleanCellValue();
		System.out.println(name5);
		System.out.println(WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(4).getCell(0).getStringCellValue());
		
		
		
	}

}
