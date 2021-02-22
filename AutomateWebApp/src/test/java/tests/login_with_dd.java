package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.Home;
import resources.Login;

import resources.Base;

public class login_with_dd extends Base {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openApplication() throws IOException {
		
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test(dataProvider="getLoginData")
	public void login(String email,String password,String expectedResult) throws IOException, InterruptedException {
		
		
		
		Thread.sleep(3000);
	
		Login login = new Login(driver);
		login.username_field().sendKeys(email);
		login.password_field().sendKeys(password);
		login.login_button().click();
		
		Home home = new Home(driver);
		
		String acutualResult = null;
		
		try {
			
			if(home.Dashboard().isDisplayed()) {
			   acutualResult = "Success";
			}
			
		}catch(Exception e) {
			
			acutualResult = "Failure";
			
		}
		
		Assert.assertEquals(acutualResult,expectedResult);
		
	}
	
	@AfterMethod
	public void closure() {
		
		driver.close();
		
	}
	
	@DataProvider
	public Object[][] getLoginData() {
		
		Object[][] data = {{"abc","123","Success"},{"dummy@test.com","1234","Failure"}};
		
		return data;
		
	}
	

}