package com.MSME.HRMS.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.MSME.HRMS.Base.BaseClass;

public class LeaveEntitlementPage extends BaseClass{

	ControlFunctionalities cf = new ControlFunctionalities();
	
	@FindBy(xpath = "//span[@class='icon md employeemanagement']")
	public WebElement empManageIcon;
	
	@FindBy(xpath = "//a[text()='Employees']")
	public WebElement employee;
	
	@FindBy(xpath = "//a[text()='employees']")
	public WebElement employeesHdr;
	
	@FindBy(xpath = "//span[@class='icon add-permission c-pointer  pulse']")
	@CacheLookup
	public WebElement addIcon;

    @FindBy(xpath = "//span[@class='icon settings c-pointer pulse']")
    public WebElement settingIcon;
    
    @FindBy(xpath = "//span[@class='icon edit-permission c-pointer']")
    public WebElement EntitleDetailsEditIcon;
    
    @FindBy(xpath = "//span[@class='icon edit-permission c-pointer  pulse']")
    public WebElement editIcon;

    @FindBy(xpath = "//button[text()='Leave Entitlement']")
    public WebElement leaveEntHdr;

    @FindBy(xpath = "(//h4[text()='Entitlement Details'])[1]")
    public WebElement entitlementDetailsHdr;

    @FindBy(xpath = "//p[text()='Leave Recommender']")
    public WebElement leaveRecommender;
    
    @FindBy(xpath = "(//label[@class='mr-1'])[1]")
    public WebElement leaveRecommenderChkBx;

    @FindBy(xpath = "//p[text()='Leave Approver']")
    public WebElement leaveApprover;
    
    @FindBy(xpath = "(//label[@class='mr-1'])[2]")
    public WebElement leaveApproverChkBx; 
    
    @FindBy(xpath = "(//label[@class='text-center custom-checkbox'])[1]")
    public WebElement CheckBx;
    
    @FindBy(xpath = "//select[@name='recommenderId']")
    public WebElement recommenderIdCmd;
    
    @FindBy(xpath = "//select[@name='approverId']")
    public WebElement approverIdCmd;
    
    @FindBy(xpath = "(//button[text()='Save'])[1]")
    public WebElement saveBtn;
    
    @FindBy(xpath="//input[@name='adjusted']")
    public WebElement adjustedTxtBx;
    
    @FindBy(xpath="//textarea[@name='reason']")
    public WebElement reasonTxtBx;
    
    @FindBy(xpath="//div[contains(@class,'err')]")
	@CacheLookup
	public WebElement errorTag;
    
    @FindBy(xpath="(//span[contains(@class,'k-icon k-i-more-vertical')])[1]")
	@CacheLookup
	public WebElement menuIcon;
	 
	 @FindBy(xpath="//div[.='Filter']")
	 @CacheLookup
	 public WebElement txtFilter;
	 
	 @FindBy(xpath="//span[text()='Contains']")
	 @CacheLookup
	 public WebElement txtContains;
	 
	 @FindBy(xpath="//li[text()='Is equal to']")
	 @CacheLookup
	 public WebElement txtIsEqualsTo;
	 
	 @FindBy(xpath="(//input[@class='k-textbox'])[1]")
	 @CacheLookup
	 public WebElement filterTxtBx;
	 
	 @FindBy(xpath="//button[text()='Filter']")
	 @CacheLookup
	 public WebElement filterBtn;
	 
	 @FindBy(xpath="(//div[@class='k-widget k-grid']//div[1]//following-sibling::div[1]//div[1]//td[2]//div//span)[1]")
	 @CacheLookup
	 public WebElement txtEmpName;
	    
	 @FindBy(xpath="//h4[text()='Personal Info']")
	 @CacheLookup
	 public WebElement personalInfoHdr;
	 
	 @FindBy(xpath = "//span[@class='icon disable-permission c-pointer  pulse']")
	 @CacheLookup
	 public WebElement disableIcon;
		
