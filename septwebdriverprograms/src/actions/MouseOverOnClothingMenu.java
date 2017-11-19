package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOverOnClothingMenu {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    
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
							
							//open the url
							driver.get("https://www.flipkart.com/");
							
							//identify the womens menu
							WebElement womens_menu=driver.findElement(By.xpath(" //*[@id='container']/div/header/div[2]/div/ul/li[4]/a/span"));
							
							//create an object for Actions class
							Actions act=new Actions(driver);
							act.moveToElement(womens_menu).perform();
							
							//fetch the text
							//String txt=driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[4]/ul/li/ul/li[1]/ul/li[5]/a/span")).getText();
							//System.out.println(txt);
							Thread.sleep(3000);
							
							//click on clothing
							driver.findElement(By.partialLinkText("jeans")).click();
							//verify the page title
							//create an object for WebDriverWait class
							//WebDriverWait  wait=new WebDriverWait (driver,30);
							//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/h1")));
							//wait.until(ExpectedConditions.titleContains("Women's Jeans "));
							
							//fetch the breadcrum  text
							String txt=driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[1]")).getText();
							System.out.println(txt);
							
							String txt1=driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div[2]/div/div[2]/div/div[1]/div/div[2]")).getText();
							System.out.println(txt1);
							String[] txt2=txt1.split(" ");
							System.out.println(txt2[0]);
							
							//quit the browser
							driver.quit();
						
	}

}
