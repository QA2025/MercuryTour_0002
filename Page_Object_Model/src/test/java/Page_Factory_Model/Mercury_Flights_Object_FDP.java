package Page_Factory_Model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.apache.logging.log4j.*;

public class Mercury_Flights_Object_FDP {
	
	WebDriver driver;
	SoftAssert softassert=new SoftAssert();
	Logger logger = LogManager.getLogger(Mercury_Flights_Object_FDP.class.getName());
	
	
	public Mercury_Flights_Object_FDP(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText="Flights")
	WebElement flightlink;
	
	@FindAll({
		@FindBy(xpath="//font[@face='Arial, Helvetica, sans-serif']//child::input[1]"),
		@FindBy(xpath="//font[@face='Arial, Helvetica, sans-serif']//child::input[2]")}) //child method for parent use parent
	List<WebElement> triptype;
	
	@FindBy (name="passCount")
	WebElement passengers;
	
	@FindBy (name="fromPort")
	WebElement departingfrom;
	
	@FindBy (xpath="//select[@name='fromMonth']")
	WebElement departmonth;
	
	@FindBy (xpath="//select[@name='fromDay']")
	WebElement departday;
	
	@FindBy (name="toPort")
	WebElement arrivalto;
	
	@FindBy (name="toMonth")
	WebElement arrivalmonth;
	
	@FindBy (name="toDay")
	WebElement arrivalday;
	
	@FindAll({
		@FindBy (css="input[name='servClass']:nth-child(1)"),
		@FindBy (css="input[name='servClass']:nth-child(2)"),
		@FindBy (css="input[name='servClass']:nth-child(4)")})
	List <WebElement> serviceclass;
	
	@FindBy (name="airline")
	WebElement airline;
	
	@FindBy (name="findFlights")
	WebElement findflights;
	
	@Test(priority=1)
	public void flightslink() {
		flightlink.click();
		String pagetitle= driver.getTitle();
		softassert.assertEquals("Find a Flight: Mercury Tours: ", pagetitle);
		System.out.println("Flight Page Title:" +driver.getTitle());
	}
	
	@Test(priority=2)
	public void triptype () {
		triptype.get(1).click();
		triptype.get(0).click();
	}
	
	@Test(priority=3)
	public void passengers(int amountofpass) {
		WebElement pass= passengers;
		Select p=new Select(pass);
		p.selectByIndex(amountofpass);
	}
	
	
	@Test(priority=4)
	public void departurelocation(String departloc) {
		WebElement depart= departingfrom;
		Select d= new Select(depart);
		d.selectByVisibleText(departloc);
	}
	
	@Test(priority=5)
	public void departmonth(String dmonth) {
		WebElement departm=departmonth;
		Select dm= new Select(departm);
		dm.selectByVisibleText(dmonth);
	}
	
	@Test(priority=6)
	public void departday(int dday) {
		WebElement departd=departday;
		Select selectvalue= new Select(departd);
		selectvalue.selectByIndex(dday);
	}
	
	@Test(priority=7)
	public void arrivinglocation(String arrivalloc) {
		WebElement arrival= arrivalto;
		Select selectvalue=new Select(arrival);
		selectvalue.selectByVisibleText(arrivalloc);
	}
	
	@Test(priority=8)
	public void arrivalmonth(String amonth) {
		WebElement arrivalm= arrivalmonth;
		Select selectvalue=new Select(arrivalm);
		selectvalue.selectByVisibleText(amonth);
	}
	
	@Test(priority=9)
	public void arrivalday(int aday) {
		WebElement arrivald= arrivalday;
		Select selectvalue=new Select(arrivald);
		selectvalue.selectByIndex(aday);
	}
	
	@Test(priority=10)
	public void servicetype() {
		serviceclass.get(2).click();
		serviceclass.get(1).click();
		serviceclass.get(0).click();
	}
	
	@Test(priority=11)
	public void airline(String airlinetype) {
		WebElement airlinet= airline;
		Select selectvalue= new Select(airlinet);
		selectvalue.selectByVisibleText(airlinetype);
	}
	
	@Test(priority=12)
	public void completebooking() {
		findflights.click();
	}
	
	@Test(priority=13)
	public void flightdetail_input(int amountofpas, String departloc, String dmonth, int dday, String arrivalloc, String amonth, int aday
			, String airlinetype) {
		this.flightslink();
		this.triptype();
		this.passengers(amountofpas);
		this.departurelocation(departloc);
		this.departmonth(dmonth);
		this.departday(dday);
		this.arrivinglocation(arrivalloc);
		this.arrivalmonth(amonth);
		this.arrivalday(aday);
		this.servicetype();
		this.airline(airlinetype);
		this.completebooking();
	}
}

