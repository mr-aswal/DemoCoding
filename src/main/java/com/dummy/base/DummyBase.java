package com.dummy.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DummyBase {
	//this is test
	public static WebDriver driver;
	public static Properties prop;
	
	
	public  DummyBase()
	{
		//this is test only
		try {
		
			FileInputStream in= new FileInputStream("F:\\my workspace\\com.dummy.maven\\src\\main\\java\\com\\dummy\\config\\config.properties");
			prop.load(in);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
			
	}
	
	public void initialization()
	{
		System.setProperty(prop.getProperty("systemprop1"), prop.getProperty("systemprop2"));
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			
			driver.manage().window().maximize();
		}
	}
}
