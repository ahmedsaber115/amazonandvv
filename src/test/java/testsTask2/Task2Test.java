package testsTask2;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import dataTask2.JsonDataReader;
import pagesTask2.HomePage;
import pagesTask2.SeatsPage;

public class Task2Test extends TestBase {

	HomePage homeobject2 ;
	SeatsPage seatobject;
	@Test(priority = 1)
	public void Choosepopularroute ()
	{
		homeobject2 = new HomePage(drive);
		homeobject2.choosefrompublicRoute();
	}

	@Test(priority = 2)
	public void choosearrivalDate () 
	{
		homeobject2.arrivalDate();
	}

	@Test(priority = 3)
	public void searchBus() 
	{
		homeobject2.searchBus();
	}
	
	@Test (priority = 4)
	public void selectseat ()
	{
		seatobject=new SeatsPage(drive);
		seatobject.selectseat();
	}
	
	@Test(priority = 5)
	public void Details () throws IOException,ParseException 
	{
		JsonDataReader jsonreader =new JsonDataReader();
		jsonreader.jsonReader(System.getProperty("user.dir")+"\\src\\test\\java\\dataTask2\\UserData.json" );
		
		seatobject.fillcustomerANDpassengerdetails(jsonreader.mobileNo, jsonreader.emailid
				, jsonreader.name, jsonreader.age);

	}
}
