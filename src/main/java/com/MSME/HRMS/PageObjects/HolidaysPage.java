package com.MSME.HRMS.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MSME.HRMS.Base.BaseClass;

public class HolidaysPage extends BaseClass {

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
	@CacheLookup
	public WebElement applyToTxtBx;

	@FindBy(xpath="//textarea[@name='remarks']")
	@CacheLookup
	public WebElement remarksTxtBx;

	@FindBy(xpath="//button[text()=' Cancel']")
	@CacheLookup
	public WebElement cancelBtn;

	@FindBy(xpath="//button[text()='Save']")
	@CacheLookup
	public WebElement saveBtn;

	@FindBy(xpath = "//div[contains(@class,'error-msg')]")
	@CacheLookup
	public WebElement errMsg;

	@FindBy(xpath="(//div[@class='text-center'])[1]")
	@CacheLookup
	public WebElement checkBx;

	@FindBy(xpath = "//span[@class='icon disable-permission c-pointer  pulse']")
	@CacheLookup
	public WebElement disableIcon;

	@FindBy(xpath = "//p[text()='Do you really want to Inactive ?']")
	@CacheLookup
	public WebElement confirmTxt;

	@FindBy(xpath = "//button[text()='Ok']")
	@CacheLookup
	public WebElement okBtn;
	
	
	public HolidaysPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifiyHolidayHeader()
	{
		return holidayHdr.isDisplayed();
	}
	
	
	public boolean clickOnAdd()
	{
		addIcon.click();
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
