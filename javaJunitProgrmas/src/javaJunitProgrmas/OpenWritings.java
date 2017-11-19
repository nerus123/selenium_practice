package javaJunitProgrmas;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenWritings {
	//declare static variables;
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//set the chrome driver path
		System.setProperty("webdriver.chrome.driver","C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		driver=new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//creating webdriver instance
		wait=new WebDriverWait(driver,30);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after each test method this block will be executed");
	}

	@Test
	public void test() {
	driver.get("http://openwritings.net/sites/default/files/radio_checkbox.html");
	//verify the title
	wait.until(ExpectedConditions.titleIs("Test Page: Radio buttons / Check boxes"));
	}

}
