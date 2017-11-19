package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyAndPasteInEditBox {

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
							driver.get("https://www.linkedin.com/");
							
							
							//identify the email edit box
							WebElement email_editbox=driver.findElement(By.id("login-email"));
							email_editbox.clear();
							email_editbox.sendKeys("webdriver");
							
							//select the content and copy
							email_editbox.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
							
							
							//identify the firstname editbox
							WebElement first_editbox=driver.findElement(By.id("reg-firstname"));
							first_editbox.clear();
							first_editbox.sendKeys(Keys.chord(Keys.CONTROL,"v"));
							
							Thread.sleep(3000);
							
							//quit the browser
							driver.quit();
							
							
							

	}

}
