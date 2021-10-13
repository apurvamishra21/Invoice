package com.vtiger.genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.vtiger.ElementRepository.Home;
import com.vtiger.ElementRepository.Login;

public class BaseClass {
	
	public WebDriver driver;
	public DataUtility du=new DataUtility();
	public static WebDriver monitorDriver;
	public WebDriverCommonUtils wc = new WebDriverCommonUtils();
	public JavaCommonUtils jc = new JavaCommonUtils();
	
	
	/*@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(String browser) throws IOException
	{
		if(browser.equals("chrome")) {
			System.out.println("chrome browser launch");
			System.setProperty(DataConstants.CHROMEKEY, DataConstants.CHROMEVALUE);
			driver=new ChromeDriver();
			
			
		}else if(browser.equals("Firefox")) {
			
			System.out.println("firefox browser launch");
			System.setProperty(DataConstants.FIREFOXKEY, DataConstants.FIREFOXVALUE);
			driver=new FirefoxDriver();
		
		}else if(browser.equals("Edge")) {
			
			System.out.println("msedge browser launch");
			System.setProperty(DataConstants.EDGEKEY, DataConstants.EDGEVALUE);
			driver=new EdgeDriver();
			
		}
		
		monitorDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}*/
	
	@BeforeClass(alwaysRun = true)
	public void launchBrowser()
	{
		System.out.println("Browser launch");
		System.setProperty(DataConstants.CHROMEKEY, DataConstants.CHROMEVALUE);
		driver=new ChromeDriver();
		monitorDriver=driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException
	{
		System.out.println("Login to App");
		driver.get(du.getDataFromProperty("Url"));
		
		Login l=new Login(driver);
		l.getUsernameTB().sendKeys(du.getDataFromProperty("User_Name"));
//		driver.findElement(By.name("user_name")).sendKeys(du.getDataFromProperty("User_Name"));
		
		l.getPasswordTB().sendKeys(du.getDataFromProperty("Password"));
//		driver.findElement(By.name("user_password")).sendKeys(du.getDataFromProperty("Password"));
//		driver.findElement(By.id("submitButton")).click();
		l.getLoginBtn().click();
		
	}
	@AfterMethod(alwaysRun = true)
	public void logout()
	{
		System.out.println("Logout to App");
		
		Home hm=new Home(driver);
		//WebElement signOutDD=driver.findElement(By.xpath("span[text()=' Administrator']/../following-sibling::td[1]/img"));
		
		wc.mouseOverOnElement(driver, hm.getImgLink());
		hm.getSignOut();
		//driver.findElement(By.linkText("Sign Out")).click();
	}
	@AfterClass(alwaysRun = true)
	public void closeBrowser()
	{
		System.out.println("Browser close");
		driver.quit();
	}
	
	

}
