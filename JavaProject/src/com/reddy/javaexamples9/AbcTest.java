package com.reddy.javaexamples9;

import org.apache.poi.util.SystemOutLogger;

public class AbcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbcTest obj=new AbcTest();
		String[][] t=obj.getTestData();
	System.out.println(t[0][0]);
	for(int i=0;i<4;i++){
		for(int j=0;j<4;j++){
			System.out.println(t[i][j]+" ");
		}
		System.out.println(" ");
	}
	}
	public String[][] getData(String excelName, String sheetName) {
		String path = System.getProperty("user.dir") + "\\src\\com\\reddy\\javaexamples9\\" + excelName;
		ReadExcelFromTest excel = new ReadExcelFromTest(path);
		String[][] data = excel.getDataFromSheet(sheetName, excelName);
		return data;
	}
	public String[][] getTestData(){
		String[][] testRecords = getData("TestData.xlsx", "Paper");
		return testRecords;
	}
}
