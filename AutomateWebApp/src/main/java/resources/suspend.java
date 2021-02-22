package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class suspend {
	
	WebDriver driver;
	
public suspend(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

@FindBy(xpath="//input[@id='username']") 
WebElement username_field;

@FindBy(xpath="//input[@id='password']")   
WebElement password_field;

@FindBy(xpath="//button[contains(text(),'Login')]")     //button[contains(text(),'Login')] 
WebElement login_button;

@FindBy(xpath="//span[@id='select2-searchType-container']")   
WebElement select_field;

@FindBy(xpath="//*[@id=\\\"mainBody\\\"]/span/span/span[1]/input")   
WebElement select_textfield;

@FindBy(xpath="//span[@class='select2-search select2-search--dropdown']/input[@class='select2-search__field']")   
WebElement search_textfield;

@FindBy(xpath="//td[contains(text(),'No matching records found')]")
public   
WebElement No_data_found;

@FindBy(xpath="//*[@id=\"serachValue\"]")   
WebElement search_accfield;

public WebElement search_accfield(){
	
	return search_accfield;
	
}

public WebElement No_data_found(){
	
	return No_data_found;
	
}

public WebElement search_textfield(){
	
	return search_textfield;
	
}


public WebElement select_textfield(){
	
	return select_textfield;
	
}

public WebElement select_field(){
	
	return select_field;
	
}




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
