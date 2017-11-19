package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLogoutDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		//launch the browser
		 //WebDriver driver=new ChromeDriver();
		 //maximise the window
		//set the gcekodriver path
				System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
				
				//launch the browser
				WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 WebDriverWait wait=new WebDriverWait(driver,30);
		 //open url
		 driver.get("https://www.facebook.com/");
		 //identify emailorphone edit box
		  driver.findElement(By.id("email")).sendKeys("nerus123@gmail.com");
		  //iddenity password edit box
		  driver.findElement(By.id("pass")).sendKeys("cherry123");
		  
		  //click on login
		  driver.findElement(By.id("loginbutton")).click();
		  Thread.sleep(3000);
		  //click for logout
		  driver.findElement(By.id("userNavigationLabel")).click();
		
		 wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out")));
		  driver.findElement(By.linkText("Log Out")).click();
		  //close the browser
		  driver.quit();
				  

	}

}
