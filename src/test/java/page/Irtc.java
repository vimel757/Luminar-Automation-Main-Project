package page;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;



public class Irtc {
WebDriver driver;
String baseurl="https://www.irctctourism.com/";
	
	By exclick=By.xpath("/html/body/app-root/homeheader/header/nav/div/div[2]/div[2]/ul/li[2]/a");
	By guestlogin=By.xpath("//*[@id=\"profile-tab\"]");
	By email=By.xpath("//*[@id=\"modalLRInput12\"]");
	By phone=By.xpath("//*[@id=\"profile\"]/div/form/div[2]/input");
	By login=By.xpath("//*[@id=\"profile\"]/div/form/div[3]/button");
	
	
	By location=By.xpath("/html[1]/body[1]/app-root[1]/tourpkgs[1]/div[2]/div[1]/div[1]/form[1]/div[1]/asearch[1]/input[1]");
	By search=By.xpath("/html[1]/body[1]/app-root[1]/tourpkgs[1]/div[2]/div[1]/div[1]/form[1]/div[3]/button[1]");
	By detail=By.xpath("//body/app-root[1]/tourpackagelist[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]");
	By itinery=By.xpath("//a[@id='Itinerary-tab']");
	By inclusion=By.xpath("//a[@id='Inclusion-tab']");
	By terms=By.xpath(" //a[@id='Terms-tab']");
	By contact=By.xpath("//a[@id='Contact-tab']");
	By book=By.xpath("/html[1]/body[1]/app-root[1]/ng-component[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]");
	By date=By.xpath("/html/body/app-root/tourpackagebooking/div/div[2]/div/div/div/div/form/div[2]/select");
	By contin=By.xpath("/html/body/app-root/tourpackagebooking/div/div[2]/div/div/div/div/form/div[9]/button");
	By acomodation=By.xpath("//*[@id=\"selectID0\"]");
	By booknew=By.xpath("/html/body/app-root/tourpackagebooking/div/div[2]/div/div/div/div/form/div[11]/button");
	By name=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/input[1]");
	By lastname=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[2]/input[1]");
	By age=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/span[1]/input[1]");
	By gender=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/select[1]");
	By name2=By.xpath("/html/body/app-root/passangers/div/div[2]/div/div/div/div/div/form/div[1]/div/table/tbody/tr[2]/td[2]/div/div[1]/input");
	By lastname2=By.xpath("/html/body/app-root/passangers/div/div[2]/div/div/div/div/div/form/div[1]/div/table/tbody/tr[2]/td[2]/div/div[2]/input");
	By age2=By.xpath("/html/body/app-root/passangers/div/div[2]/div/div/div/div/div/form/div[1]/div/table/tbody/tr[2]/td[3]/input");
	By gender2=By.xpath("/html/body/app-root/passangers/div/div[2]/div/div/div/div/div/form/div[1]/div/table/tbody/tr[2]/td[4]/select");
	By boarding =By.xpath("/html/body/app-root/tourpackagebooking/div/div[2]/div/div/div/div/form/div[3]/select");
	
	
	By nomine=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/input[1]");
	By relation=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[3]/input[1]");
	By contacte=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[4]/input[1]");
	By address=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[4]/input[1]");
	By city=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[5]/input[1]");
	By state=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[6]/select[1]");
	By pincode=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[7]/input[1]");
	By cardtype=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[10]/select[1]");
	By cardno=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[11]/input[1]");
	By submit=By.xpath("/html[1]/body[1]/app-root[1]/passangers[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[5]/div[1]/button[2]");
	By termsand=By.xpath("/html/body/app-root/summery/div/div[2]/div/div/div/div/div/form/div[3]/div[1]/div/label/span");
	By home=By.xpath("/html/body/app-root/homeheader/header/nav/div/div[1]/a/img");
	
	By hamburger=By.xpath("//*[@id=\"sidebarCollapse\"]/i");
	By contactnn=By.xpath("//*[@id=\"sidebar\"]/ul/li[16]/a");
	By contactlocation=By.xpath("/html/body/app-root/ng-component/div[2]/div/div/div[1]/div/form/div/div/div[1]/div[2]/select");
	By back=By.xpath("//*[@id=\"dismiss\"]/i");
	
	
	By faq1=By.xpath("//*[@id=\"headingOne\"]/h2/button");
	By faq2=By.xpath("//*[@id=\"headingsix\"]/h2/button");
	By faq3=By.xpath("/html/body/app-root/tourpkgs/div[6]/div/div[4]/a");
	
	
	By flight=By.xpath("/html/body/app-root/tourpkgs/div[2]/div[2]/ul/li[1]/a/div");
	By origin=By.xpath("//*[@id=\"stationFrom\"]");
	By destination=By.xpath("//*[@id=\"stationTo\"]");
	By datek=By.xpath("//*[@id=\"carouselExampleInterval\"]/div[1]/div/div/div[2]/form/div[3]/datepickermodifi/div/div[2]/div[2]/table/tbody/tr[5]/td[3]/span");
	By departuredate=By.xpath("/html[1]/body[1]/app-root[1]/app-index[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/datepickermodifi[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[5]/td[4]/span[1]");
	By searche=By.xpath("//*[@id=\"carouselExampleInterval\"]/div[1]/div/div/div[2]/form/div[6]/button");
	
