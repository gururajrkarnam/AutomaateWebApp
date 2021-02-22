package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
WebDriver driver;
	
	public Login(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//input[@id='username']") 
	WebElement username_field;
	
	@FindBy(xpath="//input[@id='password']")   
	WebElement password_field;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")     //button[contains(text(),'Login')] 
	WebElement login_button;
	
	public WebElement username_field(){
		
		return username_field;
		
	}
	
	public WebElement password_field(){
		
		return password_field;
		
	}
	
	
	public WebElement login_button() {
		
		return login_button;
		
	}

}
