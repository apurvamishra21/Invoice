package com.vtiger.testcripts;

import java.io.IOException;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.ElementRepository.CreateNewInvoice;
import com.vtiger.ElementRepository.Home;
import com.vtiger.ElementRepository.InvoiceInformationPage;
import com.vtiger.ElementRepository.InvoicePage;
import com.vtiger.ElementRepository.OrganizationsPage;
import com.vtiger.genericLib.BaseClass;
import com.vtiger.genericLib.Retry;
import com.vtiger.genericLib.WebDriverCommonUtils;

@Listeners(com.vtiger.genericLib.ListenerImplementation.class)
public class CreateInvoiceTest extends BaseClass{
	
	/*//testNGgroup execution
	@Test(groups = {"smoke"})
	public void Invoice() throws  IOException
	{
	//	String mainId = driver.getWindowHandle();
		Home hm=new Home(driver);
	//	WebElement moreDD = hm.getMoreDD();
		
		
		wc.mouseOverOnElement(driver, hm.getMoreDD());
		
		//WebElement moreDD=driver.findElement(By.linkText("More"));
//		Actions act = new Actions(driver);
//		act.moveToElement(moreDD).perform();
		
		
		hm.getInvoiceLink().click();
		//driver.findElement(By.linkText("Invoice")).click();
		
		InvoicePage ip=new InvoicePage(driver);
		ip.getCreateInvoiceBtn().click();
//		driver.findElement(By.cssSelector("img[title='Create Invoice...']")).click();
//		System.out.println(du.getDataFromExcel("Invoice", 1, 1));
		
		InvoiceInformationPage iip = new InvoiceInformationPage(driver);
		System.out.println(du.getDataFromExcel("Invoice", 1, 3));
		iip.getSubject().sendKeys(du.getDataFromExcel("Invoice", 1, 3));
		//driver.findElement(By.name("subject")).sendKeys(du.getDataFromExcel("Invoice", 1, 3));
		
		iip.getOrganizationBtn().click();
		//driver.findElement(By.xpath("//input[@id='single_accountid']/following-sibling::img")).click();
		//String mainId = driver.getWindowHandle();
//		Set<String> allId=driver.getWindowHandles();
//		
//		for(String id : allId)
//		{
//			if(!mainId.equals(id))
//			{
//				driver.switchTo().window(id);
//			}
//		}
		wc.switchToChildWindow(driver);
		
		OrganizationsPage op=new  OrganizationsPage(driver);
		op.getFirstOrganization().click();
		//driver.findElement(By.xpath("//form[@name='selectall']/table[1]//table//tr[2]/td[1]/a")).click();
		
//		Alert alt=driver.switchTo().alert();
//		System.out.println(alt.getText());
//		alt.accept();
		
		wc.acceptAlert(driver);
		
		//driver.switchTo().window(mainId);
		wc.switchToMainWindow(driver);
		CreateNewInvoice cn=new CreateNewInvoice(driver);
		cn.getBillStreetAdd().sendKeys(du.getDataFromExcel("Invoice", 2, 3));
		//driver.findElement(By.name("bill_street")).sendKeys(du.getDataFromExcel("Invoice", 2, 3));
		
		cn.getProductBtn().click();
		//driver.findElement(By.id("searchIcon1")).click();
		
		//String mainId1 = driver.getWindowHandle();
//		Set<String> allId1=driver.getWindowHandles();
//		
//		for(String id : allId1)
//		{
//			if(!mainId.equals(id))
//			{
//				driver.switchTo().window(id);
//			}
//		}
		wc.switchToChildWindow(driver);
		
		cn.getFirstProductName().click();
		//driver.findElement(By.xpath("//form[@name='selectall']/table[1]//table//tr[2]/td[2]/a")).click();
		
		//driver.switchTo().window(mainId);
		wc.switchToMainWindow(driver);
		
		cn.getQty().sendKeys(du.getDataFromExcel("Invoice", 3, 3));
		//driver.findElement(By.id("qty1")).sendKeys(du.getDataFromExcel("Invoice", 3, 3));
		
		cn.getSave().click();
		//driver.findElement(By.cssSelector("input.crmbutton.small.save")).click();
		
		
		//String invoiceinfomsg = iip.getHeaderInformation().getText();
		String actual = iip.getHeaderInformation().getText();
		//String invoiceinfomsg = driver.findElement(By.className("lvtHeaderText")).getText();
		String expected = du.getDataFromExcel("Invoice", 5, 3);
		
		Assert.assertTrue(actual.contains(expected));
//		if(invoiceinfomsg.contains(du.getDataFromExcel("Invoice", 5, 3)))
//		{
//			System.out.println("Invoice created successfully");
//		}else {
//			System.out.println("Invoice not created successfully");
//		}
		
		
	}*/
	
	
	
	



	
	
	
	
