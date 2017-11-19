package MyPackage;
import org.openqa.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;


public class MyFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\NEERAJA\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		driver.quit();
			
	}

}
