package tests;

import resources.Base;

import java.io.IOException;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.time.Duration;

import resources.Base;
import resources.Login;
import resources.suspend;

public class suspend_func extends Base {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openApplication() throws IOException {
		
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void suspend() throws IOException, InterruptedException {
	
	suspend suspendPage = new suspend(driver);
	
	suspendPage.username_field().sendKeys((prop.getProperty("username")));
	suspendPage.password_field().sendKeys(prop.getProperty("password"));
	suspendPage.login_button().click();
	
	suspendPage.select_field().click();
//	suspendPage.select_textfield().sendKeys("Account Number");
	
	//*[@id="select2-searchType-result-u34f-ACCOUNT_NUMBER"]
	
	
		
		String value = "Account Number";
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		suspendPage.search_textfield().sendKeys(value, Keys.ENTER);
		
		
		
		suspendPage.search_accfield().sendKeys(prop.getProperty("Account_Number"));  //1111112755
		
		driver.findElement(By.xpath("//i[@class=\"mdi mdi-magnify\"]")).click();
		
		try {
			//Boolean isPresent = driver.findElements(By.yourLocator).size() > 0
		//	boolean element = driver.findElement(By.xpath("//tbody/tr[1]/td[8]")).isDisplayed();
			if (driver.findElements(By.xpath("//tbody/tr[1]/td[8]")).size()>0)
			{
			
			System.out.println("record found");
			}
			else
			{
				System.out.println("No record found");
			}
		}
			catch (NoSuchElementException e) {
		//	throw new RuntimeException("there is no such record found");
				System.out.println("Exception! - No such record found, Exception: " + e.toString()); //prints the exception
			    throw e;
			}    
	
		}
			   
}
		
	
		  
	//	String innerText = driver.findElement(
	//			By.xpath("//td[contains(text(),'No matching records found')]")).getText(); 	
	//	        System.out.println(innerText); 
		      
		     
		
		
	
		
	

	
	 
	
	
	
	




