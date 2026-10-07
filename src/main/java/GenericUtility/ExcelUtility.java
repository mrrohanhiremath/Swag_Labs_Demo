package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public Object[][] ValidCredentials() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./src/test/resources/LoginValidInvalidCreditional.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("ValidData");
		Object[][] ob = new Object[sh.getLastRowNum()][2];
		for(int i=0;i<sh.getLastRowNum();i++) {
			for(int j=0;j<2;j++) {
				ob[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return ob;
	}
	
	public Object[][] InValidCredentials() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./src/test/resources/LoginValidInvalidCreditional.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("InvalidData");
		Object[][] ob = new Object[sh.getLastRowNum()][2];
		for(int i=0;i<sh.getLastRowNum();i++) {
			for(int j=0;j<2;j++) {
				ob[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
			}
		}
		return ob;
	}

}
