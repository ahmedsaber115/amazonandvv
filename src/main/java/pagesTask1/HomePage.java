package pagesTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

	public HomePage(WebDriver drive) {
		super(drive);
	}
	By searchTextBox = By.id("twotabsearchtextbox");
	By searchBTN = By.id("nav-search-submit-button");
	By todaydealsBTN = By.xpath("//*[@id=\"nav-xshop\"]/a[1]");
	public void OpenSearchPage (String searchtext) 
	{
		setTextElementText(searchTextBox, searchtext);
		clickButton(searchBTN);
	}
	
	public void Opentodaydeals() 
	{
		clickButton(todaydealsBTN);
	}

}
