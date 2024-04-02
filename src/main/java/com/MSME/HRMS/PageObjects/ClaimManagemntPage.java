package com.MSME.HRMS.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MSME.HRMS.Base.BaseClass;

public class ClaimManagemntPage extends BaseClass{
	
	ControlFunctionalities cf= new ControlFunctionalities();

	@FindBy(xpath="//a[text()='Claim Management']")
	public WebElement claimMngtHdr;
	
	@FindBy(xpath="//div[@class='k-widget k-grid']")
	public WebElement claimMngtGrid;
	
	@FindBy(xpath="//span[contains(@class,'icon add-permi')]")
	public WebElement addIcon;
	
	@FindBy(xpath="//div[@data-tip='Edit']")
	public WebElement editIcon;
	
	@FindBy(xpath="//div[@data-tip='View']")
	public WebElement viewIcon;
	
	@FindBy(xpath="//span[@class='icon md hamburger cursor-pointer active']")
	public WebElement gridViewIcon;
	
	@FindBy(xpath="//span[@class='icon md menu-icon cursor-pointer']")
	public WebElement menuViewIcon;
	
	@FindBy(xpath="//h1[text()='Apply Claim']")
	public WebElement addPageHdr;
	
	@FindBy(xpath="//h5[text()='Clear Data']")
	public WebElement clearDataLink;
	
	@FindBy(xpath="//select[@name='employeeId']")
	public WebElement empNameCmb;
	
	@FindBy(xpath="//select[@name='claimTypeId']")
	public WebElement claimTypeCmb;
	
	@FindBy(xpath="//select[@name='projectId']")
	public WebElement projectCmb;
	
	@FindBy(xpath="//input[@name='fromDate']")
	public WebElement fromDateTxtbx;
	
	@FindBy(xpath="//input[@name='toDate']")
	public WebElement toDateTxtBx;
	
	@FindBy(xpath="//input[@name='amount']")
	public WebElement amountTxtBx;
	
	@FindBy(xpath="//button[text()='Apply Claim']")
	public WebElement applyBtn;
	
	@FindBy(xpath="//h1[text()='Edit Claim']")
	public WebElement editClaimPageHdr;
	
	@FindBy(xpath="//span[text()='Submitted']")
	public WebElement submittedClaimStateHdr;
	
	@FindBy(xpath="//span[text()='Processed']")
	public WebElement processedStateClaimHdr;
	
	@FindBy(xpath="//span[text()='Cancelled']")
	public WebElement cancelledStateClaimHdr;
	
	@FindBy(xpath="//textarea[@name='remarks']")
	public WebElement remarkstxtBx;
	
	@FindBy(xpath="//button[text()='Cancel Claim']")
	public WebElement cancelClaimBtn;
	
	@FindBy(xpath="//button[text()='Cancel']")
	public WebElement cancelBtn;
	
	@FindBy(xpath="//span[text()='Claim Limit :']/../..//span[2]")
	public WebElement claimLimit;
	
	@FindBy(xpath="//h1[text()='View Claim']")
	public WebElement viewPageHdr;
	
	@FindBy(xpath="//span[@class='k-icon k-i-arrow-s']")
	public WebElement recordPerPageCmb;
	
	@FindBy(xpath="//div[contains(@class,'grid lg:grid-cols-3 xl:grid')]")
	public WebElement menuGrid;
	
	@FindBy(xpath="//button[text()='All']")
	public WebElement allButton;
	
	@FindBy(xpath="//button[text()='Verified']")
	public WebElement verifiedBtn;
	
	@FindBy(xpath="//button[text()='Approved']")
	public WebElement approvedBtn;
	
	@FindBy(xpath="//button[text()='Processed']")
	public WebElement processedBtn;
	
	@FindBy(xpath="//button[text()='Rejected']")
	public WebElement rejectedBtn;
	
	@FindBy(xpath="//input[@placeholder='Enter Employee Name']")
	public WebElement searchBar;
	
	@FindBy(xpath="//p[text()='Verified']/..//h1")
	public WebElement verifiedTab;
	
	@FindBy(xpath="//p[text()='Approved']/..//h1")
	public WebElement approvedTab;
	
	@FindBy(xpath="//p[text()='Processed']/..//h1")
	public WebElement processedTab;
	
	@FindBy(xpath="//p[text()='Rejected']/..//h1")
	public WebElement rejectedTab;
	
