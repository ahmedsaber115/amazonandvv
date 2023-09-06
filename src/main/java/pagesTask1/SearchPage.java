package pagesTask1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends PageBase{

	public SearchPage(WebDriver drive) {
		super(drive);
	}
	By addtocardBTN =By.id("add-to-cart-button");
	By gotocardBTN = By.cssSelector("a.a-button-text");
	public By succMSG = By.xpath("//*[@id=\"NATC_SMART_WAGON_CONF_MSG_SUCCESS\"]/span");
	public By checkitemincart = By.cssSelector("span.a-truncate-cut");

	public void selectitem ()
	{
		drive.get("https://www.amazon.com/TICARVE-Cleaning-Detailing-Interior-Assecories/dp/B0988X73FW/ref=sr_1_5?keywords=car%2Baccessories&qid=1693910072&sr=8-5&th=1");
		clickButton(addtocardBTN);
	}

	public void opencardPage () 
	{
		clickButton(gotocardBTN);
	}

}
