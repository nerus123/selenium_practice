package keys;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPateForEditBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
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
		
		//identify the email editbox
		WebElement email_editbox=driver.findElement(By.id("login-email"));
		
		email_editbox.clear();
		email_editbox.sendKeys("webdriver");
		
		//select and copy from editbox
		email_editbox.sendKeys(Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		
		//identify firstname editbox
		WebElement frst_edt=driver.findElement(By.id("reg-firstname"));
		frst_edt.clear();
		
		//paste in firstname edit box
		frst_edt.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
	}

}
