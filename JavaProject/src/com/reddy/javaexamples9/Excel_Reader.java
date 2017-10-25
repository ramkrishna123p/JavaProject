package com.reddy.javaexamples9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.reddy.javaexamples7.WorkingOfEnum;

public class Excel_Reader {
  public String path;
  FileInputStream fis;
  XSSFWorkbook workbook;
  XSSFSheet sheet;
  XSSFRow row;
  XSSFCell cell;
	public Excel_Reader(String path){
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
	public static void main(String[] args) {
		String path="C:\\Users\\user\\git\\JavaProject\\JavaProject\\src\\com\\reddy\\javaexamples9\\TestData.xlsx";
		Excel_Reader obj = new Excel_Reader(path);
		// System.out.println(obj.getCellData("Login", "UserName", 4));

		System.out.println(obj.getRowCount("Paper"));
		
		System.out.println(obj.getColumnCount("Paper"));
		
		System.out.println(obj.getCellData("Paper", 3, 4));
	}
	
	//to getcelldata we need a sheetname,colname and row number these are the three parameters we require to get cell data.
	public String getCellData(String sheetName,String colName,int rowNum){
		//we need try catch block to catch the exception
		// we need to create an excelpath object we cannot work on workbook .to access workbook
		//we need to have file Object
	 try{
		 int col_Num=0;
		 //to get sheet index we use getsheetindex method
		int index= workbook.getSheetIndex(sheetName);
		System.out.println(index);
		//what sheet we want to have and got the sheet object
		 sheet = workbook.getSheetAt(index);
		 System.out.println(sheet);
		 //to read the first row we use method getrow
		 row = sheet.getRow(0);
		 System.out.println(row);
		 //column name should be fixed
		 //getlastcellnum - define how many colums this excel sheet has i.e row number 0 column number 0.
		 for(int i=0;i<row.getLastCellNum();i++){
			 if(row.getCell(i).getStringCellValue().equalsIgnoreCase(colName)){
				 col_Num = i;
				 System.out.println(col_Num);
			 }
		 }
		 //here row number is fixed.
		 row=sheet.getRow(rowNum - 1);
		 System.out.println(row);
		 //once column number is fixed and reading that cell data
		 cell = row.getCell(col_Num);
		 System.out.println(cell);
		 if(cell.getCellType()==cell.CELL_TYPE_STRING){
		    return cell.getStringCellValue();
		  } else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC){
			  return String.valueOf(cell.getNumericCellValue());
		  }else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN){
			  return String.valueOf(cell.getBooleanCellValue());
		  }else if(cell.getCellType()==cell.CELL_TYPE_BLANK){
			  return "";
		 
		  }
	 }catch(Exception e){
		 e.printStackTrace();
	 }
	
   return null;
}
	
	public String getCellData(String sheetName,int colNum,int rowNum){
		//we need try catch block to catch the exception
		// we need to create an excelpath object we cannot work on workbook .to access workbook
		//we need to have file Object
	 try{
		//to get sheet index we use getsheetindex method
		int index= workbook.getSheetIndex(sheetName);
		System.out.println(index);
		//what sheet we want to have and got the sheet object
		 sheet = workbook.getSheetAt(index);
		 System.out.println(sheet);
		 //to read the first row we use method getrow
		 row = sheet.getRow(0);
		 System.out.println(row);
		 //column name should be fixed
		 //getlastcellnum - define how many colums this excel sheet has i.e row number 0 column number 0.
		 //here row number is fixed.
		 row=sheet.getRow(rowNum - 1);
		 System.out.println(row);
		 //once column number is fixed and reading that cell data
		 XSSFCell cell = row.getCell(colNum);
		 System.out.println(cell);
		 if(cell.getCellType()==cell.CELL_TYPE_STRING){
		    return cell.getStringCellValue();
		  } else if(cell.getCellType()==cell.CELL_TYPE_NUMERIC){
			  return String.valueOf(cell.getNumericCellValue());
		  }else if(cell.getCellType()==cell.CELL_TYPE_BOOLEAN){
			  return String.valueOf(cell.getBooleanCellValue());
		  }else if(cell.getCellType()==cell.CELL_TYPE_BLANK){
			  return "";
		 
		  }
	 }catch(Exception e){
		 e.printStackTrace();
	 }
	
   return null;
}	
	
	public int getRowCount(String sheetName){
		try{
		int index=workbook.getSheetIndex(sheetName);
		System.out.println(index);
		if(index == -1){
			return 0;
		} else{
			sheet=workbook.getSheetAt(index);
			int number=sheet.getLastRowNum();
			System.out.println(number);
			return number;
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
		
	}
	public int getColumnCount(String sheetName){
		try{
			int index=workbook.getSheetIndex(sheetName);
			if(index == -1){
				return 0;
			} else{
				sheet=workbook.getSheet(sheetName);
				row=sheet.getRow(0);
				System.out.println(row);
				return row.getLastCellNum();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
		
	}
	
}