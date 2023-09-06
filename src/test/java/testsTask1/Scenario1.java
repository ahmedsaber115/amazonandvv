package testsTask1;

import org.testng.Assert;
import org.testng.annotations.Test;

import pagesTask1.HomePage;
import pagesTask1.SearchPage;

public class Scenario1 extends TestBase{
	HomePage homeobject ;
	SearchPage searchobject ;

	@Test(priority = 1)
	public void OpenSearchpage() throws InterruptedException 
	{
		homeobject = new HomePage(drive);
		homeobject.OpenSearchPage("car accessories");
	}

	@Test(priority = 2)
	public void selectItem()
	{
		searchobject= new SearchPage(drive);
		searchobject.selectitem();

		Assert.assertTrue(drive.findElement(searchobject.succMSG).getText().contains("Added to Cart"));
	}
	
	@Test(priority = 3)
	public void opencardPage() 
	{
		searchobject.opencardPage();
		Assert.assertTrue(drive.findElement(searchobject.checkitemincart).getText().contains("TICARVE Car Cleaning Gel"));
	}

	


}
