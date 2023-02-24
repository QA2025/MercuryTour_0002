package Page_Object_Model_DesignPattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationPage_OperationsPage {
	
	public static WebDriver driver;
	public static RegistrationPage_ObjectPage RPOP; 
	
	@BeforeTest
	@SuppressWarnings("deprecation")
	public void ExecuteTest(){
		
		WebDriverManager.edgedriver().setup();
		driver =new EdgeDriver();
		RPOP = new RegistrationPage_ObjectPage(driver);
		
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}	
	
	@Test (priority= 1, groups="Functional Testing", description="Data input for registration.")
	public void datainput () {	
		RPOP.ClickRegLink();
		RPOP.FirstName("Zoro");
		RPOP.LastName("Roronoa");
		RPOP.phone("4562164541");
		RPOP.email("zorosama16@wano.com");
		RPOP.address("21 savage st");
		RPOP.city("Ginza");
		RPOP.state("Tokyo");
		RPOP.postalcode("21654");
		RPOP.country("JAPAN");
		RPOP.username("Zorosama16");
		RPOP.password("dontlook");
		RPOP.confirmpassword("dontlook");
		RPOP.submit();
	}	
	
	@AfterTest
	public void closingbrowser() {
		driver.close();
	}
}
