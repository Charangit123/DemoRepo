package com.qa.tests;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Propertiesfile_check {
	 static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
		Properties prop= new Properties();
		FileInputStream ip= new FileInputStream
				("C:\\Users\\user1\\eclipse-workspace\\GitRepo\\src\\test\\testfile.properties");
		prop.load(ip);
		
		String browsername=prop.getProperty("browser");
		String Url= prop.getProperty("URL");
		String useeid=prop.getProperty("Username");
		System.out.println(browsername);
		System.out.println(Url);
		System.out.println(useeid);
		System.out.println(prop.getProperty("login"));
		
		if(browsername.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		else if(browsername.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else if(browsername.equals("IE")) {
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
		}
		driver.get(Url);
		driver.manage().window().maximize();
		driver.findElement(By.id(prop.getProperty("Username"))).sendKeys(prop.getProperty("usename_v"));
		driver.findElement(By.id(prop.getProperty("password"))).sendKeys(prop.getProperty("password_v"));
		driver.findElement(By.xpath(prop.getProperty("login"))).click();
		

	}

}
