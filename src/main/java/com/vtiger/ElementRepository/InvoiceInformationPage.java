package com.vtiger.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericLib.BaseClass;

public class InvoiceInformationPage {

	public InvoiceInformationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='single_accountid']/following-sibling::img")
	private WebElement OrganizationBtn;

	@FindBy(name = "subject")
	private WebElement subject;
	
	@FindBy(name = "Edit")
	private WebElement editBtn;
	
	@FindBy(name = "Delete")
	private WebElement delBtn;
	
	
    @FindBy(className = "lvtHeaderText")
	private WebElement headerInformation;
    
    public WebElement getOrganizationBtn() {
    	return OrganizationBtn;
    }

	public WebElement getEditBtn() {
		return editBtn;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getHeaderInformation() {
		return headerInformation;
	}
	
	public WebElement getDelBtn() {
		return delBtn;
	}
	
	
	


}
