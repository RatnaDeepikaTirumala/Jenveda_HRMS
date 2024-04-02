package com.MSME.HRMS.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MSME.HRMS.Base.BaseClass;

public class LoginPage extends BaseClass {

	//PageFactory or Object Repository
	
	@FindBy(xpath = "//img[@class='ms-2']")
	public
	WebElement Logo;
	
	@FindBy(xpath = "//a[text()='switch']")
	public
	WebElement btnSwitch;

	@FindBy(xpath = "//input[@class='form-control ']")
	public
	WebElement txtTenent;

	@FindBy(xpath = "//span[text()='Save']")
	public
	WebElement btnSavetenant;

	@FindBy(xpath = "//input[@name='LoginInput.UserNameOrEmailAddress']")
	public
	WebElement txtusername;

	@FindBy(xpath = "//input[@id='LoginInput_Password']")
	public
	WebElement txtpassword;

	@FindBy(xpath = "//button[@value='Login']")
	public
	WebElement btnlogin;

	@FindBy(xpath="//span[text()='MSME']")
	public
	WebElement homepageheader;

	@FindBy(xpath = "//div[@role='alert']")
	public
	WebElement errorTag;
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPageTitle() throws InterruptedException {
		Thread.sleep(3000);
		return driver.getTitle();
	}
	
	public boolean validateLogo() throws InterruptedException {
		Thread.sleep(3000);
		return Logo.isDisplayed();
	}
	
	public HomePage Login(String Tname, String Uname,String Psw) throws InterruptedException {
		
		btnSwitch.click();
		txtTenent.sendKeys(Tname);
		Thread.sleep(3000);
		btnSavetenant.click();
		Thread.sleep(3000);
		txtusername.sendKeys(Uname);
		Thread.sleep(3000);
		txtpassword.sendKeys(Psw);
		Thread.sleep(3000);
		btnlogin.click();
		
		return new HomePage();
		
	}

}
