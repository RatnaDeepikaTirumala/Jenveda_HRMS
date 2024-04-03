package com.MSME.HRMS.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MSME.HRMS.Base.BaseClass;

public class HolidayPage extends BaseClass {
	
	ControlFunctionalities cf = new ControlFunctionalities();
	
	//PageFactory or Object Repository
	
	@FindBy(xpath = "//a[text()='holidays']")
	public
	WebElement holidayHdr;
	
	@FindBy(xpath = "//div[@class='k-widget k-grid']")
	@CacheLookup
	public WebElement grid;

	@FindBy(xpath = "//span[@class='icon add-permission c-pointer  pulse']")
	public WebElement addIcon;

	@FindBy(xpath = "//span[@class='icon edit-permission c-pointer  pulse']")
	@CacheLookup
	public WebElement editIcon;

	@FindBy(xpath="//h1[text()='Add Holidays']")
	WebElement addHolidaysHdr;

	@FindBy(xpath="//input[@name='name']")
	@CacheLookup
	public WebElement nameTxtBx;

	@FindBy(xpath="//input[@name='startDate']")
	@CacheLookup
	public WebElement startDateTxtBx;

	@FindBy(xpath="//input[@name='endDate']")
	@CacheLookup
	public WebElement endDateTxtBx;

	@FindBy(xpath="//input[@name='noOfDays']")
	@CacheLookup
	public WebElement noOfDaysTxtBx;

	@FindBy(xpath="//select[@name='applyTo']")
	public WebElement applyToTxtBx;

	@FindBy(xpath="//textarea[@name='remarks']")
	public WebElement remarksTxtBx;

	@FindBy(xpath="//button[text()=' Cancel']")
	@CacheLookup
	public WebElement cancelBtn;

	@FindBy(xpath="//button[text()='Save']")
	@CacheLookup
	public WebElement saveBtn;

	@FindBy(xpath = "//div[contains(@class,'error-msg')]")
	@CacheLookup
	public WebElement errorTag;

	@FindBy(xpath="(//div[@class='text-center'])[1]")
	@CacheLookup
	public WebElement checkBx;

	@FindBy(xpath = "//span[@class='icon disable-permission c-pointer  pulse']")
	@CacheLookup
	public WebElement disableIcon;

	@FindBy(xpath = "//p[text()='Do you really want to Inactive ?']")
	@CacheLookup
	public WebElement confirmTxt;
	
	@FindBy(xpath="//p[text()='Confirm Active ?']")
	public
	WebElement activeTxt;

	@FindBy(xpath = "//button[text()='Ok']")
	@CacheLookup
	public WebElement okBtn;
	
	@FindBy(xpath="//input[@id='react-select-2-input']")
	@CacheLookup
	public WebElement departmentCmb;

	@FindBy(xpath="//input[@id='react-select-3-input']")
	@CacheLookup
	public WebElement designationCmb;

	@FindBy(xpath="//input[@id='react-select-4-input']")
	@CacheLookup
	public WebElement employeesCmb;

	@FindBy(xpath="//table[@class='k-grid-table']")
	@CacheLookup
	public WebElement gridd;

	@FindBy(xpath="//span[@class='k-dropdown-wrap']")
	@CacheLookup
	public WebElement PageNum;

	@FindBy(xpath="//li[text()='All']")
	@CacheLookup
	public WebElement all;
	
	@FindBy(xpath="//input[@name='startDate']")
	@CacheLookup
	public WebElement dataPickerIcon;
	
	@FindBy(xpath="//span[@class='error-bottom-text']")
	@CacheLookup
	public WebElement bottomErr;
	
