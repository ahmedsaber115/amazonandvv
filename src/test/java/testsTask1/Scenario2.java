package testsTask1;

import org.testng.annotations.Test;

import pagesTask1.ForthPage;
import pagesTask1.HomePage;
import pagesTask1.TodayDealPage;

public class Scenario2 extends TestBase{
	HomePage homeonject ;
	TodayDealPage dealobject ;
	ForthPage forthobject ;
	@Test(priority = 1)
	public void opentodaysdeal() 
	{
		homeonject = new HomePage(drive);
		homeonject.Opentodaydeals();
	}
	@Test(priority = 2)
	public void filter () 
	{
		dealobject = new TodayDealPage(drive);
		dealobject.choosefilter();
	}
	@Test(priority = 3)
	public void adddiscount()
	{
		dealobject.Discount();
	}
	@Test (priority = 4)
	public void iteminthirdPage() throws InterruptedException 
	{
		dealobject.Openforthpage();
	}
	@Test(priority = 5)
	public void chooseitem() 
	{
		forthobject=new ForthPage(drive);
		forthobject.chooseitem();
	}
	
	@Test(priority = 6) 
	public void addcart() 
	{
		forthobject.additemtocart();
	}
	
}
