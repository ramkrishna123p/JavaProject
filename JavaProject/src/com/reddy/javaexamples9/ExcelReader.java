package com.reddy.javaexamples9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.reddy.javaexamples7.WorkingOfEnum;

public class ExcelReader {
  public String path;
  FileInputStream fis;
  XSSFWorkbook workbook;
	public ExcelReader(String path){
		this.path=path;
		// we need to create an excelpath object we cannot work on workbook .to access workbook
				//we need to have file Object
		//fileinputstream  opening a connection to an actual file,the file named by the path name and
		//will read data from the path
		try {
			fis = new FileInputStream(path);
			//i need to create an object of workbook to access workbook
		    workbook = new XSSFWorkbook(fis);
		    			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//to getcelldata we need a sheetname,colname and row number these are the three parameters we require to get cell data.
	public String getCellData(String sheetName,String colNum,int rowNum){
		//we need try catch block to catch the exception
		// we need to create an excelpath object we cannot work on workbook .to access workbook
		//we need to have file Object
	 try{
		 
	 }catch(Exception e){
		 e.printStackTrace();
	 }
	
   return null;
}
}