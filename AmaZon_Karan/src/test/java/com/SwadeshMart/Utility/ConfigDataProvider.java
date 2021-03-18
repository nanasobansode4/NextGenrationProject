package com.SwadeshMart.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	Properties pro;

	public ConfigDataProvider() {
		File scr = new File("./Config/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(scr);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Config file not able to load" + e.getMessage());
		}
	}

	public String getDataFromConfig(String keytosearch) {
		return pro.getProperty(keytosearch);
	}

	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	public String getstagingUrl() {
		return pro.getProperty("qaUrl");
	}
}
