package junittest;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ZkossTest {
	public static WebDriver driver=null;
	public static WebDriverWait wait=null;

	@BeforeClass
	public static void launchBrowser() throws Exception {
		//set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		 driver=new ChromeDriver();
		 wait=new WebDriverWait(driver,30);
		 //maximize the winow
		 driver.manage().window().maximize();
		
	}

	@AfterClass
	public static void closeBrowser() throws Exception {
		
		//close the browser
		driver.quit();
	}

	@Before
	public void setUp() throws Exception {
		//open the url
				driver.get("https://www.zkoss.org/zkdemo/input/date_and_time_picker");
					
				
		
	}

	@After
	public void tearDown() throws Exception {
	System.out.println("@after annotated method will execute after every test metod");
		
	}

	@Test
	public void radioButtonTest (){
		//click on radiobutton link
		driver.findElement(By.xpath("//a[starts-with(text(),'Radio Button')]")).click();
		//verify page title
		wait.until(ExpectedConditions.titleContains("ZK Live Demo - Radio Button"));
		//fetch all radio buttons
		List<WebElement>buttons=driver.findElements(By.className("z-radio"));
		System.out.println(buttons.size());
		for(WebElement b:buttons){
			System.out.println(b.getText());
			if(b.getText().equals("Bug Fixing")){
				b.click();
			}
		}
	}
		@Test
		public void tweetPopUpTest() throws InterruptedException{
			//idenity internal frame
			WebElement ifrm=driver.findElement(By.id("twitter-widget-0"));
			//switch to iiframe
			driver.switchTo().frame(ifrm);
			//click on tweet
			driver.findElement(By.id("l")).click();
			Thread.sleep(3000);
			//fetch all windows
			Set<String>handles=driver.getWindowHandles();
			System.out.println(handles.size());
			
			Iterator it=handles.iterator();
			//fetch the parent window id
			String pid=(String) it.next();
			//fetch the child window
			String cid=(String) it.next();
			//switch to child window
			driver.switchTo().window(cid);
			//idenity usename edit box
			driver.findElement(By.id("username_or_email")).sendKeys("neeraja");
			Thread.sleep(3000);
			
			//check the remember me checkbox
			driver.findElement(By.id("remember")).click();
			
			Thread.sleep(3000);
			
			//close the child window
			driver.close();
			
			//switch to parent window
			driver.switchTo().window(pid);
		}
		
		@Test
		public void fetchButtons(){
			//click on button link on left panel
			driver.findElement(By.xpath("//a[starts-with(text(),'Button')]")).click();
			//verify the page title
			wait.until(ExpectedConditions.titleContains("ZK Live Demo - Button"));
			
			//fetch all buttons into collection
			List<WebElement>buttons=driver.findElements(By.className("z-button"));
			System.out.println(buttons.size());
			for(WebElement b:buttons){
				System.out.println(b.getText());
			}
		}
		@Test
		public void checkBoxTest(){
			//click on check box
			driver.findElement(By.xpath("//a[starts-with(text(),'Checkbox')]")).click();
			//verify pagetitle
			wait.until(ExpectedConditions.titleContains("ZK Live Demo - Checkbox"));
			
			//fetch all check boxes into collection
			List<WebElement>cboxes=driver.findElements(By.className("z-checkbox"));
			for(WebElement c:cboxes){
				System.out.println(c.getText());
			}
		}


	

}
