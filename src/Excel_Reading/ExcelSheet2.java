package Excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		 File Myfile =new File("D:\\b.xlsx");
		Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet3");
		 
		int totalRowcount = mysheet.getLastRowNum();
		int totalcellcount = mysheet.getRow(totalRowcount).getLastCellNum()-1;
		
		for(int i=0;i<=totalRowcount;i++) 
		{
			for(int j=0;j<=totalcellcount;j++)
		{
		
		
		
		Cell cell = mysheet.getRow(i).getCell(j);
		CellType type = cell.getCellType();
		
		if(type==CellType.STRING) 
		{
			System.out.print(cell.getStringCellValue()+" ");
		}
		else if (type==CellType.BOOLEAN) 
		{
			System.out.print(cell.getBooleanCellValue()+" ");
		}
		
		else if (type==CellType.NUMERIC) 
		{
			System.out.print(cell.getNumericCellValue()+" ");
		}
	}
			System.out.println();
		}
		
		}
}
