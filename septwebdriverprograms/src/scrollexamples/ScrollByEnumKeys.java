package scrollexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByEnumKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			///set the chromedriver path
			System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
	              
			//launch the browser
			WebDriver driver=new ChromeDriver();
			
			//maximise the window
			driver.manage().window().maximize();
			
		
		
		//open the url
		driver.get("https://www.linkedin.com/");
		
		
	}

}
