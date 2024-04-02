package com.MSME.HRMS.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MSME.HRMS.Base.BaseClass;

public class ClaimSetUpPage extends BaseClass {
	ControlFunctionalities cf=new ControlFunctionalities();

	@FindBy(xpath="//a[text()='Claim Setup']")
	public
	WebElement claimSetUpHdr;
	
	@FindBy(xpath="//span[@class='icon add-permission c-pointer  pulse']")
	public
	WebElement claimAddIcon;
	
	@FindBy(xpath="//a[text()='create']")
	public
	WebElement createClaimPageHdr;
	
	@FindBy(xpath="//input[@name='name']")
	public
	WebElement nameTxtBx;
	
	@FindBy(xpath="//input[@name='amount']")
	public 
	WebElement amountTxtBx;
	
	@FindBy(xpath="//input[@name='limitPerClaim']")
	WebElement limitPerClaimtxtBx;
	
	@FindBy(xpath="//select[@name='frequencyLimit']")
	WebElement frequnecyCmb;
	
	@FindBy(xpath="//input[@name='frequencyLimitNo']")
	WebElement frequnecyTxtBx;
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement descTxBx;
	
	@FindBy(xpath="//select[@name='resetType']")
	WebElement resetCmb;
	
	@FindBy(xpath="//option[text()='Financial Year-End']")
	WebElement financialYearOption;
	
	@FindBy(xpath="//option[text()='Calender Year-End']")
	WebElement calenderYearOption;
	
	@FindBy(xpath="//input[@type='date']")
	WebElement onDateDisbaleTxtBx;
	
	@FindBy(xpath="//select[@name='applyTo']")
	WebElement applyToCmb;
	
	@FindBy(xpath="//option[text()='All']")
	WebElement allOptionCmb;
	
	@FindBy(xpath="//option[text()='Selected']")
	WebElement selectedOptionCmb;
	
	@FindBy(xpath="//div[text()='Select Departments']")
	WebElement selectDepartmentCmb;
	
	@FindBy(xpath="//div[text()='Select Designations']")
	WebElement selectDesignationCmb;
	
	@FindBy(xpath="//input[@id='react-select-4-input']")
	WebElement employeeCmb;
	
	@FindBy(xpath="//button[text()=' Save']")
	WebElement saveBtn;
	
	@FindBy(xpath="//button[text()=' Cancel']")
	WebElement cancelBtn;
	
	@FindBy(xpath="//p[contains(text(),'Please check and provide')]")
	WebElement mandatoryFieldError;
	
	@FindBy(xpath="//span[text()='+ClaimName+'']")
	WebElement gridAddedClaim;
	
	@FindBy(xpath="//div[@class='error-msg flex justify-between align-top mt-2.5 mb-7']")
	public
	WebElement ErrorTag;
	
	@FindBy(xpath="//span[@class='icon edit-permission c-pointer  pulse']")
	WebElement editClaimIcon;
	
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement conformBtn;
	
	@FindBy(xpath="//select[contains(@class,'cust-select w-full px-3 py-2 b')]")
	WebElement applyToCmbo;
	
	@FindBy(xpath="//a[text()='\"+EditClaimName+\"']\")")
	WebElement editPageHdr;
	
	@FindBy(xpath="//input[@name='resetDate']")
	WebElement resetTimeDisableTxBx;
	
	@FindBy(xpath="//span[@class='icon disable-permission c-pointer  pulse']")
	public 
	WebElement disbaleIcon;
	
	@FindBy(xpath="//p[text()='Confirm Inactive ?']")
	public
	WebElement inactivePopUp;
	
	@FindBy(xpath="//button[text()='Ok']")
	public
	WebElement disbaleOkButton;
	
	@FindBy(xpath="//p[text()='Confirm Active ?']")
	public
	WebElement activePopUp;
	
	@FindBy(xpath="//button[text()='Cancel']")
	WebElement disbaleCancelButton;
	
	
	
