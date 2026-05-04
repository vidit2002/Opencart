package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
    
	@DataProvider(name = "loginData")
	public String[][] getData() throws IOException
	{
		String path = ".\\testData\\Opencart_LoginData.xlsx";
		
		ExcelUtility xlutil = new ExcelUtility(path);
		
		int noOfRow = xlutil.getRowCount("Sheet1");
		int noOfCol = xlutil.getCellCount("Sheet1", 1);
		
		String loginData[][] = new String[noOfRow][noOfCol];
		
		for(int i=1;i<=noOfRow;i++)
		{
			for(int j=0;j<noOfCol;j++)
			{
				loginData[i-1][j] = xlutil.getCellData("Sheet1", i, j);
			}
		}
		return loginData;
	}
	
}
