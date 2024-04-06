package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Irtc;

public class Fuction {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();

	}
	
	@BeforeMethod
	public void url() {
		driver.get("https://www.irctctourism.com/");
		
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception {
		Irtc obj=new Irtc(driver);
		obj.url();
	    obj.login();
		
	   obj.title();
		obj.logo();
		
		obj.booking();
		obj.contact();
		obj.faq();
	/*	obj.flightbooking();*/
		obj.aboutus();
		obj.terms();
		obj.screenshot();
		
		
	}

}
