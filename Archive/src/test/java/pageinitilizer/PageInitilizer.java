package pageinitilizer;

import org.openqa.selenium.support.PageFactory;

import main.MainDriverClass;
import pageobject.SearchPageObject;

public class PageInitilizer  extends MainDriverClass{

	
	
	public SearchPageObject formPage() {
		
		return PageFactory.initElements(getDriver(), SearchPageObject.class);
	}
	
	
	
	
	
}
