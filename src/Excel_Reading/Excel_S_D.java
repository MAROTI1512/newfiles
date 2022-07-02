package Excel_Reading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_S_D {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
              File Myfile =new File("D:\\b.xlsx");
		

		
          Workbook book = WorkbookFactory.create(Myfile);//workbookfactory final class calling with create static method
    
           Sheet sheet = book.getSheet("Sheet2");        // calling get sheeet method and passs sheetname ---sheet1 as an argu
           
    
           Row row = sheet.getRow(0);               //calling getrow method with row index  num as reference
           
           Cell cell = row.getCell(1);             ///calling getcell method with column/cell index num reference
           
           CellType type = cell.getCellType();     // to find RT of data in the sheet used getcelltype method 
           
           System.out.println(type);                    // string 
    
           String value = cell.getStringCellValue();    // calling getcellvalue method 
           
           System.out.println(value);
	}

}