	@FindBy(xpath="//div[@class='error-msg flex justify-between align-top mt-2.5 mb-7']']")
	public WebElement errorTag;
	

	
	
	String SubmitClaimState="Submit";
	String CancelClaimState;
	
	public ClaimManagemntPage()
	{
	  PageFactory.initElements(driver, this);
	}
	
	public boolean verifiyClaimMngtHdr() throws Throwable
	{
		Thread.sleep(3000);
		return claimMngtHdr.isDisplayed();
	}
	
	public boolean verifiyGrid() throws InterruptedException
	{
		Thread.sleep(3000);
		return claimMngtGrid.isDisplayed();
	}
	
	public void verifiyError()
	{
		if(errorTag.isDisplayed()==true)
		{
			System.out.println(errorTag.getText());
		}
		else
		{
			System.out.println("---------------No Error Found------------");
			return;
		}
	}
	
	public void addClaimMngt(String employeeName, String claimName, String ProjectName, String fromDate, String toDate, String amount, String Remarks) throws Throwable
	{
		cf.selectElement(addIcon, 3000);
		Thread.sleep(3000);
		if(addPageHdr.isDisplayed()==true)
		{
			cf.setValue(empNameCmb, employeeName, 3000);
			cf.setValue(claimTypeCmb, claimName, 3000);
			Thread.sleep(3000);
			cf.setValue(projectCmb, ProjectName, 3000);
			cf.setValue(fromDateTxtbx, fromDate, 3000);
			Thread.sleep(3000);
			cf.setValue(toDateTxtBx, toDate, 3000);
			cf.setValue(amountTxtBx, amount, 3000);
			Thread.sleep(3000);
            cf.setValue(remarkstxtBx, Remarks, 3000);
            Thread.sleep(3000);
            applyBtn.click();
        	Thread.sleep(3000);
			verifiyError();
			Thread.sleep(3000);
			if(claimMngtHdr.isDisplayed())
			{
				System.out.println("---------------Apply-Claim-Test-Pass--------------");
			}
		}
		
	}
	
	
	
	
	public void editClaim( String editClaimNumber,String fromDate, String toDate, String amount, String Remarks) throws Throwable
	{
		
	    cf.selectElement(allButton, 3000);
	    Thread.sleep(3000);
	    selectClaimMngtCheckBx(editClaimNumber).click();
	    SubmitClaimState=verifiyClaimState(editClaimNumber, 3000).getText();
		if(SubmitClaimState=="Submitted")
		{
			editIcon.click();
			cf.waitforElement(submittedClaimStateHdr, 3000);
			cf.setValue(fromDateTxtbx, fromDate, 3000);
			cf.setValue(toDateTxtBx, toDate, 3000);
			Thread.sleep(3000);
			cf.setValue(amountTxtBx, amount, 3000);
			cf.setValue(remarkstxtBx, Remarks, 3000);
			Thread.sleep(3000);
			applyBtn.click();
			Thread.sleep(3000);
			verifiyError();
			Thread.sleep(2000);
			if(verifiyClaimMngtHdr())
			{
				System.out.println("--------------The Submitted State Claim is Tested------------");
                return;		
			}
		}
		
		 editIcon.click();
		 if (cancelledStateClaimHdr.isDisplayed()==true) 
		{
			Thread.sleep(3000);
			cancelBtn.click();
			Thread.sleep(3000);
		  //  verifiyError();
		   // Thread.sleep(3000);
			if(claimMngtGrid.isDisplayed())
			{
				System.out.println("-----------The Cancelled State Claim is Tested-------------");
	            return;		
			}
		}
		 if (processedStateClaimHdr.isDisplayed()==true)
		 {
			 Thread.sleep(3000);
			 cancelBtn.click();
			 Thread.sleep(3000);
			 verifiyError();
			 if(claimMngtHdr.isDisplayed())
			 {
				 System.out.println("----------The Processed State Claim is Tested-----------");
			     return;
			 }
		 }
	}
	
	
	public WebElement verifiyClaimState(String EditClaimNumber, long timeout)
	{
		return driver.findElement(By.xpath("//td[text()='"+EditClaimNumber+"']/following-sibling::td[7]//div//div//span"));
	}
	
	public WebElement selectClaimMngtCheckBx(String ClaimMngtNumber)
	{
		return driver.findElement(By.xpath("//td[text()='"+ClaimMngtNumber+"']/preceding-sibling::td//div[@class='text-center']"));
		 
	}
}
