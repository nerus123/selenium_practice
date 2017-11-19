package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeTextUnderlinedOrNot {

	public static void main(String[] args) {
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
		driver.get("https://www.google.com/");
		
		//idenity gmail_link element
		WebElement gmail_link=driver.findElement(By.linkText("Gmail"));
		String txtdc=gmail_link.getCssValue("text-decoration");
		System.out.println("before mouse over:"+txtdc);

		//for mouse over on gmail
		//create an object for Actions class
		Actions act=new Actions(driver);
		
		act.moveToElement(gmail_link).perform();
		String txtamv=gmail_link.getCssValue("text-decoration");
		System.out.println("after mouse over:"+txtamv);
		
		//close the browser
		driver.quit();
	}

}
