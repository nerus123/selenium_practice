package rizwaana;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YounglandAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		//set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		WebDriver driver=new ChromeDriver();
		 //maximise the window
		 driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver,60);
		
		  //open url
		driver.get("https://www.amazon.com/");
		
		//verify the page title
		wait.until(ExpectedConditions.titleContains("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
		
		//identify the search edit box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("youngland girls dresess");
				
		//click on torch icon
		driver.findElement(By.xpath("//*[@id='nav-search']/form/div[2]/div/input")).click();
		
		
		//veify the text is presnt or not
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='s-result-count']/span/span")));
		
		System.out.println("text is verified");
		
		//click on reuired frock
		driver.findElement(By.xpath("//*[@id='result_0']/div/div[3]/div[1]/a/h2/span[2]")).click();
		
		 //verify page title
		 wait.until(ExpectedConditions.titleContains("Amazon.com: Youngland Baby Girls' Mixed Print and Eyelet Dress with Knit Shrug: Clothing"));
		 
		 //idenify the drop down
		 WebElement sel_drp=driver.findElement(By.xpath("//*[@id='native_dropdown_selected_size_name']"));
		 
		 //select the size
		 //create an object for Select class
		 Select sel=new Select(sel_drp);
		 
		 //select an option by index
		 sel.selectByValue("2,B019FDSOB4");
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		 
		 Thread.sleep(3000);
		
		
		//close the browser
		driver.quit();
		
		
		
		

	}

}
