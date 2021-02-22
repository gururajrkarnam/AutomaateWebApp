package resources;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
WebDriver driver;
	
	public Home(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Dashboard')]") 
	WebElement Dashboard;
	
	
	


	public WebElement Dashboard() {
		// TODO Auto-generated method stub
		return Dashboard;
	}
	

}

