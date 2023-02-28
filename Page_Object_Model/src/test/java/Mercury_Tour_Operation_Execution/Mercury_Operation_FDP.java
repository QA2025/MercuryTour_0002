package Mercury_Tour_Operation_Execution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Page_Factory_Model.Mercury_Flights_Object_FDP;
import Page_Factory_Model.Mercury_Registration_Object_FDP;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Mercury_Operation_FDP {
	
	EdgeDriver driver;
	Mercury_Registration_Object_FDP X;
	Mercury_Flights_Object_FDP Y;
	
	@SuppressWarnings("deprecation")
	@BeforeTest
	public void Setup() {
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
		X = new Mercury_Registration_Object_FDP(driver);
		Y= new Mercury_Flights_Object_FDP(driver);
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	@Test(priority=1, groups= "Functional Testing", description="TEST DESCRIPTION: Mercury Tour Registration")
	public void registertoMercury() {
		X.registration_dataipnut("Zoro", "Roranoa", "4562164541", "zorosama16@wano.com", "21 savage st",
				"Ginza", "Tokyo", "21654", "JAPAN", "Zorosama16", "dontlook", "dontlook");
	}
	
	@Test(priority=2, groups= "Functional Testing", description="TEST DESCRIPTION: Mercury Tour Flights")
	public void selectflights() {
		Y.flightdetail_input(3,"London", "November", 28, "New York", "February", 15, "Unified Airlines");
	}
	
	@AfterTest
	public void closingbrowser() {
		driver.close();
		driver.quit();
		System.out.println("Test is complete.");
	}
}
