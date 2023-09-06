package pagesTask1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForthPage extends PageBase{

	public ForthPage(WebDriver drive) {
		super(drive);
	}
	
	By iteminforthpage = By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[7]/div/div/div/a/div");
	By addtocardBTN =By.id("add-to-cart-button");
	public void chooseitem() 
	{
		drive.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		clickButton(iteminforthpage);
	}

	public void additemtocart() 
	{
		clickButton(addtocardBTN);
	}
}
