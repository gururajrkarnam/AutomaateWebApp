package tests;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import resources.Base;
import resources.Login;

public class LoginTest extends Base {
	
	WebDriver driver;
	
	@BeforeMethod
	public void openApplication() throws IOException {
		
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test
	public void login() throws IOException {
		
		
		Login loginPage = new Login(driver);
		
		loginPage.username_field().sendKeys((prop.getProperty("username")));
		loginPage.password_field().sendKeys(prop.getProperty("password"));
		loginPage.login_button().click();
		
		
	}
	@AfterMethod
	public void closure() {
		
		driver.close();
		
	}
	
//	@DataProvider
////	public Object[][] getLoginData() {
//		
//		Object[][] data = {{"arun.selenium@gmail.com","Second@123","Success"},{"dummy@test.com","1234","Failure"}};
		
//		return data;
		
	}

