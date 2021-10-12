package com.vtiger.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericLib.BaseClass;

public class OrganizationsPage {
	
	public OrganizationsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="img[title='Create Organization...']")
	private WebElement organizationBtn;
	
	@FindBy(name="accountname")	
	private WebElement organizationName;
	
	
	@FindBy(xpath="//form[@name='selectall']/table[1]//table//tr[2]/td[1]/a")
	private WebElement firstOrganization;
	
	@FindBy(css = "input.crmbutton.small.save")
	private WebElement save;
	
	public WebElement getOrganizationBtn() {
		return organizationBtn;
	}
	
	public WebElement getOrganizationName() {
		return organizationName;
	}
	
	public WebElement getFirstOrganization() {
		return firstOrganization;
	}
	public WebElement getSave()
	{
		return save;
	}
	
	

}
