package com.vtiger.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericLib.BaseClass;

public class Home{
	
	public Home(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "More")
	private WebElement moreDD;
	
	@FindBy(xpath="//span[text()=' Administrator']/../following-sibling::td[1]/img")
	private WebElement imgLink;
	
	
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOut;
	
	@FindBy(linkText="Invoice")
	private WebElement invoiceLink;
	
	@FindBy(linkText="Organizations")
	private WebElement organizationLink;
	
	public WebElement getImgLink()
	{
		return imgLink;
	}
	
	public WebElement getSignOut() {
		return signOut;
	}
	
	public WebElement getInvoiceLink() {
		return invoiceLink;
	}
	
	public WebElement getMoreDD() {
		return moreDD;
	}
	
	public WebElement getOrganizationLink() {
		return organizationLink;
	}
	
	

}
