package excelfetching;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class apache {
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Sadhna_selenium\\apache\\Book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data=wb.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		String data1=wb.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
		System.out.println(data1);
		
	}

}
