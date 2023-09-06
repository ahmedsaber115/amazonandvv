package pagesTask2;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class HomePage extends PageBase {

	public HomePage(WebDriver drive) {
		super(drive);
		js=(JavascriptExecutor) drive ;

	}

	By choosenLink = By.xpath("//*[@id=\"routeSlider\"]/div/div[2]/div/div/ul/li[1]/a");
	By changearrow = By.xpath("//*[@id=\"routeSlider\"]/div/a[2]/span[1]");
	By arrivaldate = By.cssSelector("a.ui-state-default");
	By searchbusBTN = By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button");

	public void choosefrompublicRoute () 
	{
		if (drive.findElement(choosenLink).isDisplayed()) 
		{
			clickButton(choosenLink);
		}
		else 
		{
			drive.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			clickButton(changearrow);
			drive.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			clickButton(choosenLink);
		}
	}

	public void arrivalDate () 
	{
		clickButton(arrivaldate);
	}

	public void searchBus() 
	{
		scrollingPageToBottom();
		FluentWait<WebDriver>wait = new FluentWait<WebDriver>(drive)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofMillis(5000))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(searchbusBTN));
		clickButton(searchbusBTN);
		drive.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}

}
