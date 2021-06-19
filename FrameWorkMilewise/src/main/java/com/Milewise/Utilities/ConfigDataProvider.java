package com.Milewise.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {

	Properties pro;

	public ConfigDataProvider() {
		File src = new File(
				"C:\\Users\\Vivek\\eclipse-workspace3\\FrameWorkMilewise\\src\\ConfigProperties\\Config.Properties");

		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);

		} catch (Exception e) {

			System.out.println("File not found " + e.getMessage());

		}

	}

	public String getBrowser() {

		return pro.getProperty("BrowserName");
		// BrowserName from .properties file

	}

	public String getUrl() {

		return pro.getProperty("Url");
		// Url from .properties file

	}

}
