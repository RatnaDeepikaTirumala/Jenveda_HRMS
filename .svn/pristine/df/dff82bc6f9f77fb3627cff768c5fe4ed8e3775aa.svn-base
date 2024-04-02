package com.MSME.HRMS.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.MSME.HRMS.Base.BaseClass;
import com.MSME.HRMS.PageObjects.HomePage;
import com.MSME.HRMS.PageObjects.LeaveEntitlementPage;
import com.MSME.HRMS.PageObjects.LoginPage;
import com.MSME.HRMS.Util.TestUtil;

public class LeaveEntitlementTest extends BaseClass {

	ControlFunctionalities cf = new ControlFunctionalities();
	LoginPage loginPage;
	HomePage homePage;
	LeaveEntitlementPage leaveEntitlementPage;
	String sheetName = "entitlement";
	
	String LeaveRecommender;
	String LeaveApprover;
	String EditLeaveType;
	String Adjustment;
	String Reason;
	String SelectEmployee;
	
	public LeaveEntitlementTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws Throwable {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.Login(prop.getProperty("tenantname"), prop.getProperty("username"),prop.getProperty("password"));
		leaveEntitlementPage = homePage.clickOnLeaveEntitlement("DeekshithHR S");
		
   }
	
	 @Test(enabled=false)
	  public void leaveEntitlementPageTabTest() throws Throwable {
	       System.out.println("--- LeaveEntitlementTestCases : 1 ---");
	       boolean flag = leaveEntitlementPage.LeaveEntitlementPageTab();
	       Assert.assertTrue(flag);
	       System.out.println("---Success---");
	  }
	
	 @DataProvider
	 public Object[] [] getHRMSSTestData()
	 {
		Object data [] []=TestUtil.getTestData(sheetName);
		return data;
	 }
	 @Test(enabled=false)
	 public void EditLeaveEntitlementDetails(String LeaveRecommender, String LeaveApprover,String EditLeaveType, String Adjustment, String Reason,String SelectEmployee) throws Throwable {
		 System.out.println("--- LeaveEntitlementTestCases : 2 ---");
		 leaveEntitlementPage.editLeaveEntitlementDetails(LeaveRecommender, LeaveApprover);
		 leaveEntitlementPage.verifyEntitlementDetails(LeaveRecommender,LeaveApprover);
		 
	 }
	 
	 @Test(enabled=false)
	 public void EditLeaveEntitlementDetailsChk(String LeaveRecommender, String LeaveApprover,String EditLeaveType, String Adjustment, String Reason,String SelectEmployee) throws Throwable {
		 System.out.println("--- LeaveEntitlementTestCases : 3 ---");
		 leaveEntitlementPage.editLeaveEntitlementDetailsChk(SelectEmployee);
		 leaveEntitlementPage.validateError();
		 leaveEntitlementPage.verifyEntitlementChk();
	 }
	 
	 @Test(enabled=false)
	 public void EditEntitlement(String LeaveRecommender, String LeaveApprover,String EditLeaveType, String Adjustment, String Reason,String SelectEmployee) throws Throwable {
		 System.out.println("--- LeaveEntitlementTestCases : 4 ---");			 
		 leaveEntitlementPage.editEntitlement(EditLeaveType,Adjustment,Reason);
		 leaveEntitlementPage.validateError();
		 System.out.println("LeaveEntitlement Updated Successfully");
	 }
	 
	 @Test(enabled=false)
	 public void cancelEntitlementTest(String LeaveRecommender, String LeaveApprover,String EditLeaveType, String Adjustment, String Reason,String SelectEmployee) throws Throwable {
		 System.out.println("--- LeaveEntitlementTestCases : 5 ---");
		 leaveEntitlementPage.cancelEntitlement(EditLeaveType,Adjustment,Reason);
		 leaveEntitlementPage.validateError();
		 System.out.println("   ---Cancelled---");
	 }
	 
	 @Test(priority = 1, dataProvider="getHRMSSTestData") 
	  public void DisableHoliday(String LeaveRecommender, String LeaveApprover,String EditLeaveType, String Adjustment, String Reason,String SelectEmployee) throws Throwable { 
	  System.out.println("--- HolidayTestCases : 6 ---");
	  leaveEntitlementPage.changeStatus(EditLeaveType); 
	  String status = leaveEntitlementPage.velidataStatus(EditLeaveType).getText();
	  Assert.assertEquals(status, "Inactive");
	  System.out.println("***LeaveType Inactive Successfully***");  
	  }
	 
	 @Test(priority = 2, dataProvider="getHRMSSTestData") 
	  public void enableHoliday(String LeaveRecommender, String LeaveApprover,String EditLeaveType, String Adjustment, String Reason,String SelectEmployee) throws Throwable { 
	  leaveEntitlementPage.changeStatus(EditLeaveType); 
	  String status = leaveEntitlementPage.velidataStatus(EditLeaveType).getText();
	  Assert.assertEquals(status, "Active");
	  System.out.println("***LeaveType Active Successfully***");  
	  }
	 
	 @AfterMethod
		public void tearDown() {
			driver.quit();
		}
}

