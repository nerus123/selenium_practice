package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOverFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///set the chromedriver path
		System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
			              
					//launch the browser
					WebDriver driver=new ChromeDriver();
			
			  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
					
					//launch the browser
					//WebDriver driver=new FirefoxDriver();
					
					//maximise the window
					driver.manage().window().maximize();
					
					//implicit wait
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					
					//open the url
					driver.get("https://www.flipkart.com/");
					
					
					//identify the electronics 
					WebElement Electronicsmenu=driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span"));
					
					//create object for Actions class
					Actions act =new Actions(driver);
					
					//mouse over on electronics tab
					act.moveToElement(Electronicsmenu).perform();
					Thread.sleep(3000);
					
					
					//fetch the text
					String txt=driver.findElement(By.partialLinkText("Samsung")).getText();
					System.out.println(txt);
					
					//clcik on samsung link
					driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a/span")).click();
					
					
					//verify page title
					WebDriverWait wait=new WebDriverWait(driver,50);
					
					//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='container']/div/div[1]/div/div/div[3]/div/div/div[1]/div[1]/div/h2")));
					
					wait.until(ExpectedConditions.titleContains("Samsung Mobiles"));
					System.out.println("page verified");
					
					Thread.sleep(3000);
					
					//<title>Samsung J7 Max - Buy Products Online at Best Price in India | Flipkart.com</title>
					
				//get the breadcum text	
					
					
                        //close the browser
					//driver.quit();
	}

}
