package com.Milewise.Utilities;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	 XSSFWorkbook wb;

	public ExcelDataProvider() {
		File src = new File("C:\\Users\\Vivek\\eclipse-workspace3\\FrameWorkMilewise\\src\\DataExcel\\TestData.xlsx");

		try {

			FileInputStream fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {

			System.out.println("Sorry file not found pls find erro msg" + e.getMessage());
		}

	}

	public  String getStringData(String SheetName, int row, int col) {
		return wb.getSheet(SheetName).getRow(row).getCell(col).getStringCellValue();
	}

	public  double getNumericData(String SheetName, int row, int col) {
		return wb.getSheet(SheetName).getRow(row).getCell(col).getNumericCellValue();
	}
//method overloading-sheetName,SheetIndex
}
