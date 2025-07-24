package utils;

<<<<<<< HEAD
public class ExcelReaderFile {
=======
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderFile {

	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;
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

	// to get the Cell Data
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
>>>>>>> branch 'testingmain' of git@github.com:sharvesh-cod/dsalgo_ninjalinos-BDD.git

}
