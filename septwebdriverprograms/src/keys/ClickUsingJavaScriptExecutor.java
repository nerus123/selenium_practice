package keys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickUsingJavaScriptExecutor {
static WebDriver driver=null;
public static void safeJavaScriptClick(WebElement element){
	if(element.isDisplayed()&&element.isEnabled()){
		System.out.println("clicking on elemnt using java script code");
		JavascriptExecutor jsx=(JavascriptExecutor) driver;
		jsx.executeScript("arguments[0].click()", element);
	}else{
		System.out.println("unable to click on element");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
        
		//launch the browser
	 driver=new ChromeDriver();

  //System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		
		//launch the browser
		//WebDriver driver=new FirefoxDriver();
		
		//maximise the window
		driver.manage().window().maximize();
		
		//open the url
		driver.get("https://www.linkedin.com/");
		
		//idenity the forgotten password link
		WebElement frgt_link=driver.findElement(By.linkText("Forgot password?"));
		
		safeJavaScriptClick(frgt_link);
		
		//verify page title
		new WebDriverWait(driver,30).until(ExpectedConditions.titleContains("Password Change | LinkedIn"));
		System.out.println("page title is verified");
		
		//close the browser
		driver.quit();

	}

}
