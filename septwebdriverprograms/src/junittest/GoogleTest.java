package junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleTest {
public static WebDriver driver=null;
public static WebDriverWait wait=null;
	@BeforeClass
	public static void launchBrowser() throws Exception {
		
		//set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		 driver=new ChromeDriver();
		 //maximize the winow
		 driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		//close the browser
		driver.quit();
		
	}

	@Before
	public void setUp() throws Exception {
		
		//open the url
		driver.get("https://www.google.com/");
			wait=new WebDriverWait(driver,30);
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("@after annotation will execute after every test method");
	}

	@Test
	public void javaSearchTest() {
		//type the java keyword in search edit box
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		driver.findElement(By.id("lst-ib")).submit();
		//verify the page title
		wait.until(ExpectedConditions.titleContains("java - Google Search"));
		
		//click on link
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/h3/a")).click();
		
	}
	@Test
	public void selenumSearchTest(){
		//type the selenium keyword in search edit box
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.findElement(By.id("lst-ib")).submit();
		//verify the page title
		wait.until(ExpectedConditions.titleContains("selenium - Google Search"));
		//click on link Selenium - Web Browser Automation
		driver.findElement(By.linkText("Selenium - Web Browser Automation")).click();
		
		
	}

}
