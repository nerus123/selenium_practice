package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		///set the chromedriver path
				System.setProperty("webdriver.chrome.driver", "C:\\NEERAJA\\chromedriver_win32\\chromedriver.exe");
		              
				//launch the browser
				WebDriver driver=new ChromeDriver();
				
				//maximise the window
				driver.manage().window().maximize();
				
				//open the url
				driver.get("http://only-testing-blog.blogspot.in/2014/01/textbox.html");
				
				//click on show me alert button
				driver.findElement(By.xpath("//input[@value='Show Me Alert']")).click();
				
				//handle the alert
				Alert alt=driver.switchTo().alert();
				System.out.println(alt.getText());
				alt.accept();
				Thread.sleep(3000);
				//quit the browser
				driver.quit();
	}

}