	//original TestScript
	
	@Test(retryAnalyzer = Retry.class)
	public void Invoice() throws  IOException
	{
	//	String mainId = driver.getWindowHandle();
		Home hm=new Home(driver);
	//	WebElement moreDD = hm.getMoreDD();
		
		
		wc.mouseOverOnElement(driver, hm.getMoreDD());
		
		//WebElement moreDD=driver.findElement(By.linkText("More"));
//		Actions act = new Actions(driver);
//		act.moveToElement(moreDD).perform();
		
		
		hm.getInvoiceLink().click();
		//driver.findElement(By.linkText("Invoice")).click();
		
		InvoicePage ip=new InvoicePage(driver);
		ip.getCreateInvoiceBtn().click();
//		driver.findElement(By.cssSelector("img[title='Create Invoice...']")).click();
//		System.out.println(du.getDataFromExcel("Invoice", 1, 1));
		
		InvoiceInformationPage iip = new InvoiceInformationPage(driver);
		System.out.println(du.getDataFromExcel("Invoice", 1, 3));
		iip.getSubject().sendKeys(du.getDataFromExcel("Invoice", 1, 3));
		//driver.findElement(By.name("subject")).sendKeys(du.getDataFromExcel("Invoice", 1, 3));
		
		iip.getOrganizationBtn().click();
		//driver.findElement(By.xpath("//input[@id='single_accountid']/following-sibling::img")).click();
		//String mainId = driver.getWindowHandle();
//		Set<String> allId=driver.getWindowHandles();
//		
//		for(String id : allId)
//		{
//			if(!mainId.equals(id))
//			{
//				driver.switchTo().window(id);
//			}
//		}
		wc.switchToChildWindow(driver);
		
		OrganizationsPage op=new  OrganizationsPage(driver);
		op.getFirstOrganization().click();
		//driver.findElement(By.xpath("//form[@name='selectall']/table[1]//table//tr[2]/td[1]/a")).click();
		
//		Alert alt=driver.switchTo().alert();
//		System.out.println(alt.getText());
//		alt.accept();
		
		wc.acceptAlert(driver);
		
		//driver.switchTo().window(mainId);
		wc.switchToMainWindow(driver);
		CreateNewInvoice cn=new CreateNewInvoice(driver);
		cn.getBillStreetAdd().sendKeys(du.getDataFromExcel("Invoice", 2, 3));
		//driver.findElement(By.name("bill_street")).sendKeys(du.getDataFromExcel("Invoice", 2, 3));
		
		cn.getProductBtn().click();
		//driver.findElement(By.id("searchIcon1")).click();
		
		//String mainId1 = driver.getWindowHandle();
//		Set<String> allId1=driver.getWindowHandles();
//		
//		for(String id : allId1)
//		{
//			if(!mainId.equals(id))
//			{
//				driver.switchTo().window(id);
//			}
//		}
		wc.switchToChildWindow(driver);
		
		cn.getFirstProductName().click();
		//driver.findElement(By.xpath("//form[@name='selectall']/table[1]//table//tr[2]/td[2]/a")).click();
		
		//driver.switchTo().window(mainId);
		wc.switchToMainWindow(driver);
		
		cn.getQty().sendKeys(du.getDataFromExcel("Invoice", 3, 3));
		//driver.findElement(By.id("qty1")).sendKeys(du.getDataFromExcel("Invoice", 3, 3));
		
		cn.getSave().click();
		//driver.findElement(By.cssSelector("input.crmbutton.small.save")).click();
		
		
		//String invoiceinfomsg = iip.getHeaderInformation().getText();
		String actual = iip.getHeaderInformation().getText();
		//String invoiceinfomsg = driver.findElement(By.className("lvtHeaderText")).getText();
		String expected = du.getDataFromExcel("Invoice", 5, 3);
		
		Assert.assertTrue(actual.contains(expected));
//		if(invoiceinfomsg.contains(du.getDataFromExcel("Invoice", 5, 3)))
//		{
//			System.out.println("Invoice created successfully");
//		}else {
//			System.out.println("Invoice not created successfully");
//		}
		
		
	}
}
	
	
	
	


