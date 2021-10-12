package com.vtiger.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericLib.BaseClass;

public class CreateNewInvoice {
	
	public CreateNewInvoice(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(name="subject")
	private WebElement subject;
	
	
	@FindBy(xpath="//input[@id='single_accountid']/following-sibling::img")
	private WebElement organizationsBtn;
	
	@FindBy(name="bill_street")
	private WebElement billStreetAdd;
	
	@FindBy(id="qty1")
	private WebElement Qty;
	
	@FindBy(css = "input.crmbutton.small.save")
	private WebElement save;
	
	
	
	@FindBy(id="searchIcon1")
	private WebElement  productBtn;
	
	@FindBy(xpath = "//form[@name='selectall']/table[1]//table//tr[2]/td[2]/a")
	private WebElement firstProductName;
	
	
	
	public WebElement getSubject() {
		return subject;
	}
	
	public WebElement getOrganizationsBtn()
	{
		return organizationsBtn;
	}
	
	public WebElement getBillStreetAdd()
	{
		return billStreetAdd; 
	}
	
	public WebElement getProductBtn()
	{
		return productBtn;
	}
	
	public WebElement getFirstProductName()
	{
		return firstProductName;
	}
	
	public WebElement getQty()
	{
		return Qty;
	}
	
	public WebElement getSave()
	{
		return save;
	}
	
	

}
