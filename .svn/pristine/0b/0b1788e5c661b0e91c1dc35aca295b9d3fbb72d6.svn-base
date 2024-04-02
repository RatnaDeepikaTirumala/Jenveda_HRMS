package com.MSME.HRMS.TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MSME.HRMS.Base.BaseClass;
import com.MSME.HRMS.PageObjects.ClaimManagemntPage;
import com.MSME.HRMS.PageObjects.HomePage;
import com.MSME.HRMS.PageObjects.LoginPage;
import com.MSME.HRMS.Util.TestUtil;

public class ClaimManagementTest extends BaseClass {
	
	LoginPage loginPage;
	HomePage homePage;
	ClaimManagemntPage claimManagemntPage;
	String SheetName="ClaimMngt";

	public  ClaimManagementTest()
	{
		super();
	}
	
	@BeforeMethod
	public ClaimManagemntPage setUp() throws Throwable
	{
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.Login(prop.getProperty("tenantname"), prop.getProperty("username"), prop.getProperty("password"));
	    return claimManagemntPage=homePage.ClaimMngtIcon();
		
	}
	
	@DataProvider
	public Object[] [] getHRMSTestData()
	{
		Object[][] data=TestUtil.getTestData(SheetName);
		return data;
		
	}
	@Test(priority = 1, dataProvider = "getHRMSTestData")
	public void AddClaim(String EmployeeName, String ClaimName, String ProjectName, String FromDate, String ToDate, String Amount, String Remarks) throws Throwable
	{
		homePage.ClaimMngtIcon();
		claimManagemntPage.addClaimMngt(EmployeeName, ClaimName, ProjectName, FromDate, ToDate, Amount, Remarks);
		Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
