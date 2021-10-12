package com.vtiger.testcripts;

import java.io.IOException;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.ElementRepository.Home;
import com.vtiger.ElementRepository.InvoiceInformationPage;
import com.vtiger.ElementRepository.InvoicePage;
import com.vtiger.genericLib.BaseClass;
import com.vtiger.genericLib.Retry;

@Listeners(com.vtiger.genericLib.ListenerImplementation.class)
public class EditInvoiceTest extends BaseClass{
	
	@Test(retryAnalyzer = Retry.class)
	public void editInvoice() throws EncryptedDocumentException, IOException
	{
		
		Home hm=new Home(driver);
	//	WebElement moreDD = hm.getMoreDD();
		
		
		

		//WebElement moreDD=driver.findElement(By.linkText("More"));
//		Actions act = new Actions(driver);
//		act.moveToElement(moreDD).perform();
		wc.mouseOverOnElement(driver, hm.getMoreDD());
		
		hm.getInvoiceLink().click();
		//driver.findElement(By.linkText("Invoice")).click();
		//driver.findElement(By.xpath("(//table[@class='lvt small']//tr/td[3])[2]/a")).click();//ist td is for subject second is for invoice
		
		InvoicePage ip = new InvoicePage(driver);
		ip.getFirstInvoiceLink().click();
		
		InvoiceInformationPage iip = new InvoiceInformationPage(driver) ;
		iip.getEditBtn().click();
		
		//driver.findElement(By.name("Edit")).click();
		iip.getSubject().clear();
		iip.getSubject().sendKeys(du.getDataFromExcel("Invoice", 7, 3),Keys.ENTER);
		//driver.findElement(By.name("subject")).clear();
		//driver.findElement(By.name("subject")).sendKeys(du.getDataFromExcel("Invoice", 7, 3),Keys.ENTER);
		
		
		String actual = iip.getSubject().getAttribute("value");
		String expected = du.getDataFromExcel("Invoice", 7, 3);
		Assert.assertTrue(actual.contains(expected));
//		String sub = driver.findElement(By.name("subject")).getAttribute("value");
//		System.out.println(sub);
//		if (iip.getSubject().getAttribute("value").contains(du.getDataFromExcel("Invoice", 7, 3)))
//		{
//			System.out.println("Invoice edited successfully");
//		}else {
//			System.out.println("Invoice not edited successfully");
//		}
		

		
	}
	
	
}
