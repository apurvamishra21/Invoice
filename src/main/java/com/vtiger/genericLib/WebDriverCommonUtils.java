package com.vtiger.genericLib;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverCommonUtils  {
	
	public String mainId;
	public void mouseOverOnElement(WebDriver driver , WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void switchToChildWindow(WebDriver driver)
	{
		mainId = driver.getWindowHandle();
		Set<String> allId=driver.getWindowHandles();
		
		for(String id : allId)
		{
			if(!mainId.equals(id))
			{
				driver.switchTo().window(id);
			}
		}
	}
	
	public void switchToMainWindow(WebDriver driver)
	{
		driver.switchTo().window(mainId);
	}
	
	public void acceptAlert(WebDriver driver)
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}

}
