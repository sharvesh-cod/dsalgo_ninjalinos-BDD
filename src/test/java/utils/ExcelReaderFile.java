package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderFile {

	public FileInputStream fis;
	public FileOutputStream fos;
	public XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	String xlfilePath;

	public ExcelReaderFile(String xfilePath) {
		this.xlfilePath = xfilePath;

	}

	public int rowCount(String sheetName) throws IOException {

		fis = new FileInputStream(xlfilePath);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetName);
		int rowCount = sheet.getLastRowNum();
		wb.close();
		fis.close();
		return rowCount;
	}

	public int colCount(String sheetName, int rowNum) throws IOException {
		fis = new FileInputStream(xlfilePath);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		int cellCount = row.getLastCellNum();
		wb.close();
		fis.close();
		return cellCount;
	}

//to get the Cell Data
	public String getData(String sheetName, int rowNum, int cellCount) throws IOException {

		fis = new FileInputStream(xlfilePath);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		cell = row.getCell(cellCount);
		String cellData;
		try {
			DataFormatter df = new DataFormatter();
			cellData = df.formatCellValue(cell);
		} catch (Exception e) {
			cellData = "";
		}
		return cellData;

	}

	public void setCellData(String sheetName, int rowNum, int colnumNum, String cellData) throws IOException {
		fis = new FileInputStream(xlfilePath);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(rowNum);
		cell = row.createCell(colnumNum);
		cell.setCellValue(cellData);

		fos = new FileOutputStream(xlfilePath);
		wb.write(fos);
		wb.close();
		fos.close();
		fis.close();

	}

}

//***************** SUGGESTED BY CHATGPT FOR EXCEL READING**********************

//package utils;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class ExcelReader {
//
//	private XSSFWorkbook workbook;
//	private Sheet sheet;
//
//	public ExcelReader(String filePath, String sheetName) throws IOException {
//		try (FileInputStream fis = new FileInputStream(filePath)) {
//			workbook = new XSSFWorkbook(fis);
//			sheet = workbook.getSheet(sheetName);
//		}
//	}
//
//	public int rowCount() {
//		return sheet.getLastRowNum();
//	}
//
//	public int colCount(int rowNum) {
//		XSSFRow row = (XSSFRow) sheet.getRow(rowNum);
//		return row != null ? row.getLastCellNum() : 0;
//	}
//
//	public String getData(int rowNum, int colNum) {
//		XSSFRow row = (XSSFRow) sheet.getRow(rowNum);
//		if (row == null)
//			return "";
//
//		XSSFCell cell = row.getCell(colNum);
//		if (cell == null)
//			return "";
//
//		DataFormatter formatter = new DataFormatter();
//		return formatter.formatCellValue(cell);
//	}
//
//	public void setData(String filePath, int rowNum, int colNum, String value) throws IOException {
//		XSSFRow row = (XSSFRow) sheet.getRow(rowNum);
//		if (row == null)
//			row = (XSSFRow) sheet.createRow(rowNum);
//
//		XSSFCell cell = row.createCell(colNum);
//		cell.setCellValue(value);
//
//		try (FileOutputStream fos = new FileOutputStream(filePath)) {
//			workbook.write(fos);
//		}
//	}
//
//	public void close() throws IOException {
//		if (workbook != null) {
//			workbook.close();
//		}
//	}
//}