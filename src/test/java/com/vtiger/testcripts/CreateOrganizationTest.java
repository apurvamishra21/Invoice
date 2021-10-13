package com.vtiger.testcripts;

import java.io.IOException;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.ElementRepository.Home;
import com.vtiger.ElementRepository.Login;
import com.vtiger.ElementRepository.OrganizationInformationPage;
import com.vtiger.ElementRepository.OrganizationsPage;
import com.vtiger.genericLib.BaseClass;
import com.vtiger.genericLib.Retry;

@Listeners(com.vtiger.genericLib.ListenerImplementation.class)
public class CreateOrganizationTest extends BaseClass{
	
	//testNG group execution
	/*@Test(groups = {"smoke" , "system"})
	public void organization() throws EncryptedDocumentException, IOException, InterruptedException {
		
		Home hm=new Home(driver);
		hm.getOrganizationLink().click();
		
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getOrganizationBtn().click();
		
		//double num = Math.random();
//		Random r = new Random();
//		int num = r.nextInt();
		
		
		String organizationName = du.getDataFromExcel("Invoice", 8, 3) + jc.generateRandomData();
		
		op.getOrganizationName().sendKeys(organizationName);
	
		op.getSave().click();
		
		OrganizationInformationPage oip = new OrganizationInformationPage(driver); 
		
		String actual = oip.getOrganizationHeaderInformation().getText();
		String expected = organizationName;
		Assert.assertTrue(actual.contains(expected));*/
		
		
	//normal execution
	@Test(retryAnalyzer = Retry.class)
	public void organization() throws EncryptedDocumentException, IOException, InterruptedException {
		
		Home hm=new Home(driver);
		hm.getOrganizationLink().click();
		
		OrganizationsPage op = new OrganizationsPage(driver);
		op.getOrganizationBtn().click();
		
		//double num = Math.random();
//		Random r = new Random();
//		int num = r.nextInt();
		
		
		String organizationName = du.getDataFromExcel("Invoice", 8, 3) + jc.generateRandomData();
		
		op.getOrganizationName().sendKeys(organizationName);
	
		op.getSave().click();
		
		OrganizationInformationPage oip = new OrganizationInformationPage(driver); 
		
		String actual = oip.getOrganizationHeaderInformation().getText();
		String expected = organizationName;
		Assert.assertTrue(actual.contains(expected));
		//Thread.sleep(3000);
		


	}
}
