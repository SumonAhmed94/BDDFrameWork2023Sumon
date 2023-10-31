package com.facebook.Utilities;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public String filepath;
	public String sheetname;
	public ExcelReader(String filepath, String sheetname) {
		super();
		this.filepath = filepath;
		this.sheetname = sheetname;
		 
	}
	
public String getStringCellValue(int rowNum, int columnNum) {
	String celldata=null;
	try {
		FileInputStream fis=new FileInputStream(filepath);
		Workbook registrationbook=new XSSFWorkbook(fis);
		Sheet sheet=registrationbook.getSheet(sheetname);
		Row row=sheet.getRow(rowNum);
		Cell column= row.getCell(columnNum);
		celldata=column.getStringCellValue();
		System.out.println(celldata);
		registrationbook.close();
		fis.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	return celldata;
	
}
public double getNumericCellValue(int rowNum, int columnNum) {
	double celldata=0.0; 
	try {
		FileInputStream fis=new FileInputStream(filepath);
		Workbook registrationbook=new XSSFWorkbook(fis);
		Sheet sheet=registrationbook.getSheet(sheetname);
		Row row=sheet.getRow(rowNum);
		Cell column=row.getCell(columnNum);
		celldata=column.getNumericCellValue();
		System.out.println(celldata);
		registrationbook.close();
		fis.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	return celldata;
}
	public static void main(String[] args) {
	String file="src/test/resources/registration.xlsx";
		ExcelReader er=new ExcelReader(file, "Sheet1");
		er.getStringCellValue(0, 1);
		er.getStringCellValue(0, 2);
		er.getStringCellValue(0, 3);
		er.getStringCellValue(1, 1);
		er.getStringCellValue(1, 2);
		ExcelReader er1=new ExcelReader(file, "Sheet3");
		er1.getNumericCellValue(1, 0);
		er1.getNumericCellValue(0, 2);	

}
}
