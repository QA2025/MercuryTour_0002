package Page_Factory_Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Mercury_Registration_Object_FDP {
	
	WebDriver driver;
	
	public Mercury_Registration_Object_FDP (WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	//FindBy method 1 (not best practice)
	@FindBy(how = How.LINK_TEXT, using="REGISTER")
	WebElement registrationlink;
	
	//FindBy method 2 (best Practice)
	@FindBy(name="firstName")
	WebElement firstname;
	
	@FindBy(name="lastName")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phone;
	
	@FindBy(name="userName")
	WebElement email;
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy (name="state")
	WebElement state;
	
	@FindBy (name="postalCode")
	WebElement postalcode;
	
	@FindBy (name="country")
	WebElement country;
	
	@FindBy (name="email")
	WebElement username;
	
	@FindBy (name="password")
	WebElement password;
	
	@FindBy (name="confirmPassword")
	WebElement confirmpassword;
	
	@FindBy (name="submit")
	WebElement submit;
	
	@Test(priority=1)
	public void registrationlink(){
		registrationlink.click();
	}
	
	@Test(priority=2)	
	public void pagetitle (){
		String pagetitle= driver.getTitle();
		System.out.println(pagetitle);
	}
	
	@Test(priority=3)
	public void firstname(String fn){
		firstname.sendKeys(fn);
	}
	
	@Test(priority=4)
	public void lastname(String ln){
		lastname.sendKeys(ln);
	}
	
	@Test(priority=5)
	public void phone(String ph){
		phone.sendKeys(ph);
	}
	
	@Test(priority=6)
	public void email(String e){
		email.sendKeys(e);
	}
	
	@Test(priority=7)
	public void address(String ad){
		address.sendKeys(ad);
	}
	
	@Test(priority=8)
	public void city(String c){
		city.sendKeys(c);
	}
	
	@Test(priority=9)
	public void state(String s){
		state.sendKeys(s);
	}
	
	@Test(priority=10)
	public void postalcode(String pc){
		postalcode.sendKeys(pc);
	}
	
	@Test(priority=11)
	public void country(String countr){
		WebElement countryS = country;
		Select selectinput =new Select(countryS);
		selectinput.selectByVisibleText(countr);
	}
	
	@Test(priority=12)
	public void username(String uname){
		username.sendKeys(uname);
	}
	
	@Test(priority=13)
	public void password(String pw){
		password.sendKeys(pw);
	}
	
	@Test(priority=14)
	public void confirmpassword(String cpw){
		confirmpassword.sendKeys(cpw);
	}
	
	@Test(priority=15)
	public void submit(){
		submit.click();
	}
	
	@Test(priority=16)
	public void registration_dataipnut(String fn, String ls, String ph, 
			String e, String ad, String c, String s, String pc, String countr,
			String un, String pw, String cpw) {
		
		this.registrationlink();
		this.pagetitle();
		this.firstname(fn);
		this.lastname(ls);
		this.phone(ph);
		this.email(e);
		this.address(ad);
		this.city(c);
		this.state(s);
		this.postalcode(pc);
		this.country(countr);
		this.username(un);
		this.password(pw);
		this.confirmpassword(cpw);
		this.submit();			
	}
}
