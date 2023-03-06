package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	// private static WebDriver driver;
	static WebDriver driver;
	
	public static void getScreenShot(String TestId) throws IOException
	{
		driver= new ChromeDriver();
		Random number = new Random();
		int num = number.nextInt();
		SimpleDateFormat dtf =  new SimpleDateFormat("DD/MM/YYYY HH:MM:SS");
		Date d = new Date();
		String date = dtf.format(d).replace("/", "-").replace(":", "");
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\Image\\" + TestId+ "" +date+ ""+num+ ".jpeg");
	      FileHandler.copy(src, dest);
	
		
	}
	
	public static String getExcelData(String sheet,int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		String path = "E:\\whatsapp\\Manual\\Bhagya.xlsx";
		InputStream file = new FileInputStream(path);
		
		String data;
		Workbook book;
		
		try
		{
			data = WorkbookFactory.create(file).getSheet("Sheet2").getRow(rowNo).getCell(cellNo).getStringCellValue();
						
		}
		catch(Exception i)
		{
			double data1 = WorkbookFactory.create(file).getSheet("Sheet2").getRow(rowNo).getCell(cellNo).getNumericCellValue();
			data = String.valueOf(data1);
		
			
		}
		return data;
		
	}



	

}
