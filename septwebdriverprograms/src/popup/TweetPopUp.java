package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TweetPopUp {

	public static void main(String[] args) {
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
							//1)open the https://www.zkoss.org/zkdemo/input/date_and_time_picker url
							driver.get("https://www.zkoss.org/zkdemo/input/date_and_time_picker");
							
								//2)handle the iframe of tweet
							
								//3)click on tweet text
								//4)switch to the child window
								//5)type the username value in popup
								//6)check the checkbox in popup
								//7)close the child window
								//8)switch back to parent window..
								//9)select the date from datepicker...
							

	}

}
