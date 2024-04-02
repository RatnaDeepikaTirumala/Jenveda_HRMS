package com.MSME.HRMS.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MSME.HRMS.Base.BaseClass;

public class HomePage extends BaseClass{
	
	LeaveEntitlementPage leaveEntitlementPage;
	
	//PageFactory or Object Repository
	
	@FindBy(xpath = "//span[text()='MSME']")
	public
	WebElement MSME;
	
	@FindBy(xpath = "//span[@class='icon md dashboard']")
	public
	WebElement dashBoardIcon;
	
	@FindBy(xpath = "//h4[text()='Employee Self Service']")
	public
	WebElement employeeSelfServiceIcon;
		
	@FindBy(xpath = "//a[text()='My Claims']")
	public
	WebElement myClaims;
	
	@FindBy(xpath = "//a[text()='My Payslip']")
	public
	WebElement myPayslips;
	
	@FindBy(xpath = "My Attendance")
	public
	WebElement myAttendance;
	
	@FindBy(xpath = "//h4[text()='Manager Self Service']")
	public
	WebElement managerSelfServiceIcon;
	
	@FindBy(xpath = "//a[text()='Manage Attendance']")
	public
	WebElement manageAttendance;
	
	@FindBy(xpath = "//a[text()='Manage Leaves']")
	public
	WebElement manageLeaves;
	
	@FindBy(xpath = "//a[text()='Manage Claims']")
	public
	WebElement manageClaims;
	
	@FindBy(xpath = "//h4[text()='Employee Management']")
	public
	WebElement employeeManagement;
	
	@FindBy(xpath = "//a[text()='Employees']")
	public
	WebElement employee;
	
	@FindBy(xpath = "//a[text()='Import Excel']")
	public
	WebElement importExcel;
	
	@FindBy(xpath = "//h4[text()='Attendance']")
	public
	WebElement attendanceIcon;
	
	@FindBy(xpath = "//a[text()='Attendance Management']")
	public
	WebElement attendanceManagement;
	
	@FindBy(xpath = "//h4[text()='Master Screen Settings']")
	public
	WebElement masterScreenSettingsIcon;
	
	@FindBy(xpath = "//a[text()='Holidays']")
	public
	WebElement holidays;

	@FindBy(xpath="//span[@class='icon md claimmanagement']")
	public WebElement claimMngtIcon;

	@FindBy(xpath = "//a[text()='Claim Setup']")
	public 
	WebElement claimSetUpIcon;

	@FindBy(xpath = "//span[@class='icon settings c-pointer pulse']")
    public WebElement settingIcon;
	
	@FindBy(xpath="//h4[text()='Claims']")
	public WebElement claimIcon;
	
	@FindBy(xpath = "//a[text()='Assets']")
	@CacheLookup
	public WebElement assetIcon;
	
	public void getEmployeeNameLink(String employeeName) {
		 driver.findElement(By.xpath("//span[text()='"+employeeName+"']")).click();
	 }
	 
	 public WebElement getLeaveType(String leaveType) {
		 return driver.findElement(By.xpath("//span[text()='"+leaveType+"']/../../preceding-sibling::td[1]//div")); 
	 }
	 
	
	//Initializing the Page Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
		
	public String verifyHomePageTitle() throws InterruptedException {
		Thread.sleep(3000);
		return driver.getTitle();
	}
	
	public HolidayPage clickOnHolidays() throws Throwable  {
		
		Actions act = new Actions(driver);
		act.moveToElement(masterScreenSettingsIcon).perform();
		Thread.sleep(3000);
		holidays.click();
		return new HolidayPage();
		
	}	
	
	public LeaveEntitlementPage clickOnLeaveEntitlement(String SelectEmployee) throws Throwable {
		Actions act = new Actions(driver);
		act.moveToElement(employeeManagement).perform();
		Thread.sleep(3000);
		employee.click();
		Thread.sleep(3000);
		getEmployeeNameLink(SelectEmployee);
		settingIcon.click();
		return new LeaveEntitlementPage();
	}


	public ClaimSetUpPage ClaimSetUpIcon() throws Throwable
	{
		Actions act = new Actions(driver);
		act.moveToElement(masterScreenSettingsIcon).perform();
		Thread.sleep(3000);
		claimSetUpIcon.click();
		Thread.sleep(3000);
		return new ClaimSetUpPage();
	}
	
	public ClaimManagemntPage ClaimMngtIcon() throws Throwable
	{
		Actions act=new Actions(driver);
		act.moveToElement(claimIcon).perform();
		Thread.sleep(3000);
		claimMngtIcon.click();
		Thread.sleep(3000);
		return new ClaimManagemntPage();
		
	}
	
	public AssetPage AssetIcon() throws Throwable 
	{
		Actions act=new Actions(driver);
		act.moveToElement(masterScreenSettingsIcon).perform();
		Thread.sleep(3000);
		assetIcon.click();
		Thread.sleep(3000);
		return new AssetPage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
