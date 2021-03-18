package com.SwadeshMart.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;
	public ExcelDataProvider() {
		File src=new File("./TestData/Data.xlsx");
		try {
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
		} catch (Exception e) {
		System.out.println("Unable to read Excel File"+e.getMessage());
		}
		
	}
	public String getStringData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	public Double getNumericData(String sheetName,int row,int column) {
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
	public String getStringData(int sheetindex,int row,int column) {
		return wb.getSheetAt(sheetindex).getRow(row).getCell(column).getStringCellValue();
	}
	public Double getNumericData(int sheetindex,int row,int column) {
		return wb.getSheetAt(sheetindex).getRow(row).getCell(column).getNumericCellValue();
	}
}
