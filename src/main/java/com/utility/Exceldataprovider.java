package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {
	XSSFWorkbook wb;
	public Exceldataprovider() throws Exception {
		String path="C:\\Users\\user\\eclipse-workspace\\framework\\testdata\\excel.xlsx";
		FileInputStream file=new FileInputStream(path);
		wb=new XSSFWorkbook(file);
		
	}
	public String getstringdata(String Sheetname,int row,int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	
	}
}