	 @FindBy(xpath = "//p[text()='Do you really want to Inactive ?']")
	 @CacheLookup
	 public WebElement confirmTxt;
		
	 @FindBy(xpath = "//button[text()='Ok']")
	 @CacheLookup
	 public WebElement okBtn;
	 
	 @FindBy(xpath="//table[@class='k-grid-table']")
	 @CacheLookup
	 public WebElement grid;
	 
	 @FindBy(xpath="//span[@class='k-select']")
	 @CacheLookup
	 public WebElement PageNumm;
	 
	 @FindBy(xpath="//span[@class='k-dropdown-wrap']")
	 @CacheLookup
	 public WebElement PageNum;
	 
	 @FindBy(xpath="//li[text()='All']")
	 @CacheLookup
	 public WebElement all;
	 
	 @FindBy(xpath="//li[text()='All']")
	 @CacheLookup
	 public WebElement alll;
	 
	 @FindBy(xpath="//span[@class='error-bottom-text']")
	 @CacheLookup
	 public WebElement bottomErr;
	 
	 @FindBy(xpath="//button[text()=' Cancel']")
	 @CacheLookup
	 public WebElement cancelBtn;
	 
	 @FindBy(xpath="(//h4[text()='N/A'])[1]")
	 @CacheLookup
	 public WebElement NA1;
	 
	 @FindBy(xpath="(//h4[text()='N/A'])[2]")
	 @CacheLookup
	 public WebElement NA2;
	 

	//Initializing the Page Objects
		public LeaveEntitlementPage() throws Throwable {
			PageFactory.initElements(driver, this);
		}
	 
		public String getLeaveRecommender(String LeaveRecommender) {
			 return driver.findElement(By.xpath("(//h4[text()='"+LeaveRecommender+"'])[1]")).getText();
		 }
		
		public String getLeaveApprover(String LeaveApprover) {
			 return driver.findElement(By.xpath("(//h4[text()='"+LeaveApprover+"'])[2]")).getText();
		 }
		
	 public void getEmployeeNameLink(String SelectEmployee) {
		 driver.findElement(By.xpath("//span[text()='"+SelectEmployee+"']")).click();
	 }
	 
	 public WebElement getLeaveType(String leaveType) {
		 return driver.findElement(By.xpath("//span[text()='"+leaveType+"']/../../preceding-sibling::td[1]//div")); 
	 }
	 
	 public WebElement velidataStatus(String EditLeaveType) {
			return driver.findElement(By.xpath("//span[text()='"+EditLeaveType+"']/../../following-sibling::td[6]//div//span"));
		}
	
	 
	 public boolean LeaveEntitlementPageTab() throws Throwable {
			
			
			Thread.sleep(3000);
			return leaveEntHdr.isDisplayed();
	 }
	 
	 public void editLeaveEntitlementDetails(String LeaveRecommender,String LeaveApprover) throws Throwable {
		 Thread.sleep(3000);	 
		 EntitleDetailsEditIcon.click();
		 Thread.sleep(3000);
		 if(recommenderIdCmd.isEnabled()==true) {
			 cf.setValue(recommenderIdCmd, LeaveRecommender, 3000);
		 }
		 else {
			 cf.selectElement(leaveRecommenderChkBx, 3000);	 
			 cf.setValue(recommenderIdCmd, LeaveRecommender , 3000);
		 }
		 Thread.sleep(3000);
		 if(approverIdCmd.isEnabled()==true) {
			 cf.setValue(approverIdCmd, LeaveApprover, 3000);
		 }
		 else {
			 cf.selectElement(leaveApproverChkBx, 3000);
			 cf.setValue(approverIdCmd, LeaveApprover, 3000);
		 }
		 
		 Thread.sleep(3000);
		 saveBtn.click();
		 validateError();
		 
	 }
	 
