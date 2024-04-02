package com.MSME.HRMS.TestCases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MSME.HRMS.Base.BaseClass;
import com.MSME.HRMS.PageObjects.HomePage;
import com.MSME.HRMS.PageObjects.LoginPage;


public class LoginPageTest extends BaseClass {
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
	    loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest() throws InterruptedException {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "HRManagement", "LoginPage title is not Matched");
		System.out.println("LoginPage tile is Matched");
	}
	
	@Test(priority=2)
	public void LogoTest() throws InterruptedException {
		boolean flag = loginPage.validateLogo();
		Assert.assertTrue(flag);
		System.out.println("Logo is present");
	}
	
	@Test(priority=3)
	public void LoginTest() throws InterruptedException {
		Thread.sleep(3000);
		homePage = loginPage.Login(prop.getProperty("tenantname"),prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
