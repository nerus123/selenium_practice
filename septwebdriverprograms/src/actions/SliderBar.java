package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderBar {

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
							
							//open the url
							driver.get("http://jqueryui.com/slider/");
							
							//identify the iframe
							WebElement ifrm=driver.findElement(By.className("demo-frame"));
							
							//switch to iframe
							driver.switchTo().frame(ifrm);
							
							System.out.println("sucessfully switched to i frame");
							
							//identify the slide bar
							WebElement slidebar=driver.findElement(By.xpath("//*[@id='slider']"));
							
							//create an object for actions class
							Actions act=new Actions(driver);
							act.dragAndDropBy(slidebar, 200, 0).perform();
							
							Thread.sleep(3000);
							
							
							//close the browser
							driver.quit();
							
							


	}

}
