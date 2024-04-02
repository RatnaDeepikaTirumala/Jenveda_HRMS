package com.MSME.HRMS.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MSME.HRMS.Base.BaseClass;
import com.MSME.HRMS.PageObjects.AssetPage;
import com.MSME.HRMS.PageObjects.ClaimSetUpPage;
import com.MSME.HRMS.PageObjects.HomePage;
import com.MSME.HRMS.PageObjects.LoginPage;
import com.MSME.HRMS.Util.TestUtil;

public class AssetPageTest extends BaseClass {
	
	LoginPage loginPage;
	HomePage homePage;
	AssetPage assetPage;
	
    String sheetName="Asset";
	String sheetName1="EditAssetSetUp";
	
	public AssetPageTest() {
		super();
	}
	
	@BeforeMethod
	public AssetPage setUp() throws Throwable {
		initialization();
	    loginPage = new LoginPage();	
	    homePage = loginPage.Login(prop.getProperty("tenantname"),prop.getProperty("username"), prop.getProperty("password"));
		return assetPage = homePage.AssetIcon();
	}
	@Test
	public void assetPageHdrTest() throws Throwable {
		 boolean flag = assetPage.verifyAssetPageHdr(); 
	     Assert.assertTrue(flag);
	}
	
	@DataProvider 
	public Object[] [] getHRMSTestData()
	  {
	  Object data [] []=TestUtil.getTestData(sheetName); 
	  return data; 
	  }
	
	@Test(priority=1,dataProvider = "getHRMSTestData")
	public void addAsset(String Category, String ItemName, String ItemCode, String Quantity, String InLoan, String Balance, String Remarks, String ItemNumber, String PurchaseDate, String LendTo, String Description, String Status) throws Throwable  {
	
		assetPage.addAsset(Category,ItemName,ItemCode,Quantity,InLoan,Balance,Remarks,ItemNumber,PurchaseDate,LendTo,Description);
		
}
	
	 @AfterMethod
	  public void tearDown()
	  {
		  driver.quit();
	  
	  }
	 
}
