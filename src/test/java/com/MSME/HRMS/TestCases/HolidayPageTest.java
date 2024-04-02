package com.MSME.HRMS.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MSME.HRMS.Base.BaseClass;
import com.MSME.HRMS.PageObjects.HolidayPage;
import com.MSME.HRMS.PageObjects.HomePage;
import com.MSME.HRMS.PageObjects.LoginPage;
import com.MSME.HRMS.Util.TestUtil;

public class HolidayPageTest extends BaseClass {

	
	ControlFunctionalities cf = new ControlFunctionalities();
	LoginPage loginPage;
	HomePage homePage;	
	HolidayPage holidayPage;
	

	String sheetName="holidaysAll";
	String sheetName1="holidaySel";

	

	public HolidayPageTest() {
		
		super();
		
	}

	@BeforeMethod
	public HolidayPage setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.Login(prop.getProperty("tenantname"), prop.getProperty("username"),prop.getProperty("password"));
	    return holidayPage = homePage.clickOnHolidays();
	}


	  @Test(enabled = false)
	   public void holidayPageHdrTest() throws Throwable 
	   {
	     boolean flag = holidayPage.verifyHolidayPageHdr(); 
	     Assert.assertTrue(flag);
	   }
	 
		
	@DataProvider public Object[] [] getHRMSTestData()
	  {
	  
	  Object data [] []=TestUtil.getTestData(sheetName); 
	  return data; 
	  }
		
		  @Test(priority = 1, dataProvider = "getHRMSTestData")
		  public void addHolidayTest(String HolidayName, String StartDate, String EndDate, String ApplyTo,String Remarks) throws Throwable 
		  {
		  
		  holidayPage.addHoliday(HolidayName,  StartDate,  EndDate,  ApplyTo, Remarks);
		  }
		 
	  @DataProvider
		 public Object[][] getTestData1() {
			Object data[][] = TestUtil.getTestData1(sheetName1);
			return data;
		 }
 
	 @Test(enabled = false, dataProvider = "getTestData1")
		  public void AddHolidaySel(String EditHolidayName,String holidayName, String startDate, String endDate, String applyTo, String Designation,String Designation1, String Designation2,  String Department,String Department1, String Department2, String employees, String Remarks) throws Throwable
			{

		}
	  
		  
		  @Test(enabled = false, dataProvider = "getTestData1")
	  public void addSelEmp(String EditHolidayName,String holidayName, String startDate, String endDate, String applyTo, String Designation, String Department, String employees, String remarks) throws Throwable
	  {
		  holidayPage.addHolidaySelectedEmp(holidayName, startDate, endDate, applyTo, employees, remarks);
	  }
		  
	  
      @Test(enabled = false, dataProvider = "getTestData1")
	  public void editHoliday(String EditedHolidayName,String holidayName, String startDate, String endDate, String applyTo, String Designation,String Designation1, String Designation2,  String Department,String Department1, String Department2, String employees, String Remarks ) throws Throwable
	  {
		  holidayPage.editHoliday(EditedHolidayName, holidayName, startDate, endDate, applyTo, Remarks);
	  }
		    	

	  @Test(enabled=false) 
	  public void EditHoliday(String editHolidayName, String
	  holidayName, String startDate, String endDate, String applyTo, String
	  Remarks, String departmentName,String designationName) throws Throwable {
		  holidayPage.editHoliday(editHolidayName, holidayName, startDate, endDate,
				  applyTo, Remarks);
		  holidayPage.validateError(); }
			  
				  
      @Test(enabled = false, dataProvider="getTestData1")
      public void disableRecord(String EditedHolidayName,String holidayName, String startDate, String endDate, String applyTo, String Designation,String Designation1, String Designation2,  String Department,String Department1, String Department2, String employees, String Remarks) throws Throwable
      {
    	  holidayPage.disable(EditedHolidayName);
      }
		  
	
		 @AfterMethod 
		 public void tearDown() 
		 { 
			 driver.quit(); 
		 }
}