	public ClaimSetUpPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyClaimSetUpHdr() throws Throwable
	{
		Thread.sleep(3000);
		return claimSetUpHdr.isDisplayed();
	
	}
	
	/*
	 * public boolean verifycreateClaimSetUpHdr() throws InterruptedException {
	 * Thread.sleep(3000); return createClaimPageHdr.isDisplayed(); }
	 */
	
	
	  public void verifyMandatoryField() throws InterruptedException
	  {
	  if(mandatoryFieldError.isDisplayed()==false) 
	  { 
		  Thread.sleep(3000);
	  claimSetUpHdr.isDisplayed();
	  System.out.println("-------------------------No Mandatory Field Error----------------------------");
	  //System.out.println(mandatoryFieldError.getText());
	  } 
	  else if (mandatoryFieldError.isDisplayed()==true)
	  {
		  System.out.println(mandatoryFieldError.getText());
	  System.out.println("---------------------------------------------------------------------"); 
	  }
	  
	  }
	  
	 	public void verifyError() throws InterruptedException
	{
		
		 if (ErrorTag.isDisplayed()==true) {
			System.out.println(ErrorTag.getText());
			System.out.println("----------------------------------------------------------------");
			return;
		}
		 else
		 {
			 System.out.println("No Error");
			 return;
		 }
		
	}
	 	
		String ClaimName="ClaimNo-77"; 
	 
	public void AddClaimSetUp(String ClaimName1, String Amount1, String Limit1, String FrequnecyCmb1, String FrequencyTxtBX1, String Descprition,String ResetCmb, String ApplyToOption, String SelectedEmp) throws Throwable
	{
		claimAddIcon.click();
		Thread.sleep(3000);
		if(createClaimPageHdr.isDisplayed()==true)
		{
			
			nameTxtBx.sendKeys(ClaimName1);
			Thread.sleep(2000);
			amountTxtBx.sendKeys(Amount1);
			limitPerClaimtxtBx.sendKeys(Limit1);
			frequnecyCmb.sendKeys(FrequnecyCmb1);
			frequnecyTxtBx.sendKeys(FrequencyTxtBX1);
			descTxBx.sendKeys(Descprition);
			cf.SelectCombobyVisibleText(resetCmb,ResetCmb , 3000);
			cf.SelectCombobyVisibleText(applyToCmb, ApplyToOption, 1000);
			if(ApplyToOption=="All")
			{
				saveBtn.click();
			}
			else
			{
			//	   cf.SelectCombobyVisibleText(applyToCmb, ApplyToOption, 3000);	       
			    	cf.setValue(employeeCmb, SelectedEmp, 3000);
			    	resetTimeDisableTxBx.click();
			        Thread.sleep(3000);
			        saveBtn.click();
			}
			verifyError();
			verifyClaimSetUpHdr();
		 }
			
		}
		
	
		/*
		 * public void addClaimSelectedEmployees(String ClaimName, String Amount, String
		 * limit, String FrequnecyCmb, String Days, String Description, String
		 * ApplyToOption, String SelectedEmp) throws Throwable {
		 * 
		 * claimAddIcon.click(); Thread.sleep(3000);
		 * if(createClaimPageHdr.isDisplayed()==true) {
		 * 
		 * nameTxtBx.sendKeys(ClaimName); Thread.sleep(3000);
		 * 
		 * amountTxtBx.sendKeys(Amount); limitPerClaimtxtBx.sendKeys(limit);
		 * //cf.SelectCombobyVisibleText(frequnecyCmb, FrequnecyCmb, 3000); cf.setValue
		 * (frequnecyCmb, FrequnecyCmb, 3000); frequnecyTxtBx.sendKeys(Days);
		 * Thread.sleep(2000); descTxBx.sendKeys(Description);
		 * 
		 * cf.SelectCombobyVisibleText(applyToCmb, ApplyToOption, 3000);
		 * cf.setValue(employeeCmb, SelectedEmp, 3000); resetTimeDisableTxBx.click();
		 * Thread.sleep(3000); saveBtn.click(); Thread.sleep(3000); //
		 * verifyMandatoryField(); verifyError(); claimSetUpHdr.isDisplayed();
		 * 
		 * } }
		 */
	
	
	
