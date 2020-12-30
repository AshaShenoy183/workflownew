package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import main.MainDriverClass;

public class SearchPageObject extends MainDriverClass {

	@FindBy(css = "#sb_form #sb_form_q")
	WebElement searchInputField;
	
	@FindBy(css = "#sb_form label[for='sb_form_go']")
	WebElement seachIcon;
	
	
	public SearchPageObject serachText(String inputValue) {
		searchInputField.sendKeys(inputValue);
		seachIcon.click();
		return this;
	}
	
	public String getPageTitle(WebDriver driver) {
		return driver.getTitle();
	}
	
	

	
	
	
	
	
}
