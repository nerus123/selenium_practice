package keys;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.WrapsDriver;

public class TypeWithoutUsingSendkeys {

	public static WebDriver driver=null;
	
	public static void setAttribute(WebElement element,String attributeName,String value){
		WrapsDriver wrappedElement=(WrapsDriver) element;
		JavascriptExecutor jsx=(JavascriptExecutor) wrappedElement.getWrappedDriver();
		jsx.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])", element,attributeName,value);
	}
		public static void main(String[] args) throws InterruptedException {
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
		
		//idenity email edit box
		WebElement email_editbox=driver.findElement(By.id("login-email"));
		setAttribute(email_editbox,"value","nerus123@gmail.com");
		Thread.sleep(3000);
		//close the browser
		driver.quit();
		
		
	}

}