	ClaimSetUpPage claimSetUpPage;

	
	//Initializing the Page Objects
	public HolidayPage() throws Throwable {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getHolidayCheckBx(String holidayName) {
		return driver.findElement(By.xpath("//span[text()='"+holidayName+"']/../../preceding-sibling::td[1]//label")); 
	}
	
	public WebElement velidataHoliday(String holiday) {
		return driver.findElement(By.xpath("//span[text()='"+holiday+"']"));
	}
	
	public WebElement velidataStatus(String holiday) {
		return driver.findElement(By.xpath("//span[text()='"+holiday+"']/../../following-sibling::td[5]//div//span"));
	}
	
	
	public boolean verifyHolidayPageHdr() throws Throwable {
		
		
		Thread.sleep(3000);
		holidayHdr.getText();
		return holidayHdr.isDisplayed();
		
	}
	
	public void addHoliday(String holidayName, String startDate, String endDate, String applyTo,String Remarks) throws Throwable {
		
		cf.waitforElement(holidayHdr,10000);
		if (cf.iselementExists(holidayHdr,3000)==true)
		{	

		cf.selectElement(addIcon,3000);

		cf.setValue(nameTxtBx, holidayName,3000);
	
		cf.setValue(startDateTxtBx, startDate,3000);
        Thread.sleep(3000);
		cf.setValue(endDateTxtBx, endDate,3000);

		cf.SelectCombobyVisibleText(applyToTxtBx, applyTo,3000);
	    	cf.setValue(remarksTxtBx, Remarks,3000);
		    cf.selectElement(saveBtn,3000);
		    Thread.sleep(3000);
		    validateError();
	    }
		
	
	}
	
public void addHolidaySelected(String holidayName, String startDate, String endDate, String applyTo, String departmentName, String department1, String department2,String designationName, String designation1, String designation2, String Remarks) throws Throwable {
		
		cf.waitforElement(holidayHdr,10000);
		if (cf.iselementExists(holidayHdr,3000)==true)
		{	

		cf.selectElement(addIcon,3000);

		cf.setValue(nameTxtBx, holidayName,3000);
	
		cf.setValue(startDateTxtBx, startDate,3000);

		cf.setValue(endDateTxtBx, endDate,3000);

		cf.SelectCombobyVisibleText(applyToTxtBx, applyTo,3000);
		cf.setMultiValue(departmentCmb, departmentName, 3000);
		cf.setMultiValue(departmentCmb, department1, 3000);
		cf.setMultiValue(departmentCmb, department2, 3000);
		cf.setMultiValue(designationCmb, designationName, 3000);
		cf.setMultiValue(designationCmb, designation1, 3000);
		cf.setMultiValue(designationCmb, designation2, 3000);
		cf.setMultiValue(remarksTxtBx, Remarks,3000);
		cf.selectElement(saveBtn,3000);
		Thread.sleep(3000);
	    validateError();
	    }
		
		
	}
	
public void addHolidaySelectedEmp(String holidayName, String startDate, String endDate, String applyTo, String emp, String Remarks) throws Throwable {
	
	cf.waitforElement(holidayHdr,10000);
	if (cf.iselementExists(holidayHdr,3000)==true)
	{	

	cf.selectElement(addIcon,3000);

	cf.setValue(nameTxtBx, holidayName,3000);

	cf.setValue(startDateTxtBx, startDate,3000);

	cf.setValue(endDateTxtBx, endDate,3000);

	cf.SelectCombobyVisibleText(applyToTxtBx, applyTo,3000);
	cf.setValue(employeesCmb, emp, 3000);
    	cf.setValue(remarksTxtBx, Remarks,3000);
	    cf.selectElement(saveBtn,3000);
	    Thread.sleep(3000);
	    validateError();
    }
	
	
}

    public void editHoliday(String editedHolidayName, String holidayName, String startDate, String endDate, String applyTo,String Department, String Designation, String Employees, String remarks) throws Throwable
    {
    	if(holidayHdr.isDisplayed()==true)
    	{
    	cf.waitforElement(grid, 3000);
    	cf.selectElement(PageNum, 3000);
    	cf.selectElement(all, 3000);
    	getholidayCheckBx(editedHolidayName).click();;
    	editIcon.click();
    	cf.setValue(nameTxtBx, holidayName, 3000);
    	cf.setValue(startDateTxtBx, startDate, 3000);
    	cf.setValue(endDateTxtBx, endDate, 3000);
    	cf.SelectCombobyVisibleText(applyToTxtBx, applyTo, 3000);
    	cf.setValue(remarksTxtBx, remarks, 2000);
    	cf.selectElement(saveBtn, 3000);
    	Thread.sleep(3000);
        validateError();
        
        }
    }
	public void editHoliday1(String editHolidayName, String holidayName, String startDate, String endDate, String applyTo, String Department,String Designation, String Employees, String Remarks) throws Throwable{
		
		System.out.println("--- HolidayTestCases : 5 ---");
		cf.waitforElement(holidayHdr,10000);

	    if (cf.iselementExists(holidayHdr,3000)==true)
		{

		cf.waitforElement(grid,10000);

		cf.selectElement(PageNum, 3000);
		cf.selectElement(all, 3000);

		cf.waitforElement(gridd,10000);

		//select Check box
		cf.selectElement(getHolidayCheckBx(editHolidayName),3000);

		//Select edit Icon
		cf.selectElement(editIcon,3000);
		
		cf.waitforElement(nameTxtBx,10000);
		//Enter Holiday Name
		cf.setValue(nameTxtBx, holidayName,3000);
		//enter date
		cf.setValue(startDateTxtBx, startDate,3000);
		//Enter Date
		cf.setValue(endDateTxtBx, endDate,3000);
		//Select from Apply To drop down
		cf.SelectCombobyVisibleText(applyToTxtBx, applyTo,3000);
		if(applyTo=="All")
		{
		//Add Remarks
		cf.setValue(remarksTxtBx, Remarks,3000);
		}
		else if(applyTo=="Selected")
		{
			cf.waitforElement(departmentCmb,20000); 
			cf.selectElement(departmentCmb,3000); 
			cf.setValue(departmentCmb, Department, 3000);

			cf.waitforElement(designationCmb,20000);
			cf.selectElement(designationCmb, 3000); 
			cf.setValue(designationCmb,Designation, 3000);
			cf.setValue(remarksTxtBx, Remarks,3000);
		}
		
		//Click on save button
		cf.selectElement(saveBtn,3000);
		}
	}
	
	public void changeStatus(String holidayName) throws Throwable {
		cf.waitforElement(holidayHdr,10000);

		if (cf.iselementExists(holidayHdr,3000)==true)
		{
			cf.waitforElement(grid,10000);

			cf.selectElement(PageNum, 3000);
			cf.selectElement(all, 3000);
			cf.waitforElement(grid,10000);
			String status = velidataStatus(holidayName).getText();
			if(status=="Active")
			{
			//select Check box
			cf.selectElement(getHolidayCheckBx(holidayName),3000);    //Select Disable Icon
			cf.selectElement(disableIcon,3000);
			//Click on OK button
			cf.selectElement(okBtn,3000);
			cf.waitforElement(grid,10000);
			}
		
			else {
			//select Check box
			cf.selectElement(getHolidayCheckBx(holidayName),3000);    //Select Disable Icon
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
			System.out.println("----------Holidays Test Script-001----------");
			cf.waitforElement(grid,3000);
			System.out.println("                           -----Success-----                           ");
			System.out.println("-----------------------------------------------------------------------");
			return true;	
		}
		
		else
		{
			System.out.println("----------Holidays Test Script-001----------");
			System.out.println(errorTag.getText());
			System.out.println(bottomErr.getText());
			System.out.println("Holiday is not Added");
			System.out.println("                          -----Failed-----                             ");
			System.out.println("-----------------------------------------------------------------------");
			return false;
		}
		
	}
	@FindBy(xpath="//button[text()='Ok']")
	public
	WebElement disbaleOkButton;
	
	@FindBy(xpath="//p[text()='Do you really want to Inactive ?']")
	public
	WebElement inActiveHdr;
	
	@FindBy(xpath="//p[text()='Confirm Active ?']")
	public
	WebElement activeHdr;
	
	@SuppressWarnings("unlikely-arg-type")
	public void disable(String EditedHoliday) throws Throwable
	{
		getholidayCheckBx(EditedHoliday).click();
		cf.selectElement(disableIcon, 3000);
		Thread.sleep(3000);
		if(equals(activeHdr)==true)
		{
			cf.selectElement(disbaleOkButton, 3000);
			cf.waitforElement(holidayHdr, 3000);
			System.out.println("----------Successfully Inactive------------");
			Thread.sleep(3000);
		}	
		
		else 
		{
			Thread.sleep(3000);
			cf.selectElement(okBtn, 3000);
			cf.waitforElement(holidayHdr, 3000);
			Thread.sleep(3000);
		}
	}
	
	
	public WebElement getholidayCheckBx(String holidayName) {
		return driver.findElement(By.xpath("//span[text()='"+holidayName+"']/../../preceding-sibling::td[1]/div/label")); 
	}
	

}
