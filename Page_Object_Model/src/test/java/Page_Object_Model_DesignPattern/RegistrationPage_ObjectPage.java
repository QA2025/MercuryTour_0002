package Page_Object_Model_DesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class RegistrationPage_ObjectPage {
	
	WebDriver driver;
	
	public RegistrationPage_ObjectPage(WebDriver driver){
		this.driver=driver;
	}
	
	By registration = By.linkText("REGISTER");
	By firstname = By.xpath("//input[@name='firstName']");
	By lastname = By.cssSelector("input[name= 'lastName']");
	By phone = By.name("phone");
	By email = By.name("userName");
	By address = By.name("address1");
	By city = By.name("city");
	By state = By.name("state");
	By postalcode = By.name("postalCode");
	By country = By.name("country");
	By username = By.name("email");
	By password = By.name("password");
	By confirmpassword = By.name("confirmPassword");
	By submit = By.name("submit");
	
	
	public void ClickRegLink()
	{
		driver.findElement(registration).click();
	}
	
	public void FirstName (String fn)
	{
		driver.findElement(firstname).sendKeys(fn);
	}
	
	public void LastName (String ln)
	{
		driver.findElement(lastname).sendKeys(ln);
	}
	
	public void phone (String pn) 
	{
		driver.findElement(phone).sendKeys(pn);
	}
	
	public void email (String mail)
	{
		driver.findElement(email).sendKeys(mail);;
	}
	
	public void address (String address1)
	{
		driver.findElement(address).sendKeys(address1);
	}
	
	public void city (String c)
	{
		driver.findElement(city).sendKeys(c);
	}
	
	public void state (String s)
	{
		driver.findElement(state).sendKeys(s);
	}
	
	public void postalcode (String ps)
	{
		driver.findElement(postalcode).sendKeys(ps);
	}
	
	public void country (String countr)
	{
		WebElement c= driver.findElement(country);
		Select country = new Select(c);
		country.selectByVisibleText(countr);
				
	}
	
	public void username (String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void password (String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void confirmpassword (String cpass)
	{
		driver.findElement(confirmpassword).sendKeys(cpass);
	}
	
	public void submit()
	{
		driver.findElement(submit).click();
	}
}

