package com.vtiger.testcripts;

import java.util.List;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
public class DeleteInvoiceTest extends BaseClass {
	
	/*@Test(groups = {"system"})
	public void deleteInvoice()
	{
		
		Home hm=new Home(driver);
	//	WebElement moreDD = hm.getMoreDD();
		
		//WebElement moreDD=driver.findElement(By.linkText("More"));
//		Actions act = new Actions(driver);
//		act.moveToElement(moreDD).perform();
		wc.mouseOverOnElement(driver, hm.getMoreDD());
		
		hm.getInvoiceLink().click();
		//driver.findElement(By.linkText("Invoice")).click();
		
		InvoicePage ip=new InvoicePage(driver);
		String invoiceName = ip.getFirstInvoiceLink().getText();
		//String invoiceName = driver.findElement(By.xpath("(//table[@class='lvt small']//tr/td[3])[2]/a")).getText();
		
		List<WebElement> allItemsbefdel = ip.getListOfInvoicesBeforeDel();
		//List<WebElement> allItemsbefdel = driver.findElements(By.xpath("//table[@class='lvt small']//tr/td[3]"));
		int countBeforeDelete = 0;
		for (WebElement wb : allItemsbefdel) {
			String s = wb.getText();
			if(invoiceName.equals(s)) {
				countBeforeDelete++;
			}
		}
		
		ip.getFirstInvoiceLink().click();
		//driver.findElement(By.xpath("(//table[@class='lvt small']//tr/td[3])[2]/a")).click();
		InvoiceInformationPage iip = new InvoiceInformationPage(driver) ;
		iip.getDelBtn().click();
		//driver.findElement(By.name("Delete")).click();
		
//		Alert alt=driver.switchTo().alert();
//		System.out.println(alt.getText());
//		alt.accept();
		wc.acceptAlert(driver);

		List<WebElement> allItemsaftdel = ip.getListOfInvoicesAfterDel();
		//List<WebElement> allItemsaftdel=driver.findElements(By.xpath("//table[@class='lvt small']//tr/td[3]"));
		int countAfterDelete = 0;
		for (WebElement wb : allItemsaftdel) {
			String s = wb.getText();
			if(invoiceName.equals(s)) {
				countAfterDelete++;
			}
		}
		int actual = countBeforeDelete;
		int expected = countAfterDelete;
		Assert.assertNotEquals(actual, expected);*/



	@Test(retryAnalyzer = Retry.class)
	public void deleteInvoice()
	{
		
		Home hm=new Home(driver);
	//	WebElement moreDD = hm.getMoreDD();
		
		//WebElement moreDD=driver.findElement(By.linkText("More"));
//		Actions act = new Actions(driver);
//		act.moveToElement(moreDD).perform();
		wc.mouseOverOnElement(driver, hm.getMoreDD());
		
		hm.getInvoiceLink().click();
		//driver.findElement(By.linkText("Invoice")).click();
		
		InvoicePage ip=new InvoicePage(driver);
		String invoiceName = ip.getFirstInvoiceLink().getText();
		//String invoiceName = driver.findElement(By.xpath("(//table[@class='lvt small']//tr/td[3])[2]/a")).getText();
		
		List<WebElement> allItemsbefdel = ip.getListOfInvoicesBeforeDel();
		//List<WebElement> allItemsbefdel = driver.findElements(By.xpath("//table[@class='lvt small']//tr/td[3]"));
		int countBeforeDelete = 0;
		for (WebElement wb : allItemsbefdel) {
			String s = wb.getText();
			if(invoiceName.equals(s)) {
				countBeforeDelete++;
			}
		}
		
		ip.getFirstInvoiceLink().click();
		//driver.findElement(By.xpath("(//table[@class='lvt small']//tr/td[3])[2]/a")).click();
		InvoiceInformationPage iip = new InvoiceInformationPage(driver) ;
		iip.getDelBtn().click();
		//driver.findElement(By.name("Delete")).click();
		
//		Alert alt=driver.switchTo().alert();
//		System.out.println(alt.getText());
//		alt.accept();
		wc.acceptAlert(driver);

		List<WebElement> allItemsaftdel = ip.getListOfInvoicesAfterDel();
		//List<WebElement> allItemsaftdel=driver.findElements(By.xpath("//table[@class='lvt small']//tr/td[3]"));
		int countAfterDelete = 0;
		for (WebElement wb : allItemsaftdel) {
			String s = wb.getText();
			if(invoiceName.equals(s)) {
				countAfterDelete++;
			}
		}
		int actual = countBeforeDelete;
		int expected = countAfterDelete;
		Assert.assertNotEquals(actual, expected);
		
//		if(countBeforeDelete != countAfterDelete )
//		{
//			System.out.println(invoiceName + " deleted successfully");
//		}else {
//			System.out.println(invoiceName +  "not deleted successfully");
//		}
	}
}


