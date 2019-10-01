package com.util;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * 
 * @author ExcelSheet
 * Class for retriving the data from the Excel Sheet
 *
 */
public class ExcelSheet 
{
	//Method for reading the data from the Excel Sheet with arguments as an sheetName,rowNumber,columnNumber and fileName	
	public static String readDataFromExcel(String sheetName,int rowNumber,int columnNumber,String fileName)
	{
		try 
		{
			//creating the new file
			File file = new File(fileName);
			//creating the file input stream
			FileInputStream fis = new FileInputStream(file);
			//creating the workbook factory
			Workbook wb = WorkbookFactory.create(fis);
			//retriving the data from the excel and stored in to a string variable
			String data = wb.getSheet(sheetName).getRow(rowNumber).getCell(columnNumber).getStringCellValue();
			return data;
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return null;
	}
	
}
