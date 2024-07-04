package DDT;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample2  
{
	public static String disp(String sheet,int row,int cell)
	{
	String value=null;
	String path="C:\\Users\\pc\\Desktop\\DDt1.xlsx";
	try
	{
	FileInputStream	fis=new FileInputStream(path);
	Workbook book=WorkbookFactory.create(fis);
	value=book.getSheet(sheet).getRow(row).getCell(cell).toString();								
	}
	catch (Exception e) {
		System.out.println("file not found");
	}
	return value;
	}
} 
