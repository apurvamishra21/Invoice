package com.vtiger.ElementRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericLib.BaseClass;

public class InvoicePage {
	
	public InvoicePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(css="img[title='Create Invoice...']")
	private WebElement createInvoiceBtn;
	
	
	@FindBy(xpath = "(//table[@class='lvt small']//tr/td[3])[2]/a")
	 private WebElement firstInvoiceLink;
	
	 @FindBys({
		 @FindBy(xpath="//table[@class='lvt small']//tr/td[3]")
	 })
	 private List<WebElement> listOfInvoicesBeforeDel;
	 
	 @FindBys({
		 @FindBy(xpath = "//table[@class='lvt small']//tr/td[3]")
	 
	 })
	 private List<WebElement> listOfInvoicesAfterDel;
	 
	 public WebElement getFirstInvoiceLink() {
	 return firstInvoiceLink;
	 }
	 
	 public List<WebElement> getListOfInvoicesBeforeDel() {
	 return listOfInvoicesBeforeDel;
	 }
	 
	 public List<WebElement> getListOfInvoicesAfterDel() {
	 return listOfInvoicesAfterDel;
	 }
	 
	 public WebElement getCreateInvoiceBtn() {
			return createInvoiceBtn;
		}
	 
	 
	 

}

