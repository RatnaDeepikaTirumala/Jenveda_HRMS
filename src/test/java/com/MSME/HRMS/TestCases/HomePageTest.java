package com.MSME.HRMS.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MSME.HRMS.Base.BaseClass;
import com.MSME.HRMS.PageObjects.HomePage;
import com.MSME.HRMS.PageObjects.LoginPage;

public class HomePageTest extends BaseClass {
	LoginPage loginPage;
	HomePage homePage;

	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
	    loginPage = new LoginPage();	
	    homePage = loginPage.Login(prop.getProperty("tenantname"),prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void verifyHomePageTitleTest() throws InterruptedException {
		String HomePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(HomePageTitle, "Jen veda", "HomePage title not Matched");
		System.out.println("HomePage title is Matched");
	}
	
	@Test
	public void holidayPageTest() throws Throwable {
		
		homePage.clickOnHolidays();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
