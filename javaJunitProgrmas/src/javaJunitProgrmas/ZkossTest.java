package javaJunitProgrmas;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ZkossTest {
	//declare static variables
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;

	@BeforeClass
	public static void launchBrowser() throws Exception {
		//set the geckodriverpath
		//System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
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
		//open url
		driver.get("https://www.zkoss.org/zkdemo/input/date_and_time_picker");
		//wait and verify page title
		wait.until(ExpectedConditions.titleContains("ZK Live Demo - Date and Time Picker"));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after each test method this block will be executed");
	}

	@Test
	public void testButton() {
		//click on button link left panel
		driver.findElement(By.xpath("//a[starts-with(text(),'Button')]")).click();
		//verify the page title
		wait.until(ExpectedConditions.titleContains("ZK Live Demo - Button"));
		//find all buttons in to collectio
		List<WebElement>btnlist=driver.findElements(By.className("z-button"));
		for(WebElement b:btnlist){
			System.out.println(b.getText());
		}
		
	
	}

	@Test
	public void testCheckbox(){
		//click on checkbox button  link in left side
		driver.findElement(By.partialLinkText("Checkbox")).click();
		//verify the page title
		wait.until(ExpectedConditions.titleContains("ZK Live Demo - Checkbox"));
		//fetch all the checkboxes
		List<WebElement>chkbxlist=driver.findElements(By.className("z-checkbox-content"));
		
		for(WebElement c:chkbxlist){
			if(c.getText().equals("Table")){
			c.click();
		}
	}
}
}