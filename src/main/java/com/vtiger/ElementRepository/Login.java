package com.vtiger.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericLib.BaseClass;

public class Login  {
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="user_name")
	private WebElement usernameTB;
	
	@FindBy(name="user_password")
	private WebElement passwordTB;
	
	@FindBy(id="submitButton")
	private WebElement loginBtn;
	
	@FindBy(xpath="//div[contains(text(),'You must specify a valid')]")
	private WebElement errorMsg;
	
	public WebElement getUsernameTB() {
		return usernameTB;
	}
	
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public WebElement getErrorMsg() {
		return errorMsg;
	}
	
	public void loginToApp(String username,String password) {
		
		getUsernameTB().sendKeys(username);
		getPasswordTB().sendKeys(password);
		getLoginBtn().click();
	}

}