	By booke=By.xpath("/html/body/app-root/app-oneway/div/main/div/div/div[2]/div[6]/div/div[6]/button");
	By about=By.xpath("/html/body/app-root/homefooter/footer/div/div[1]/div/div/div[6]/div/div[2]/div/div/ul/li[1]/a");
	By termsandcontion=By.xpath("/html/body/app-root/homefooter/footer/div/div[1]/div/div/div[6]/div/div[2]/div/div/ul/li[10]/a");
	
	By screenshot=By.xpath("/html/body/app-root/homeheader/header/nav/div/div[1]/a/img");
	
	
	
	
	
	
	
	
	
	public Irtc(WebDriver driver) {
		this.driver=driver;
	}
	
	/*------connection verification----------*/
	public void url() throws Exception
	{
		URL obj=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection) obj.openConnection();      //main code for link validation
		con.connect();
		
		if(con.getResponseCode()==200)
		{
			System.out.println("valid--->"+baseurl);
		}
		else
		{
			System.out.println("invalid--->"+baseurl);
		}
	}
	/*--------title verification------------------*/
	public void title()
	{
		String title=driver.getTitle();    
		
		String exp="IRCTC Tourism Official Website | Travel & Tour Packages | Bharat Gaurav Tourist Train";
		if(title.equals(exp))
		{
			System.out.println("the title verification is pass");
			
		}
		else
		{
			System.out.println("the title verification is fail");
		}
	}
	
	
	/*------logo verification-----*/
	public void logo()
	{
		
		
		boolean logo = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/homeheader[1]/header[1]/nav[1]/div[1]/div[1]/a[1]/img[1]")).isDisplayed();
		if(logo)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
	}
	

	/*---------------login-------------*/
	
	public void login() throws InterruptedException, IOException 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(exclick).click();
		driver.findElement(guestlogin).click();
		
	
		

	    File f = new File("E:\\newfb.xlsx");
		    FileInputStream fi = new FileInputStream(f);
		    XSSFWorkbook wb = new XSSFWorkbook(fi);
		    XSSFSheet sh = wb.getSheet("Sheet1");
		    System.out.println(sh.getLastRowNum());

		    for (int i = 1; i <= sh.getLastRowNum(); i++) {
		        String username = "", pswd = "";
		        if (sh.getRow(i).getCell(0).getCellType() == CellType.STRING) {
		            username = sh.getRow(i).getCell(0).getStringCellValue();
		        } else if (sh.getRow(i).getCell(0).getCellType() == CellType.NUMERIC) {
		            username = String.valueOf((long) sh.getRow(i).getCell(0).getNumericCellValue());
		        }

		        System.out.println("username=" + username);

		        if (sh.getRow(i).getCell(1).getCellType() == CellType.STRING) {
		            pswd = sh.getRow(i).getCell(1).getStringCellValue();
		        } else if (sh.getRow(i).getCell(1).getCellType() == CellType.NUMERIC) {
		            pswd = String.valueOf((long) sh.getRow(i).getCell(1).getNumericCellValue());
		        }

		        System.out.println("password=" + pswd);

		        driver.findElement(email).sendKeys(username);
		        driver.findElement(phone).sendKeys(pswd);
		        driver.findElement(login).click();
		    }
	}

	
	/*-------------booking----------*/
	
	public void booking() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		Thread.sleep(5000);
		
		driver.findElement(location).sendKeys("kolkata");
		Thread.sleep(5000);
		driver.findElement(search).click();
		Thread.sleep(5000);
		driver.findElement(detail).click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-350)", "");
		Thread.sleep(5000);
		driver.findElement(itinery).click();
		Thread.sleep(2000);
		driver.findElement(inclusion).click();
		Thread.sleep(2000);
		driver.findElement(terms).click();
		Thread.sleep(2000);
		driver.findElement(contact).click();
		Thread.sleep(2000);
		driver.findElement(book).click();
		driver.findElement(date).click();
		WebElement dayint = driver.findElement(date);
		Select obj1=new Select(dayint);
		obj1.selectByIndex(3);
		Thread.sleep(2000);
		driver.findElement(boarding).click();
		WebElement board=driver.findElement(boarding);
		Select obj9=new Select(board);
		obj9.selectByIndex(3);
		Thread.sleep(2000);
		
		JavascriptExecutor jsk = (JavascriptExecutor) driver;
		jsk.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		driver.findElement(contin).click();
		driver.findElement(acomodation).click();
		WebElement accomo = driver.findElement(acomodation);
		Select obj2=new Select(accomo);
		obj2.selectByIndex(3);
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,150)", "");
		driver.findElement(booknew).click();
		driver.findElement(name).sendKeys("rahul");
		driver.findElement(lastname).sendKeys("thomas");
		driver.findElement(age).sendKeys("23");
		driver.findElement(gender).click();
		WebElement genderr = driver.findElement(gender);
		Select obj3=new Select(genderr);
		obj3.selectByIndex(1);
		driver.findElement(name2).sendKeys("ramu");
		driver.findElement(lastname2).sendKeys("raju");
		driver.findElement(age2).sendKeys("7");
		driver.findElement(gender2).click();
		WebElement genderr2 = driver.findElement(gender2);
		Select obj6=new Select(genderr2);
		obj6.selectByIndex(1);
		
		
		
		
		driver.findElement(nomine).sendKeys("vishal");
		driver.findElement(relation).sendKeys("friend");
		driver.findElement(contacte).sendKeys("9123456780");
		JavascriptExecutor jsl = (JavascriptExecutor) driver;
		jsl.executeScript("window.scrollBy(0,200)", "");
		driver.findElement(address).sendKeys("erathupalath");
		driver.findElement(city).sendKeys("kottayam");
		driver.findElement(state).click();
		WebElement statee = driver.findElement(state);
		Select obj4=new Select(statee);
		obj4.selectByIndex(17);
		driver.findElement(pincode).sendKeys("686543");
		driver.findElement(cardtype).click();
		WebElement type = driver.findElement(cardtype);
		Select obj5=new Select(type);
		obj5.selectByIndex(1);
		driver.findElement(cardno).sendKeys("kl3420190017967");
		Thread.sleep(3000);
		driver.findElement(submit).click();
		JavascriptExecutor jsm = (JavascriptExecutor) driver;
		jsm.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(termsand).click();
		Thread.sleep(5000);
		driver.findElement(home).click();
	}
		
		/*----------------contact page--------------*/
		public void contact() throws InterruptedException {
			Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(hamburger).click();
			Thread.sleep(2000);
			driver.findElement(contactnn).click();
			driver.findElement(contactlocation).click();
			WebElement location = driver.findElement(contactlocation);
			Select obj6=new Select(location);
			obj6.selectByIndex(11);
			Thread.sleep(3000);
			driver.findElement(home).click();
			driver.findElement(back).click();
		}
		
		
	/*---------------FAQ PAGE SELECTION-----------*/
		public void faq() throws InterruptedException {
			Thread.sleep(10000);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			JavascriptExecutor jsl = (JavascriptExecutor) driver;
			jsl.executeScript("window.scrollBy(0,1200)", "");
			driver.findElement(faq1).click();
			driver.findElement(faq2).click();
			Thread.sleep(2000);
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("window.scrollBy(0,100)", "");
			driver.findElement(faq3).click();
			Thread.sleep(2000);			
			driver.findElement(home).click();
		
		}
		
		
		
	
	/*---------------ABOUT US--------------------*/
	public void aboutus() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		JavascriptExecutor jsl = (JavascriptExecutor) driver;
		int scrollDistance = 10; // Set the distance to scroll each time
		int totalScroll = 500; // Set the total distance to scroll

		for (int i = 0; i < totalScroll; i += scrollDistance) {
		    jsl.executeScript("window.scrollBy(0," + scrollDistance + ")", "");
		    try {
		        Thread.sleep(100); // Adjust the sleep time to control the scrolling speed
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		}
		driver.findElement(about).click();
		Thread.sleep(3000);
		JavascriptExecutor jslk = (JavascriptExecutor) driver;
		int scrollDistancee = 10; // Set the distance to scroll each time
		int totalScrolll = 750; // Set the total distance to scroll

		for (int i = 0; i < totalScroll; i += scrollDistance) {
		    jsl.executeScript("window.scrollBy(0," + scrollDistance + ")", "");
		    try {
		        Thread.sleep(100); // Adjust the sleep time to control the scrolling speed
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		}
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	
	/*-------------terms and condition-----------*/
	public void terms() throws InterruptedException {
	    // Store the handle of the current window
	    String oldWindowHandle = driver.getWindowHandle();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

	    JavascriptExecutor jsl = (JavascriptExecutor) driver;
	    int scrollDistance = 10;
	    int totalScroll = 500;
	    
	    boolean termsClicked = false; // Flag to track if terms have been clicked

	    for (int i = 0; i < totalScroll; i += scrollDistance) {
	        jsl.executeScript("window.scrollBy(0," + scrollDistance + ")", "");
	        try {
	            Thread.sleep(100); 
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        // Check if terms have been clicked, if not, click them
	        if (!termsClicked) {
	            driver.findElement(termsandcontion).click();
	            Thread.sleep(2000);
	            termsClicked = true; // Update flag to indicate terms have been clicked
	        }
	    }
	    
	    // Switch back to the old window after the loop finishes
	    driver.switchTo().window(oldWindowHandle);
	    Thread.sleep(5000);
	    JavascriptExecutor jsk = (JavascriptExecutor) driver;
		jsk.executeScript("window.scrollBy(0,-2300)", "");
	    
	}
	
	
	/*------------------Screenshot----------------*/
	public void screenshot() throws IOException, InterruptedException {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 Thread.sleep(5000);
		 WebElement screen = driver.findElement(screenshot);
		 File src=screen.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("./Screenshot//railimage.png"));
		
	}

	    
	 
	   
	}

		   
		    
		    
		
		
	
	
	
	
	
	
	
		
	
			
		
		
		
		
		
		
	
	
	

