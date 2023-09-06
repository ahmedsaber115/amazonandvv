package pagesTask1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TodayDealPage extends PageBase {

	public TodayDealPage(WebDriver drive) {
		super(drive);
		js=(JavascriptExecutor) drive ;
	}
	By GroceryCheckboxBTN = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[19]/label/input");
	By HeadphoneCheckboxBTN=By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[20]/label/input");
	By discountcheckboxBTN = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/ul/li[2]/div/a/span");
	By forthpageBTN = By.xpath("//*[@id=\"dealsGridLinkAnchor\"]/div/div[3]/div/ul/li[5]");

	public void choosefilter() 
	{
		clickButton(GroceryCheckboxBTN);
		drive.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		clickButton(HeadphoneCheckboxBTN);
	}
	public void Discount ()
	{
		drive.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		clickButton(discountcheckboxBTN);
		drive.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	public void Openforthpage() throws InterruptedException 
	{
		scrollingPageToBottom();
		drive.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		clickButton(forthpageBTN);
		
	}

}
