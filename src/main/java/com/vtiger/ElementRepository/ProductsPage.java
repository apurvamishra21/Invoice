package com.vtiger.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericLib.BaseClass;

public class ProductsPage  {
	
	public ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//form[@name='selectall']/table[1]//table//tr[2]/td[2]/a")
	private WebElement firstProductName;
	
	public WebElement getFirstProductName()
	{
		return firstProductName;
	}

}
