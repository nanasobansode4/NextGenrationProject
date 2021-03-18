package com.SwadeshMart.Testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.SwadeshMart.Pages.BaseClass;
import com.SwadeshMart.Pages.LogInPage;

public class LoginTestCRM extends BaseClass {

	@Test
	public void LoginApp() {
		logger = report.createTest("LogIn to CRM");
		LogInPage loginpage = PageFactory.initElements(driver, LogInPage.class);
		logger.info("Starting Application");
		loginpage.LogInToCRM(excel.getStringData(0, 0, 0), excel.getStringData(0, 0, 1));
		logger.pass("LogIn Successfully");
	}

}
