package com.SwadeshMart.Utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	public static String captureScreenShot(WebDriver driver) {
		String  screenshotpath=System.getProperty("user.dir")+"/Screenshots/LogInCRM_"+getcurrentDateTime()+".jpeg";
		File scr = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(scr, new File(screenshotpath));
			System.out.println("Screenshot captured");
		} catch (IOException e) {
			System.out.println("Unable to capture Screenshot" + e.getMessage());
		}
		return screenshotpath;
	}

	public static String getcurrentDateTime() {
		DateFormat datetimeformat = new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return datetimeformat.format(currentDate);
	}
}
