package com.SwadeshMart.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage {
	WebDriver driver;

	public LogInPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(id = "email")
	WebElement uname;
	@FindBy(id = "pass")
	WebElement pass;
	@FindBy(name = "login")
	WebElement loginbutton;

	public void LogInToCRM(String username, String password) {
		uname.sendKeys(username);
		pass.sendKeys(password);
		loginbutton.click();
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
		
		}
	}

}
