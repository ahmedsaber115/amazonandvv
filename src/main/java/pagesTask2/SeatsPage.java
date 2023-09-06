package pagesTask2;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class SeatsPage extends PageBase {

	public SeatsPage(WebDriver drive) {
		super(drive);
		js=(JavascriptExecutor) drive ;
	}
	By selectseatBTN = By.xpath("//*[@id=\"SrvcSelectBtnForward0\"]");
	By chooseseatnum = By.xpath("//*[@id=\"Forward120\"]/span");
	
	By collapseBTN = By.xpath("//*[@id=\"passenger-details\"]/div/p/a");

	By mobiletext = By.id("mobileNo");
	By emailidtext = By.id("email");
	By nametext = By.id("passengerNameForward0");
	By agetext = By.id("passengerAgeForward0");
	By CustomerdetailBTN = By.id("Forwardprofile-tab");

	By genderlist = By.id("genderCodeIdForward0");
	By concessionList =By.xpath("//*[@id=\"concessionIdsForward0\"]");
	By nationalituList = By.id("nationalityForward0");
	By makepayBTN = By.id("PgBtn");
	public void selectseat()
	{
		scrollingPageToBottom();
		FluentWait<WebDriver>wait = new FluentWait<WebDriver>(drive)
				.withTimeout(Duration.ofSeconds(32))
				.pollingEvery(Duration.ofMillis(8000))
				.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(selectseatBTN));
		clickButton(selectseatBTN);
		scrollingPageToBottom();
		drive.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		clickButton(chooseseatnum);
	}

	public void fillcustomerANDpassengerdetails(String mobileNo , String emailid ,String name ,String age) 
	{
		clickButton(CustomerdetailBTN);
		setTextElementText(mobiletext, mobileNo);
		setTextElementText(emailidtext, emailid);
		clickButton(collapseBTN);
		setTextElementText(nametext, name);
		setTextElementText(agetext, age);

		select=new Select(drive.findElement(genderlist));
		select.selectByVisibleText("MALE");

		select=new Select(drive.findElement(concessionList));
		select.selectByIndex(0);

		select=new Select(drive.findElement(nationalituList));
		select.selectByVisibleText("Egypt");
		clickButton(makepayBTN);

	}


}
