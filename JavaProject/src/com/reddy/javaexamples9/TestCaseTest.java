package com.reddy.javaexamples9;

public class TestCaseTest {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCaseTest t=new TestCaseTest();
		System.out.println(t.loginData());
		
	}
	public Object[][] getData(String ExcelName, String testcase) {
		Excel_Reader Data = new Excel_Reader("C:\\Users\\user\\git\\JavaProject\\JavaProject\\src\\com\\reddy\\javaexamples9\\TestData.xlsx");
		int rowNum = Data.getRowCount(testcase);
		System.out.println(rowNum);
		int colNum = Data.getColumnCount(testcase);
		Object sampleData[][] = new Object[rowNum - 1][colNum];
		for (int i = 2; i <=rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				sampleData[i - 2][j] = Data.getCellData(testcase, j, i);
			}
		}
		return sampleData;
	}
	
	
	public Object[][] loginData(){
		Object[][] data = getData("TestData.xlsx", "Paper");
		return data;
	}
}
