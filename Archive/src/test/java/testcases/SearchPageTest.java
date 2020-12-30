package testcases;

import org.testng.annotations.Test;

import pageinitilizer.PageInitilizer;

public class SearchPageTest extends PageInitilizer {
	
	
	@Test
	public void verifyPageTitle() {
		formPage()
		.serachText("intellipaat");
		System.out.println(formPage().getPageTitle(getDriver()));
}
	
	
	

}