	 public void verifyEntitlementChk() throws Throwable {
		 String recommender = NA1.getText();
		 Assert.assertEquals(recommender, "N/A");
		 String approver = NA2.getText();
		 Assert.assertEquals(approver, "N/A");
		 System.out.println("Entitlement Updated Successfully");
	 }
	 
	 public void  verifyEntitlementDetails(String LeaveRecommender, String LeaveApprover) throws Throwable {
		 String recommender = getLeaveRecommender(LeaveRecommender);
		 Assert.assertEquals(recommender, LeaveRecommender);
		 String approver = getLeaveApprover(LeaveApprover);
		 Assert.assertEquals(approver, LeaveApprover);
		 System.out.println("Entitlement Updated Successfully");
	 }
	 
	 public void editLeaveEntitlementDetailsChk(String SelectEmployee) throws Throwable {
		 Thread.sleep(3000);
		 EntitleDetailsEditIcon.click();
		 Thread.sleep(3000);
		 cf.selectElement(leaveRecommenderChkBx, 3000);	 
		 Thread.sleep(3000);
		 cf.selectElement(leaveApproverChkBx, 3000);
		 Thread.sleep(3000);
		 saveBtn.click();
		 Thread.sleep(3000);
		 
	 }
	 
	 public void editEntitlement(String EditLeaveType, String Adjustment, String Reason) throws Throwable {
		 Thread.sleep(3000);
		 getLeaveType(EditLeaveType).click();
		 editIcon.click();
		 Thread.sleep(3000);
		 cf.setValue(adjustedTxtBx, Adjustment, 3000);
		 Thread.sleep(3000);
		 cf.setValue(reasonTxtBx, Reason, 3000);
		 Thread.sleep(3000);
		 saveBtn.click();
		 Thread.sleep(3000);
	 }
	 
	 public void cancelEntitlement(String EditLeaveType, String Adjustment, String Reason) throws Throwable {
		 Thread.sleep(3000);
		 getLeaveType(EditLeaveType).click();
		 editIcon.click();
		 Thread.sleep(3000);
		 cf.setValue(adjustedTxtBx, Adjustment, 3000);
		 Thread.sleep(3000);
		 cf.setValue(reasonTxtBx, Reason, 3000);
		 Thread.sleep(3000);
		 cancelBtn.click();
		 Thread.sleep(3000);
	 }
	 
	 public void changeStatus(String EditLeaveType) throws Throwable {
			cf.waitforElement(leaveEntHdr,10000);

			if (cf.iselementExists(leaveEntHdr,3000)==true)
			{
				cf.waitforElement(grid,10000);

				cf.selectElement(PageNum, 3000);
				cf.selectElement(all, 3000);
				cf.waitforElement(grid,10000);
				String status = velidataStatus(EditLeaveType).getText();
				if(status=="Active")
				{
				//select Check box
				cf.selectElement(getLeaveType(EditLeaveType),3000);    //Select Disable Icon
				cf.selectElement(disableIcon,3000);
				//Click on OK button
				cf.selectElement(okBtn,3000);
				cf.waitforElement(grid,10000);
				 
				}
			
				else {
				//select Check box
				cf.selectElement(getLeaveType(EditLeaveType),3000);    
				//Select Disable Icon
				cf.selectElement(disableIcon,3000);
				//Click on OK button
				cf.selectElement(okBtn,3000);
				cf.waitforElement(grid,10000);
				
				}
			}
			}
	 
	 
	 
	 
	 
	 public boolean validateError() throws Throwable {
			
			if (cf.iselementExists(errorTag)==false)
			{
				cf.waitforElement(leaveEntHdr,3000);
				System.out.println("         ***Success***");
				return true;	
			}
			
			else
			{
				System.out.println(errorTag.getText());
				System.out.println("         ***Error Message***");
				System.out.println(bottomErr.getText());
				return false;
			}
			
		}

	 
	 
}