	public void editClaimPage(String EditClaimName, String ClaimName, String Amount) throws InterruptedException
	{
		
		getClaimCheckBx(EditClaimName).click();
		editClaimIcon.click();
		cf.setValue(nameTxtBx, ClaimName, 1000);
	cf.setValue(amountTxtBx, Amount, 3000);
	saveBtn.click();
	conformBtn.click();
	//verifyError();
	//verifyMandatoryField();
	Thread.sleep(3000);
	claimSetUpHdr.isDisplayed();
		
	}
	
	public void editClaimPageSelectedEmp(String EditClaimName ,String ClaimName, String Amount, String limit, String FrequnecyCmb, String Days, String Description, String ApplyToOption, String SelectedEmp ) throws InterruptedException
	{
		
		getClaimCheckBx(EditClaimName).click();
		editClaimIcon.click();
		cf.setValue(nameTxtBx, ClaimName, 3000);
	cf.setValue(amountTxtBx, Amount, 3000);
	cf.setValue(limitPerClaimtxtBx, limit, 3000);
	cf.setValue(frequnecyCmb,FrequnecyCmb , 3000);
	cf.setValue(frequnecyTxtBx, Days, 3000);
	cf.setValue(descTxBx, Description, 3000);
    cf.setValue(applyToCmb, ApplyToOption, 3000);
    cf.setValue(employeeCmb,SelectedEmp , 3000);
	saveBtn.click();
	conformBtn.click();
	//verifyError();
	//verifyMandatoryField();
	Thread.sleep(3000);
	claimSetUpHdr.isDisplayed();
		
	}
	
	/*
	 * public WebElement verifyeditPageHdr() { return
	 * driver.findElement(By.xpath("//a[text()='"+EditClaimName+"']"));
	 * 
	 * }
	 */
	
	public void enableClaim(String ClaimName)
	{
		getClaimCheckBx(ClaimName).click();
		disbaleIcon.click();
	}
	
	public void activeClaim(String ClaimName)
	{
		enableClaim(ClaimName);
		if(activePopUp.isDisplayed()==true)
		{
			disbaleOkButton.click();
			System.out.println("-----------------Claim Changed into Active State-----------------");
		}
	}
	
	@FindBy(xpath = "//span[@class='icon disable-permission c-pointer  pulse']")
	@CacheLookup
	public WebElement disableIcon;
	
	@FindBy(xpath="//p[text()='Confirm Active ?']")
	public
	WebElement activeHdr;
	
	@SuppressWarnings("unlikely-arg-type")
	public void disable(String EditedClaimName) throws Throwable
	{
		getClaimCheckBx(EditedClaimName).click();
		cf.selectElement(disableIcon, 3000);
		Thread.sleep(3000);
		if(equals(activeHdr)==true)
		{
			cf.selectElement(disbaleOkButton, 3000);
			cf.waitforElement(claimSetUpHdr, 3000);
			System.out.println("----------Successfully Inactive------------");
			Thread.sleep(3000);
		}	
		else  {
			Thread.sleep(3000);
			cf.selectElement(disbaleOkButton, 3000);
			cf.waitforElement(claimSetUpHdr, 3000);
			Thread.sleep(3000);
		}
	}
	public WebElement verifyEditClaim(String EditClaimName)
	{
		return driver.findElement(By.xpath("//a[text()='"+EditClaimName+"']"));
	}
	public WebElement getClaimCheckBx(String claimName) {
		return driver.findElement(By.xpath("//span[text()='"+claimName+"']/../../preceding-sibling::td[1]/div/label")); 
	}
	
    
}
