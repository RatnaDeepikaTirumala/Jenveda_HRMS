package com.MSME.HRMS.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MSME.HRMS.Base.BaseClass;

public class ClaimSetUpPage1 extends BaseClass {
	
	@FindBy(xpath = "//h4[text()='Master Screen Settings']")
	 @CacheLookup
	 public WebElement masterScreenSettingsIcon;

	@FindBy(xpath = "//span[@class='icon md claimsetup']")
	@CacheLookup
	public WebElement claimSetUpIcon;

	@FindBy(xpath = "//span[@class='icon add-permission c-pointer  pulse']")
	public WebElement addIcon;
	//span[@class='icon add-permission c-pointer  pulse']

	@FindBy(xpath = "//a[.='Claim Setup']")
	public WebElement claimSetUpHdr;  

	@FindBy(xpath = "//div[@class='k-widget k-grid']")
	@CacheLookup
	public WebElement grid;

	@FindBy(xpath = "//a[text()='create']")
	public WebElement createClaimHdr;

	@FindBy(xpath = "//input[@name='name']")
	public WebElement nameTxtBx;

	@FindBy(xpath = "//input[@id='amount']")
	public WebElement amountTxtBx;

	@FindBy(xpath = "//input[@id='limitPerClaim']")
	public WebElement limitPerClaimTxtBx;

	@FindBy(xpath = "//select[@name='frequencyLimit']")
	public WebElement frequencyLimitDrpDwn;

	@FindBy(xpath = "//option[text()='Monthly']")
	public WebElement frequencyLimitDropDwn;

	@FindBy(xpath = "//input[@id='frequencyLimitNo']")
	public WebElement frequencyLimitTxtBx;

	@FindBy(xpath = "//textarea[@id='description']")
	public WebElement descriptionTxtArea;

	@FindBy(xpath = "//h4[text()='Entitlement']")
	public WebElement entitlementHdr;

	@FindBy(xpath = "//label[@class='mr-1']")
	public WebElement resetCheckBx;

	@FindBy(xpath = "//label[text()='Reset']")
	public WebElement resetTxt;

	@FindBy(xpath = "//select[@name='resetType']")
	public WebElement cmbReset;

	@FindBy(xpath = "//h1[@class='head-title']")
	public WebElement applicableTxt;

	@FindBy(xpath = "//select[@name='applyTo']")
	public WebElement applyToDrpDwn;

	@FindBy(xpath = "//button[text()=' Cancel']")
	public WebElement cancelBtn;

	@FindBy(xpath = "//span[@class='icon check']")
	public WebElement saveBtn;
	
	@FindBy(xpath = "//input[@name='resetDate']")
	public WebElement on;

	@FindBy(xpath = "//div[contains(@class,'error-msg')]")
	public WebElement errMsg;

	@FindBy(xpath = "//span[@class='icon edit-permission c-pointer  pulse']")
	public WebElement editIcon;

	@FindBy(xpath = "//input[@id='react-select-2-input']")
	public WebElement departmentsDrpDwn;

	@FindBy(xpath = "//input[@id='react-select-3-input']")
	public WebElement designationDrpDwn;

	@FindBy(xpath = "//input[@id='react-select-4-input']")
	public WebElement employeeDrpDwn;

	@FindBy(xpath = "(//label[@class='text-center custom-checkbox'])[1]")
	public WebElement chkBox;

	@FindBy(xpath = "//span[contains(@class, 'icon disable')]")
	public WebElement disableIcon;

	@FindBy(xpath = "//button[text()='Ok']")
	public WebElement okBtn;

	@FindBy(xpath="//div[contains(@class,'err')]")
	@CacheLookup
	public WebElement errorTag;

	@FindBy(xpath="(//span[contains(@class,'k-icon k-i-more-vertical')])[1]")
	@CacheLookup
	public
	WebElement menuIcon;

	@FindBy(xpath=" //div[.='Filter']")
	@CacheLookup
	public
	WebElement txtFilter;

	@FindBy(xpath=" //span[text()='Contains']")
	@CacheLookup
	public
	WebElement txtContains;

	@FindBy(xpath="//li[text()='Is equal to']")
	@CacheLookup
	public
	WebElement txtIsEqualsTo;

	@FindBy(xpath="(//input[@class='k-textbox'])[1]")
	@CacheLookup
	public
	WebElement filterTxtBx;

	@FindBy(xpath=" //button[text()='Filter']")
	@CacheLookup
	public
	WebElement filterBtn;
	@FindBy(xpath="//h4[text()='Entitlement']")
	@CacheLookup
	public
	WebElement entitlementHdrCS;

	@FindBy(xpath="//table[@class='k-grid-table']")
	@CacheLookup
	public WebElement gridd;

	@FindBy(xpath="//span[@class='k-dropdown-wrap']")
	@CacheLookup
	public WebElement PageNum;

	@FindBy(xpath="//li[text()='All']")
	@CacheLookup
	public WebElement all;

	@FindBy(xpath="//div[@class='css-8mmkcg']")
	@CacheLookup
	public WebElement removeButton;

	@FindBy(xpath="//button[text()='Confirm']")
	@CacheLookup
	public WebElement confirmBtn;
	
	//Initializing the Page Objects
		public ClaimSetUpPage1() {
			PageFactory.initElements(driver, this);
		}
		
	public void clickOnClaimSetUp() throws Throwable {
		Actions act = new Actions(driver);
		act.moveToElement(masterScreenSettingsIcon).perform();
		Thread.sleep(3000);
		claimSetUpIcon.click();
		
		
	}
	
	public boolean verifyClaimSetUpTitle() throws Throwable {
		Actions act = new Actions(driver);
		act.moveToElement(masterScreenSettingsIcon).perform();
		Thread.sleep(3000);
		claimSetUpIcon.click();
		return claimSetUpHdr.isDisplayed();
		
	}

}


